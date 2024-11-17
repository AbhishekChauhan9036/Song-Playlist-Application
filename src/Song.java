public class Song {
    private String title;
    private String artist;
    private String album;
    private double duration; // Duration in minutes

    public Song(String title, String artist, String album, double duration) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Artist: " + artist + ", Album: " + album + ", Duration: " + duration + " mins";
    }

    // Getters and Setters
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

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
