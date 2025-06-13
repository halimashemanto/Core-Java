
package pthread;


public class PThread {

   
    public static void main(String[] args) {
 
       
        Runnable r = new Task(10);
        Runnable n = new TaskOne(20);
        
        Thread s =new Thread(r);
        Thread ss =new Thread(n);
      
   
       s.start();
       ss.start();
    }
    
}
