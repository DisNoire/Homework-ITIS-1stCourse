
import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = n;

        for (int i = 1; i <= n; i++) {
            for (int j = counter - 1; j >= 1; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            counter--;
            System.out.println();

        }
    }

}
