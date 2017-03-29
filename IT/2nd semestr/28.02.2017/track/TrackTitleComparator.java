
import java.util.Comparator;

public class TrackTitleComparator implements Comparator<Track> {
    @Override
    public int compare(Track o1, Track o2) {
        return o1.getTitle().compareToIgnoreCase(o2.getTitle());
    }
}
