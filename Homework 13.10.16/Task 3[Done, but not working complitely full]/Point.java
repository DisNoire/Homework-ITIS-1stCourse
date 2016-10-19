
/**
 * Created by DisNoire on 18.10.2016.
 */
public class Point {
    private static int X = 0;
    private static int Y = 0;
    public static int n = 10;
    public static Point[] arrayOfPoints;
    public static int index = 0;
    public static Point pointDefault = new Point(0,0);


    Point(int X,int Y){
        this.X = X;
        this.Y = Y;

    }

    public void fillArray(){
        arrayOfPoints = new Point[n];
        for (int i = 0;i<arrayOfPoints.length;i++){
            arrayOfPoints[i] = Point.copy(pointDefault);
        }
    }

    public void print(){
        System.out.println("{"+ X + ";" + Y + "}");
    }

    public static void printArray(Point array){
        for (int i = 0;i<array.arrayOfPoints.length;i++){
            System.out.print("{"+ array.arrayOfPoints[i].getX() + ";" + array.arrayOfPoints[i].getY() + "}");
        }
    }

    public static Point copy(Point point){
        return new Point(point.getX(), point.getY());
    }

    public void plusN() {
        this.n++;
    }

    public void minusN() {
        this.n--;
    }

    public void plusIndex() {
        this.index++;
    }

    public void minusIndex() {
        this.index--;
    }

    public void setX(int x) {
        X = x;
    }

    public void setY(int y) {
        Y = y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }
}
