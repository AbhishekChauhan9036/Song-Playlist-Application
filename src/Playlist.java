import java.util.ArrayList;
import java.util.Comparator;

public class Playlist {
    private String name;
    private ArrayList<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(String title) {
        songs.removeIf(song -> song.getTitle().equalsIgnoreCase(title));
    }

    public void sortByTitle() {
        songs.sort(Comparator.comparing(Song::getTitle));
    }

    public void displaySongs() {
        for (Song song : songs) {
            System.out.println(song);
        }
    }

    // Getters and other methods
    public ArrayList<Song> getSongs() {
        return songs;
    }

    public String getName() {
        return name;
    }
}
