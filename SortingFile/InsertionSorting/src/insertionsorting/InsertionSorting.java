package insertionsorting;

import java.util.Arrays;



public class InsertionSorting {

    public static void main(String[] args) {

        int[] numbers = {100,1,6,70, 89, 63, 32, 74, 47, 46};

         insertionSort(numbers);
        
    }

    public static void insertionSort(int[] list) {
        
        
        for (int i = 1; i < list.length; i++) {
            
            int currentElement = list[i];
            int k;
            
            
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                
                list[k + 1] = list[k];
            }
            
            list[k + 1] = currentElement;

        }
        System.out.println(Arrays.toString(list));
    }
}
