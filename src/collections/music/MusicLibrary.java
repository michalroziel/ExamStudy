package collections.music;

import java.util.*;
import java.util.stream.Collectors;

public class MusicLibrary {

    TreeSet<Song> songs ;


    public MusicLibrary() {
        songs = new TreeSet<>();

    }

    public TreeSet<Song> getSongs() {
        return songs;
    }


    public void addSong(Song song){
        songs.add(song);
    }

    public void removeSong(Song song){
        songs.remove(song);
    }

    // After
    public Map<String, List<Song>> topTwoSongsByGenre() {

        return songs.stream()
                .collect(Collectors.groupingBy(
                        Song::getGenre,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                (List<Song> list) -> list.stream()
                                        .sorted(Comparator.comparing(Song::getRating).reversed())
                                        .limit(2)
                                        .collect(Collectors.toList())
                        )
                ));



    }




}
