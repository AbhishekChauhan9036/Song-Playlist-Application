import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SongPlaylistApp {
    private JFrame frame;
    private JTextField titleField, artistField, albumField, durationField;

    public SongPlaylistApp() {
        frame = new JFrame("Song Playlist App");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel titleLabel = new JLabel("Title:");
        titleLabel.setBounds(10, 20, 80, 25);
        panel.add(titleLabel);

        titleField = new JTextField(20);
        titleField.setBounds(150, 20, 165, 25);
        panel.add(titleField);

        JLabel artistLabel = new JLabel("Artist:");
        artistLabel.setBounds(10, 50, 80, 25);
        panel.add(artistLabel);

        artistField = new JTextField(20);
        artistField.setBounds(150, 50, 165, 25);
        panel.add(artistField);

        // Add labels and text fields for album and duration

        JButton addButton = new JButton("Add Song");
        addButton.setBounds(10, 100, 150, 25);
        panel.add(addButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = titleField.getText();
                String artist = artistField.getText();
                String album = albumField.getText();
                double duration = Double.parseDouble(durationField.getText());

                Song song = new Song(title, artist, album, duration);
                System.out.println("Song Added: " + song);
            }
        });
    }

    public static void main(String[] args) {
        new SongPlaylistApp();
    }
}
