
/**
 * Created by DisNoire on 18.10.2016.
 */
public class ArrayConstruct {

    public void add(Point point,Point array){
        if (Point.n != Point.index+1) {
            array.arrayOfPoints[Point.index] = Point.copy(point);
            array.plusIndex();
        }
        else {
            array.plusN();
            array.arrayOfPoints[Point.index] = point;
            array.plusIndex();
        }
    }

    public Point get(int index,Point array) {
        return array.arrayOfPoints[array.index];
    }

    public void remove(int index,Point array) {
        for (int i = array.index;i<Point.n - 1;i++){
            array.arrayOfPoints[i] = Point.copy(array.arrayOfPoints[i+1]);
            array.arrayOfPoints[i+1] = Point.copy(array.pointDefault);
        }
    }
}
