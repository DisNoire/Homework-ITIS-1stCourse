package febrary9.data;

import java.util.ArrayList;


public class MemoryStorage implements Db {
    ArrayList memoryStorage;

    public MemoryStorage() {
        memoryStorage = new ArrayList();
    }

    @Override
    public void save(Object obj) throws DbException {
        memoryStorage.add(obj);
    }

    @Override
    public Object[] findAll() throws DbException {
        return memoryStorage.toArray();
    }
}
