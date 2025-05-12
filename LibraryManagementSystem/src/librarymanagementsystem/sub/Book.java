
package librarymanagementsystem.sub;

import librarymanagementsystem.sup.LibrarySuper;

public class Book extends LibrarySuper{
    
     
    private String name;
    private String writerName;
    private double price;
    private int pageNo;

    public Book() {
    }

    public Book(String name, String writerName, double price, int pageNo) {
        this.name = name;
        this.writerName = writerName;
        this.price = price;
        this.pageNo = pageNo;
    }

    public Book(String name, String writerName, double price, int pageNo, String title, String author, int yearPublished) {
        super(title, author, yearPublished);
        this.name = name;
        this.writerName = writerName;
        this.price = price;
        this.pageNo = pageNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", writerName=" + writerName + ", price=" + price + ", pageNo=" + pageNo + '}';
    }

    @Override
    public void detailsBased() {
        super.detailsBased(); 
        System.out.println("Name = " + name +"\n"+ "WriterName = " + writerName+"\n" + "Price = " + price +"\n"+ "PageNo = " + pageNo +"\n");
    }
    
    
    
}
