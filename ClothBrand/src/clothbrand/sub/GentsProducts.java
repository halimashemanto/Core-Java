
package clothbrand.sub;


public class GentsProducts {
    private String  pantsSize;
    private String tShirtSize;
    private int quantityOfBoysProduct;
    private double priceOfBoysProduct;

    public GentsProducts() {
    }

    public GentsProducts(String pantsSize, String tShirtSize, int quantityOfBoysProduct, double priceOfBoysProduct) {
        this.pantsSize = pantsSize;
        this.tShirtSize = tShirtSize;
        this.quantityOfBoysProduct = quantityOfBoysProduct;
        this.priceOfBoysProduct = priceOfBoysProduct;
    }

    public String getPantsSize() {
        return pantsSize;
    }

    public void setPantsSize(String pantsSize) {
        this.pantsSize = pantsSize;
    }

    public String gettShirtSize() {
        return tShirtSize;
    }

    public void settShirtSize(String tShirtSize) {
        this.tShirtSize = tShirtSize;
    }

    public int getQuantityOfBoysProduct() {
        return quantityOfBoysProduct;
    }

    public void setQuantityOfBoysProduct(int quantityOfBoysProduct) {
        this.quantityOfBoysProduct = quantityOfBoysProduct;
    }

    public double getPriceOfBoysProduct() {
        return priceOfBoysProduct;
    }

    public void setPriceOfBoysProduct(double priceOfBoysProduct) {
        this.priceOfBoysProduct = priceOfBoysProduct;
    }

    @Override
    public String toString() {
        return "GentsProducts{" + "pantsSize=" + pantsSize + ", tShirtSize=" + tShirtSize + ", quantityOfBoysProduct=" + quantityOfBoysProduct + ", priceOfBoysProduct=" + priceOfBoysProduct + '}';
    }
    
    
    
    
}
