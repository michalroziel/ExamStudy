package collections.music;

import java.util.TreeSet;

public class SongTestDrive {

    public static void main(String[] args) {

        TreeSet<Song> songs = new TreeSet<>();
        songs.add(new Song("Come Together", "The Beatles", "Abbey Road", "Rock", 259, 4.8, 150000, 1969));
        songs.add(new Song("Something", "The Beatles", "Abbey Road", "Rock", 182, 4.9, 120000, 1969));
        songs.add(new Song("Let It Be", "The Beatles", "Let It Be", "Rock", 243, 4.7, 140000, 1970));
        songs.add(new Song("Yesterday", "The Beatles", "Help!", "Rock", 125, 4.9, 180000, 1965));
        songs.add(new Song("Hello", "Adele", "25", "Pop", 295, 4.5, 300000, 2015));
        songs.add(new Song("Rolling in the Deep", "Adele", "21", "Pop", 228, 4.6, 320000, 2011));
        songs.add(new Song("Skyfall", "Adele", "Skyfall", "Soundtrack", 285, 4.7, 250000, 2012));
        songs.add(new Song("Hotel California", "Eagles", "Hotel California", "Rock", 390, 4.8, 200000, 1976));
        songs.add(new Song("Bohemian Rhapsody", "Queen", "A Night at the Opera", "Rock", 354, 4.9, 400000, 1975));
        songs.add(new Song("Another One Bites the Dust", "Queen", "The Game", "Rock", 217, 4.7, 220000, 1980));

        System.out.println(songs);
    }
}
