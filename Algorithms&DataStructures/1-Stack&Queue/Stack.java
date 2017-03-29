import java.util.Objects;
public class Stack implements Sequence {
    private static final int MAX = 100;
    private Object[] data;
    private int i;

    public Stack(){
        data = new Object[MAX];
        i = -1;
    }

    @Override
    public void add(Object obj){
        if (i < MAX) {
            i++;
            data[i] = obj;
        }
    }

    @Override
    public Object pop() {
        Object obj = data[i];
        i--;
        return obj;
    }

    @Override
    public Object peak(){
        Object obj = data[i];
        return obj;
    }

    @Override
    public int size() {
        return i + 1;
    }
}
