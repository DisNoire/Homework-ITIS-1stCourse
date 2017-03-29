
import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        Random random = new Random();
        long[] array = new long[random.nextInt(7)+3];
        System.out.println("The size of array is " + array.length);
        array[0] = random.nextInt(10);
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] * array[i - 1];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
