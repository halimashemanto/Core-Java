
package librarymanagementsystem.sub;

import librarymanagementsystem.sup.LibrarySuper;


public class Dvd extends LibrarySuper{
    private double size;
    private double time;
    private double dvdPrice;

    public Dvd() {
    }

    public Dvd(double size, double time, double dvdPrice) {
        this.size = size;
        this.time = time;
        this.dvdPrice = dvdPrice;
    }

    public Dvd(double size, double time, double dvdPrice, String title, String author, int yearPublished) {
        super(title, author, yearPublished);
        this.size = size;
        this.time = time;
        this.dvdPrice = dvdPrice;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getDvdPrice() {
        return dvdPrice;
    }

    public void setDvdPrice(double dvdPrice) {
        this.dvdPrice = dvdPrice;
    }

    @Override
    public String toString() {
        return "Dvd{" + "size=" + size + ", time=" + time + ", dvdPrice=" + dvdPrice + '}';
    }

    @Override
    public void detailsBased() {
        super.detailsBased();
    }
    
    
    
    
}
