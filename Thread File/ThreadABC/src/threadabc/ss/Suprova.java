package threadabc.ss;

public class Suprova implements Runnable {

    private double  inumoni;

    public Suprova() {
    }

    public Suprova(double inumoni) {
        this.inumoni = inumoni;
    }

    

    @Override
    public void run() {
        for(double i = 0; i < inumoni; i++) {
            System.out.println("ja mon chay ta");
        }
    }

}
