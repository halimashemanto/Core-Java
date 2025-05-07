package vehiclesupersub;

import vehiclesupersub.subclass.Bike;
import vehiclesupersub.subclass.Car;

public class VehicleSuperSub {

    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();

        c.setBrand("BMW");
        c.setNumberOfDoors(100);
        c.setSpeed(120);

        c.properties();
        System.out.println("----------------------");

        b.setBrand("CBR");
        b.setHasCarrier(0);
        b.setSpeed(100);

        b.properties();

    }
}
