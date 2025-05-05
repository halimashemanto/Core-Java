
package multidiamantionalarrayswithscnnar;

import java.util.Arrays;
import java.util.Comparator;
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
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        
        
            Integer[][] boxedArr = Arrays.stream(arr)
                .map(row -> Arrays.stream(row).boxed().toArray(Integer[]::new))
                .toArray(Integer[][]::new);
            
              System.out.print("Enter column index to sort by (0-based): ");
        int colIndex = s.nextInt();
         Arrays.sort(boxedArr, Comparator.comparingInt(row -> row[colIndex]));
         
            System.out.println("Sorted array:");
        for (Integer[] row : boxedArr) {
            System.out.println(Arrays.toString(row));
        }

    }
    
}
