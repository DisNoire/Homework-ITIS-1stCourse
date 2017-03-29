import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }

        mergeSort(array);

        for (int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }

    }


    public static int[] mergeSort(int[] array){

        if(array.length == 1) {
            return array;
        }

        int[] array1 = mergeSort(Arrays.copyOf(array, array.length / 2));
        int[] array2 = mergeSort(Arrays.copyOfRange(array, array.length / 2, array.length));

        int i = 0, j = 0, i1 = 0;
        while(i < array1.length || j < array2.length){
            while (i < array1.length && j < array2.length){
                if( array1[i] <= array2[j]){
                    array[i1] = array1[i];
                    i++;
                    i1++;
                }
                else {
                    array[i1] = array2[j];
                    j++;
                    i1++;
                }
            }
            if(i == ar1.length){
                array[i1] = array2[j];
                j++;
                i1++;
            }
            else {
                array[i1] = array1[i];
                i++;
                i1++;
            }
        }
        return array;
    }

}
