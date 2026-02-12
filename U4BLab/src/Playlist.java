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
}
