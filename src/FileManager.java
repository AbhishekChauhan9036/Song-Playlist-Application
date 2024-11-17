import java.io.*;
import java.util.ArrayList;

public class FileManager {
    public static void savePlaylist(Playlist playlist, String filePath) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(playlist);
        }
    }

    public static Playlist loadPlaylist(String filePath) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (Playlist) ois.readObject();
        }
    }
}
