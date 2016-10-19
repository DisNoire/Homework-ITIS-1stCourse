
import java.io.FileNotFoundException;

/**
 * Created by DisNoire on 18.10.2016.
 */
public class PointViewer {

    public static void main(String[] args) throws FileNotFoundException {
        Point point = new Point();
        point.addDifValue();
        System.out.println(DistanseCalcurator.distanseCalcurator(point.getDx(), point.getDy()));

    }
}
