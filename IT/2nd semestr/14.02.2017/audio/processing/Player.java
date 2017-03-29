package febrary14.audio.processing;

public interface Player {
    void play();
    void pause();
    void stop();
    void pickTrack(int numberOfTrack);
    boolean isTrackPicked();
}
