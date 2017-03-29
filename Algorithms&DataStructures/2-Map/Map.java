
interface Map {
    void add(String key, Object value);
    Object remove(String key); 
    Object get(String key);
    void set(String key, Object object);
    void removeAll();
    String[] getKeys();
    Object[] getValues();
    int size();

}
