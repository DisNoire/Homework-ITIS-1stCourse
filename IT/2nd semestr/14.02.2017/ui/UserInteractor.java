package febrary14.ui;

public interface UserInteractor {
    String readCommand() throws UserInteractorReadException;
    int readTrackNumber();
    void print(String output);
}
