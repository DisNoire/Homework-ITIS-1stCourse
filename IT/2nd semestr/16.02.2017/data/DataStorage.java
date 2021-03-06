package febrary16.data;

import java.io.File;
import java.net.URI;
import java.util.Set;

public interface DataStorage {
    boolean add(URI uri);

    void read(URI uri);

    boolean remove(URI uri);

    Set<File> getFileSet();

    void clear();
}
