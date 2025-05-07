
package pkg2darrays;

import java.util.Arrays;


public class MultiDiamantionalArrays {


    public static void main(String[] args) {
       
        
         int[][] arr = {
            {3, 2, 1},
            {6, 5, 4},
            {9, 8, 7}
        };

    
        for (int[] row : arr) {
            Arrays.sort(row);
        }

        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
        
        
    }
    
}
