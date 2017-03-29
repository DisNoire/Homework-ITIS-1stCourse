
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        activities();
    }

    public static void activities() {
        String op = "something";
        Scanner scanner = new Scanner(System.in);
        ArrayConstruct arrayConstruct = new ArrayConstruct();
        Point array = new Point(0,0);
        array.fillArray();
        while(!op.equals("end")) {
            op = scanner.next();
            if(op.equals("add")) {
                System.out.println("print x, press enter,print y:");
                Point point = new Point(scanner.nextInt(),scanner.nextInt());
                arrayConstruct.add(point,array);
            }
            if(op.equals("get")) {
                System.out.println("print index:");
                arrayConstruct.get(scanner.nextInt(),array).print();
            }
            if(op.equals("remove")) {
                Point.printArray(array);
                System.out.println();
                System.out.println("print index:");
                arrayConstruct.remove(scanner.nextInt(),array);
            }
        }

    }
}