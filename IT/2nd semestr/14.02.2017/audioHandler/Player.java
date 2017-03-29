package febrary14.audioHandler;

public interface Player {
    void play();
    void pause();
    void stop();
    void pickTrack(int numberOfTrack);
    boolean isTrackPicked();
}
