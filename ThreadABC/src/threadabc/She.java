
package threadabc;


public class She implements Runnable{

    private int num;

    public She() {
    }

    public She(int num) {
        this.num = num;
    }
    
    
    @Override
    public void run() {

        for(int i = 0; i<num; i++){
            System.out.println("she hoise kina ");
        }
    }
    
}
