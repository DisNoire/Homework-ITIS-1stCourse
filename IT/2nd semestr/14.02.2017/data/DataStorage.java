package febrary14.data;

import java.io.File;
import java.net.URI;
import java.util.Set;

public interface DataStorage {
    Set<File> scan(URI uri);

    void read(URI uri);

    Set<File> remove(URI uri);
}
