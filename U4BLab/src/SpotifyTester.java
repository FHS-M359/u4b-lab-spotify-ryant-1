import java.util.InputMismatchException;
import java.util.Scanner;

public class SpotifyTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Playlist p1 = new Playlist();
        p1.intitializePlaylist();

        boolean validInput = false;
        int input = 0;

        //Repeats giving the player instructions and letting them input a value
        //Uses a try catch to prevent anything from crashing
        while(!validInput) {
            try {
                p1.giveOptions();
                input = scan.nextInt();
                scan.nextLine();
                //Makes sure the input fits qualifications.
                if(input < 1 || input > 7) {
                    System.out.println("Invalid Input: Number wasn't within range of values");
                } else if (input == 7) {
                    break;
                }
                else {
                    System.out.println("You've selected " + input);
                    p1.sendInput(input, scan);
                }
            } catch (InputMismatchException e) {
                //Prevents a crash due to inputting a string instead of a integer.
                System.out.println("Invalid Input: Input an integer");
                scan.nextLine();
            }
        }
        scan.close();


    }
}
