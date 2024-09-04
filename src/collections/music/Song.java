package collections.music;

import java.util.TreeSet;

public class Song implements Comparable<Song>{

    private String title;
    private String artist;
    private String album;
    private String genre;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private int length;
    private double rating;
    private int playCount;
    private int year;


    public Song(String title, String artist, String album, String genre, int length, double rating, int playCount, int year) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.length = length;
        this.rating = rating;
        this.playCount = playCount;
        this.year = year;
    }
    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", genre='" + genre + '\'' +
                ", length=" + length +
                ", rating=" + rating +
                ", playCount=" + playCount +
                ", year=" + year +
                '}' + "\n\n";
    }

    // Override compareTo method to sort by artist, then album, then title
    @Override
    public int compareTo(Song other) {
        // Compare by artist
        int artistComparison = this.artist.compareTo(other.artist);
        if (artistComparison != 0) {
            return artistComparison;
        }

        // Compare by album if artists are the same
        int albumComparison = this.album.compareTo(other.album);
        if (albumComparison != 0) {
            return albumComparison;
        }

        // Compare by title if artists and albums are the same
        return this.title.compareTo(other.title);
    }



}
