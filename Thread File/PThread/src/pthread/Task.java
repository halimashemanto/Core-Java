
package pthread;


public class Task implements Runnable{
   
  private double  inumoni;

    public Task() {
    }

    public Task(double inumoni) {
        this.inumoni = inumoni;
    }


    

    @Override
    public void run() {
        for(double i = 0; i < inumoni; i++) {
            System.out.println(inumoni);
        }
    
    
    }
}