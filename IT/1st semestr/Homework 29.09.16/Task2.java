
public class Task2 {

    public static void main(String[] args) {
        int i, n, c;
        n = 10;
        for (i = 0; i < n; i++)
        {
            for (c = 0; c <= (n - i); c++)
            {
                System.out.print("  ");
            }
            for (c = 0; c <= i; c++)
            {
                System.out.print(" ");
                System.out.printf("%3d",fact(i) / (fact(c) * fact(i - c)));
            }
            System.out.println();
            System.out.println();
        }

    }

    public static int fact(int n) {
        int i, x = 1;
            for (i = 1; i <= n; i++) {
                    x *= i;
                }
        return x;
    }
}
