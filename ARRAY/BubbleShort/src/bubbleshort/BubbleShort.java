package bubbleshort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleShort {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your limit.");
        int size = s.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {

            System.out.println("Enter Number " + (i + 1));
            int userValue = s.nextInt();

            array[i] = userValue;
        }

        System.out.println("Array before sorting: " + Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Array After Sorting: " + Arrays.toString(array));
    }

}
