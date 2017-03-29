
import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        int[] array = new int[10];
        fillArray(array);
        System.out.println();
        reverse(array);
        System.out.println();
        ArrayList<Integer>[] arrayList = new ArrayList[10];
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = new ArrayList<>();
            Collections.addAll(arrayList[i], array[i]);
        }
        Collections.reverse(Arrays.asList(arrayList));
        for (int i = 0; i < arrayList.length; i++) {
            System.out.print(arrayList[i] + " ");
        }
    }

    public static void fillArray(int[] array){
        Random random = new Random();
        for (int i = 0;i<array.length;i++){
            array[i] = random.nextInt(99);
            System.out.print("["+ array[i] + "] ");
        }
    }

    public static void reverse(int[] array){
        int c;
        for (int i = 0;i<array.length/2;i++){
            c = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = c;
        }
        for (int i = 0;i<array.length;i++){
            System.out.print("["+ array[i] + "] ");
        }
    }
}