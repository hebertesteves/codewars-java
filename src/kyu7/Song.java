package kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Song {
    private String title;
    private String artist;
    private List<String> heardPeople = new ArrayList<>();

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

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

    public int howMany(List<String> list) {
        int count = 0;

        for (String person : list) {
            String name = person.toLowerCase();
            if (!heardPeople.contains(name)) {
                heardPeople.add(name);
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Song song = new Song("Mount Moose", "The Snazzy Moose");
        System.out.println( song.howMany(new ArrayList<String>(Arrays.asList("Jack", "jacK"))));
        System.out.println( song.howMany(new ArrayList<String>(Arrays.asList("John", "Fred", "Bob", "Carl", "RyAn"))));
        System.out.println( song.howMany(new ArrayList<String>(Arrays.asList("John", "joHN", "carl"))));

    }
}


