
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by DisNoire on 18.10.2016.
 */
public class Point {
    private int x;
    private int y;
    private int x0;
    private int y0;
    private double dx;
    private double dy;

    public void addDifValue() throws FileNotFoundException {
        File f = new File("text.txt");
        Scanner scFromFile = new Scanner(f);
        int[] a = new int[4];
        int i = 0;
        if (!scFromFile.hasNextLine()){
            Scanner scFromConsole = new Scanner(System.in);
            for (int j = 0;j<4;j++){
                a[j] = scFromConsole.nextInt();
                i++;
            }
        }
        else while (scFromFile.hasNext()){
            a[i] = scFromFile.nextInt();
            i++;
        }
         dx = a[2] - a[0];
         dy = a[3] - a[1];
    }

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
    }
}
