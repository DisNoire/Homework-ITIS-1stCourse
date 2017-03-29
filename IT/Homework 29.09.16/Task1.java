import java.util.Arrays;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
    	int a[] = new int[10];
        fillArray(a);
        System.out.println(Arrays.toString(a));
        boolean flag;
        do
        {
            flag = false;
            for (int i = 0; i < (a.length - 1); i++)
            {
                if (a[i] > a[i + 1])
                {
                    flag = true;
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        } while(flag);
        System.out.println(Arrays.toString(a));
    }

    public static void fillArray (int a[]){
        Random random = new Random();
        for (int i = 0; i<a.length; i++) {
            a[i] = random.nextInt(100);
        }
    }
}    	