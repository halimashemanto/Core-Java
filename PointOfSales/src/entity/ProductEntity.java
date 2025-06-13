
package entity;


public class ProductEntity {
     private int id;
    private String category;
    private String productName; 

    public ProductEntity() {
    }

    public ProductEntity(int id, String category, String productName) {
        this.id = id;
        this.category = category;
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "ProductEntity{" + "id=" + id + ", category=" + category + ", productName=" + productName + '}';
    }

    
}
