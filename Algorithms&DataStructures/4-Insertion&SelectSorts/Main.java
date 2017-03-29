import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++){
            array[i] = r.nextInt(100);
        }

        selectionSort(array);

        for (int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++){
            array[i] = r.nextInt(100);
        }

        insertionSort(array);
        for (int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }




    }

    public static void selectionSort(int[] array) {
        int min = array[0];
        int q = 0;
        int element;
        for (int i = 0; i < array.length - 1; i++) {
            min = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    q = j;
                }
            }
            element = array[i];
            array[i] = array[q];
            array[q] = element;
        }
    }

    public static void insertionSort(int[] array){
        int j;
        int arrayI;
        for(int i = 1; i < array.length; i++) {
            j = Arrays.binarySearch(array, 0, i, array[i]);
            if(j < 0) {
                j = (j + 1) * -1;
            }
            arrayI = array[i];
            for(int i1 = i; i1 > j; i1--) {
                array[i1] = array[i1 - 1];
            }
            array[j] = arrayI;
        }
    }

}
