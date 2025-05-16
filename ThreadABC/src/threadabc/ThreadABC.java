
package threadabc;

import threadabc.she.Shemanto;
import threadabc.ss.Suprova;


public class ThreadABC {


    public static void main(String[] args) {
        
           Runnable a=new Shemanto();
        Runnable b=new Suprova();
        Runnable c=new Shemanto();
        
        
        Thread a1=new Thread(a);
        Thread b1=new Thread(b);
        Thread c1=new Thread(c);
        
        c1.start();
        a1.start();
        
        b1.start();


    }
    
}
