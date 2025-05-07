package vehiclesupersub.subclass;

public class Bike extends vehiclesupersub.supeer.Vehicle {

    private int hasCarrier;

    public Bike() {
    }

    public Bike(int hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    public Bike(int hasCarrier, String brand, int speed) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    public int getHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(int hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    @Override
    public String toString() {
        return "Bike{" + "hasCarrier=" + hasCarrier + '}';
    }

    @Override
    public void properties() {
        super.properties();
        System.out.println("HasCarrier" + "  : " + hasCarrier);
    }

}
