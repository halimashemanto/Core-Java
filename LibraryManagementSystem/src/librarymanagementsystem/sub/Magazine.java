
package librarymanagementsystem.sub;

import librarymanagementsystem.sup.LibrarySuper;


public class Magazine extends LibrarySuper{
    private String publications;
    private double magazinePrice;
    private String monthlyOrDaily;

    public Magazine() {
    }

    public Magazine(String publications, double magazinePrice, String monthlyOrDaily) {
        this.publications = publications;
        this.magazinePrice = magazinePrice;
        this.monthlyOrDaily = monthlyOrDaily;
    }

    public Magazine(String publications, double magazinePrice, String monthlyOrDaily, String title, String author, int yearPublished) {
        super(title, author, yearPublished);
        this.publications = publications;
        this.magazinePrice = magazinePrice;
        this.monthlyOrDaily = monthlyOrDaily;
    }

    public String getPublications() {
        return publications;
    }

    public void setPublications(String publications) {
        this.publications = publications;
    }

    public double getMagazinePrice() {
        return magazinePrice;
    }

    public void setMagazinePrice(double magazinePrice) {
        this.magazinePrice = magazinePrice;
    }

    public String getMonthlyOrDaily() {
        return monthlyOrDaily;
    }

    public void setMonthlyOrDaily(String monthlyOrDaily) {
        this.monthlyOrDaily = monthlyOrDaily;
    }

    @Override
    public String toString() {
        return "Magazine{" + "publications=" + publications + ", magazinePrice=" + magazinePrice + ", monthlyOrDaily=" + monthlyOrDaily + '}';
    }

    @Override
    public void detailsBased() {
        super.detailsBased(); 
        System.out.println("Publications = " + publications +"\n"+ "Magazine Price = " + magazinePrice +"\n"+ "Monthly Or Daily = " + monthlyOrDaily +"\n");
    }
    
}
