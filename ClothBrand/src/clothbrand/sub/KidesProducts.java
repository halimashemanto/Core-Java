
package clothbrand.sub;

public class KidesProducts {
    private String size;
    private String name;
    private double price;
    private String quality;

    public KidesProducts() {
    }

    public KidesProducts(String size, String name, double price, String quality) {
        this.size = size;
        this.name = name;
        this.price = price;
        this.quality = quality;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "KidesProducts{" + "size=" + size + ", name=" + name + ", price=" + price + ", quality=" + quality + '}';
    }
    
    
    
}
