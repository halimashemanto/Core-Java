package vehiclesupersub.supeer;

public class Vehicle {

    private String brand;
    private int speed;

    public Vehicle() {
    }

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void properties() {

        System.out.println("Brand" + "  : " + brand + "\n");
        System.out.println("Speed" + "  : " + speed + "\n");
    }
}
