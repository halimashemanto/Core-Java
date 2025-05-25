
package threadabc;

public class Sup implements Runnable{
    
    private int id;
    private String name;

    public Sup() {
    }

    public Sup(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    

    @Override
    public void run() {
        for(int i = 0; i<id; i++){
            System.out.println("hoice kina dekte chai");
        
        }

    }
    
}
