public class Song implements IComponent {
    String songName;
    String artist;
    float speed;

    public Song(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
    }

    public void play() {
        // play song
    }

    public void setPlaybackSpeed(float speed) {
        System.out.println(String.format("Setting song speed %f", speed));
        this.speed = speed;
    }

    public String getName() {
        return songName;
    }

    public String getArtist() {
        return artist;
    }
}
