public class Song {
    //Name, Band, Album, Year, Genre
    private String name = "";
    private String band = "";
    private String album = "";
    private int year = 0;
    private String genre = "";
    private int songLength = 0;

    public Song(String name, String band, String album, int year, String genre, int songLength) {
        this.name = name;
        this.band = band;
        this.album = album;
        this.year = year;
        this.genre = genre;
        this.songLength = songLength;
    }

    public String toString() {
        return name + ", " + band + ", " + album + ", " + songLength + ", " + year + ", " + genre;
    }
}
