package improvebubblesort;

import java.util.Arrays;
import java.util.Scanner;

public class ImproveBubbleSort {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your limit");
        int limit = s.nextInt();

        int[] array = new int[limit];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter Number " + (i + 1));
            int userInput = s.nextInt();

            array[i] = userInput;
        }

        //int[] array = {50, 10, 20, 5, 8, 90, 520, 4647, 1};
        System.out.println("Before Improve Bubble Sort " + "\n" + Arrays.toString(array) + "\n");

        System.out.println("After Improve Bubble Sort ");

        System.out.println(Arrays.toString(array));
       
        
        bubbleSort(array);

    }

    public static void bubbleSort(int[] bubble) {

        boolean b = true;

        for (int i = 1; i < bubble.length; i++) {

            b = false;
            for (int j = 0; j < bubble.length - i; j++) {

                if (bubble[j] > bubble[j + 1]) {
                    int temp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;

                }
            }
            
            
        }

        System.out.println(Arrays.toString(bubble));

    }

}
