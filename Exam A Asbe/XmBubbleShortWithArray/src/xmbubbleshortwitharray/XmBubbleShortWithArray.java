package xmbubbleshortwitharray;

import java.util.Arrays;
import java.util.Scanner;

public class XmBubbleShortWithArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Limit.");
        int limit = s.nextInt();

        int[] array = new int[limit];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter Number " + (i + 1));
            int userInput = s.nextInt();

            array[i] = userInput;
        }

        System.out.println("After Bubble Shorting = " + Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;

                }
               
            }
        }
         System.out.println("Before Bubble Shorting = " + Arrays.toString(array));
    }

}
