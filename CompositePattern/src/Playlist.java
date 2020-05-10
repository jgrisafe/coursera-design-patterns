import java.util.ArrayList;

public class Playlist implements IComponent {
    String playlistName;
    ArrayList<IComponent> playlist;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.playlist = new ArrayList<IComponent>();
    }

    public void play() {
        System.out.println(String.format("Starting playlist %s", playlistName));
    }

    public void add(IComponent component) {
        playlist.add(component);
    }

    public void remove(IComponent component) {
        playlist.remove(component);
    }

    public void setPlaybackSpeed(float speed) {
        System.out.println(String.format("Setting playlist speed %f", speed));
    }

    public String getName() {
        return playlistName;
    }
}
