package febrary9.data;


public interface Db {
    public void save(Object obj) throws DbException;
    public Object[] findAll() throws DbException;
}
