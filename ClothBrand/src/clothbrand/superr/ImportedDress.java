
package clothbrand.superr;


public class ImportedDress {
    private String items;
    private int quantity;
    private String importedCountries;
    private double priceRange;

    public ImportedDress() {
    }

    public ImportedDress(String items, int quantity, String importedCountries, double priceRange) {
        this.items = items;
        this.quantity = quantity;
        this.importedCountries = importedCountries;
        this.priceRange = priceRange;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImportedCountries() {
        return importedCountries;
    }

    public void setImportedCountries(String importedCountries) {
        this.importedCountries = importedCountries;
    }

    public double getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(double priceRange) {
        this.priceRange = priceRange;
    }

    @Override
    public String toString() {
        return "ImportedDress{" + "items=" + items + ", quantity=" + quantity + ", importedCountries=" + importedCountries + ", priceRange=" + priceRange + '}';
    }
    
    public void importDetails(){
    
        System.out.println("Imported Cost = " + (priceRange *quantity ));
    
    }
    
}
