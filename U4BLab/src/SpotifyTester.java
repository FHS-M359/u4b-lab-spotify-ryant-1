import java.util.InputMismatchException;
import java.util.Scanner;

public class SpotifyTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Playlist p1 = new Playlist();
        p1.intitializePlaylist();

        boolean plrQuit = false;

        while(!plrQuit) {
            try {
                p1.giveOptions();
                int input = scan.nextInt();
                scan.nextLine();
                if(input < 1 || input > 7) {
                    System.out.println("Invalid Input: Number wasn't within range of values");
                }


            } catch (InputMismatchException e) {
                System.out.println("Invalid Input: Input an integer");
            }
        }

    }
}
