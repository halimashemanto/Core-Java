
package midxmoopinheritance.subclass;

import midxmoopinheritance.supper.Fruits;

public class Mango extends Fruits{
    
    private String rawOrRipe;
    private double weight;

    public Mango() {
    }

    public Mango(String rawOrRipe, double weight) {
        this.rawOrRipe = rawOrRipe;
        this.weight = weight;
    }

    public Mango(String rawOrRipe, double weight, String sweetOrSour, double quentity, String Size) {
        super(sweetOrSour, quentity, Size);
        this.rawOrRipe = rawOrRipe;
        this.weight = weight;
    }

    public String getRawOrRipe() {
        return rawOrRipe;
    }

    public void setRawOrRipe(String rawOrRipe) {
        this.rawOrRipe = rawOrRipe;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Mango{" + "rawOrRipe=" + rawOrRipe + ", weight=" + weight + '}';
    }

    @Override
    public void details() {
        super.details(); 
        
        System.out.println("RawOrRipe" + " : " + rawOrRipe  + "\n" + "Weight" + " : " + weight  + "\n");
        
    }
    
    
}
