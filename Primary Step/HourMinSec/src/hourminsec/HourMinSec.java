
package hourminsec;

import java.util.Scanner;


public class HourMinSec {

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
         System.out.println("Enter seconds");
         
        int totalSeconds = scan.nextInt();
        
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds/60;
        int seconds = remainingSeconds%60;
        
        System.out.println(totalSeconds + " seconds is " +  hours + " hours and " + + minutes + " minutes and " + seconds + " seconds");
        
       
    }
    
}
