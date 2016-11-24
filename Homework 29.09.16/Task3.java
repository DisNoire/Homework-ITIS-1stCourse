import java.util.Arrays;
import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        int [] b = new int[10];
        int [] c = new int[10];
        fillArray(b);
        fillArray(c);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println();
        for (int j = 0; j<10;j++) {
            boolean e = false;
            for (int i = 0; i < b.length; i++) {
                if (b[i] == c[j]) {
                    System.out.println("c["+j+"]:"+"First enter:" + i);
                    e = true;
                    break;
                }
            }
            if (!e) System.out.println("c["+j+"]:"+"No enters");
        }
    }

    public static int[] fillArray (int a[]){
        Random random = new Random();
        for (int i = 0; i<a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }
}
