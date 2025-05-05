package multidiamantionalarrayswithscnnar;


import java.util.Arrays;
import java.util.Scanner;

public class MultiDiamantionalArraysWithScnnar {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of rows.");
        int rows = s.nextInt();
        System.out.print("Enter number of columns.");
        int cols = s.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("Enter elements row by rows.");
        int temp;
          int[] array =null;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
//                arr[i][j] = s.nextInt();
                 
               
                temp = array[j + 1];
                
                    array[j + 1] = array[j];
                    array[j] = temp;
            }
        }
          System.out.println("Array After Sorting: " + Arrays.toString(array));
    }

}
