
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        int a, b, i, k;
        boolean del;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if (a != 0 && b != 0) {
            k = a * b;
            i = k;
            for (int i1 = i; i1>0;i1--)
                if (i % a == 0 && i % b == 0) {
                    k = i;
                }
            System.out.println("LCM " + a + " i " + b + " equals " + k);
        } else System.out.println("You can't divide on zero");

    }
}
