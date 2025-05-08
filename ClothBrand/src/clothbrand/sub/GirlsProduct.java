
package clothbrand.sub;


public class GirlsProduct {
    private String productsName;
    private int productsQuantity;
    private double productPrice;

    public GirlsProduct() {
    }

    public GirlsProduct(String productsName, int productsQuantity, double productPrice) {
        this.productsName = productsName;
        this.productsQuantity = productsQuantity;
        this.productPrice = productPrice;
    }

    public String getProductsName() {
        return productsName;
    }

    public void setProductsName(String productsName) {
        this.productsName = productsName;
    }

    public int getProductsQuantity() {
        return productsQuantity;
    }

    public void setProductsQuantity(int productsQuantity) {
        this.productsQuantity = productsQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "GirlsProduct{" + "productsName=" + productsName + ", productsQuantity=" + productsQuantity + ", productPrice=" + productPrice + '}';
    }
    
    
    
    
    
    
}
