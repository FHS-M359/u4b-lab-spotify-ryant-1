import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public  class Playlist {
    //Name, Band, Album, Year, Genre
    private ArrayList<Song> songs = new ArrayList<Song>();
    private Scanner scan;

    public Playlist() {
        try {
            scan = new Scanner(new File("U4BLab/spotify_unique_years_artists.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void intitializePlaylist() {
        while(scan.hasNextLine()) {
            String temp = scan.nextLine();
            String[] tempArr = temp.split(",", 0);
            songs.add(new Song(tempArr[0], tempArr[1], tempArr[2], Integer.parseInt(tempArr[4]), tempArr[5], Integer.parseInt(tempArr[3])));
        }
    }

    public void giveOptions() {
        System.out.println("==== Spotify Menu ====");
        System.out.println("1. Sort by Artist (A -> Z)");
        System.out.println("2. Sort by Artist (Z -> A)");
        System.out.println("3. Sort by Year (oldest -> newest)");
        System.out.println("4. Sort by Year (newest -> oldest)");
        System.out.println("5. Search by genre");
        System.out.println("6. Display all songs");
        System.out.println("7. Quit");
        System.out.println("Input (1-7)");
    }

    public void sendInput(int input) {
        if(input == 1) {

        }
        else if(input == 2) {

        }
        else if(input == 3) {

        }
        else if(input == 4) {

        }
        else if(input == 5) {

        }
        else if(input == 6) {
            displaySongs(songs);
        }
    }

    public void displaySongs(ArrayList<Song> tempSongs) {
        System.out.println(String.format("%-30s %-20s %-30s %-12s %-15s %-12s", "Song Name", "Band Name", "Album Name", "Year", "Genre", "Song Length"));
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        for(Song i: tempSongs) {
            System.out.println(i);
        }
    }
}
