
package pthread;

public class TaskOne implements Runnable{

    private int number;

    public TaskOne() {
    }

    public TaskOne(int number) {
        this.number = number;
    }
        
    
  

    

    @Override
    public void run() {
        for(double i = 0; i < number; i++) {
            System.out.println("" + i);
        }



    }
    
}
