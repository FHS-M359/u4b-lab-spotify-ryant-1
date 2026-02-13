import java.util.InputMismatchException;
import java.util.Scanner;

public class SpotifyTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Playlist p1 = new Playlist();
        p1.intitializePlaylist();

        boolean validInput = false;
        int input = 0;

        while(!validInput) {
            try {
                p1.giveOptions();
                input = scan.nextInt();
                scan.nextLine();
                if(input < 1 || input > 7) {
                    System.out.println("Invalid Input: Number wasn't within range of values");
                } else if (input == 7) {
                    break;
                }
                else {
                    System.out.println("You've selected " + input);
                    p1.sendInput(input);
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input: Input an integer");
                scan.nextLine();
            }
        }
        scan.close();


    }
}
