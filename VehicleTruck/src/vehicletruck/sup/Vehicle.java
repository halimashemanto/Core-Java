
package vehicletruck.sup;


public class Vehicle {
    
    
   private int speed;
   private double regularPrice;
   private String colour;

    public Vehicle() {
    }

    public Vehicle(int speed, double regularPrice, String colour) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.colour = colour;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "speed=" + speed + ", regularPrice=" + regularPrice + ", colour=" + colour + '}';
    }

   public double getSalePrice() {
       
    return regularPrice;
   
   }
  
}
