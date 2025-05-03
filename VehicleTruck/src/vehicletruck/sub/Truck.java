package vehicletruck.sub;

import vehicletruck.sup.Vehicle;

public class Truck extends Vehicle {

    private int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int speed, double regularPrice, String colour) {
        super(speed, regularPrice, colour);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double getSalePrice() {
      
        
        if (weight > 2000) {
            
           return (double) (super.getRegularPrice() - (super.getRegularPrice() * .10));
        } 
        
        else {
            return super.getRegularPrice();
        }

    }
    
}
    


