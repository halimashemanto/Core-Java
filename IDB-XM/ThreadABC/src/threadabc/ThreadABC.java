
package threadabc;


public class ThreadABC {

  
    public static void main(String[] args) {
  
        Runnable r = new She(20);
        Runnable n = new Sup(20, "shemanto");
        
        Thread s =new Thread(r);
        Thread ss =new Thread(n);
      
   
       s.start();
       ss.start();
     
    }
    
}
