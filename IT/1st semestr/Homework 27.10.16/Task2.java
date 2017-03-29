
import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        Random random = new Random();
        long[] array = new long[random.nextInt(7)+3];
        System.out.println("The size of array is " + array.length);
        for (int i = 0; i < 2; i++) {
            array[i] = random.nextInt(10);
        }
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 2] * array[i - 1];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}