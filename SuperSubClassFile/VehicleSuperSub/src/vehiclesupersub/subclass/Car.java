package vehiclesupersub.subclass;

public class Car extends vehiclesupersub.supeer.Vehicle {

    private int numberOfDoors;

    public Car() {
    }

    public Car(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Car(int numberOfDoors, String brand, int speed) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" + "numberOfDoors=" + numberOfDoors + '}';
    }

    @Override
    public void properties() {
        super.properties();
        System.out.println("NumberOfDoors" + "  : " + numberOfDoors);
    }

}
