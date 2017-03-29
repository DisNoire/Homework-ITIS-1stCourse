
public interface Sequence<T> {
    void push(T obj);

    T pop();

    int size();
}