
package objclasspractice.general.subclass;

import objclasspractice.general.Books;


public class Mobile  extends Books{
    
    private String display;
    private int phoneNo;
    private double calculator;
    private long searchlist;
    private String fmRadio;

    public Mobile() {
    }

    public Mobile(String display, int phoneNo, double calculator, long searchlist, String fmRadio) {
        this.display = display;
        this.phoneNo = phoneNo;
        this.calculator = calculator;
        this.searchlist = searchlist;
        this.fmRadio = fmRadio;
    }

    public Mobile(String display, int phoneNo, double calculator, long searchlist, String fmRadio, String page, String ink, int pageNo, double lineNo, String cover, float list, String colour) {
        super(page, ink, pageNo, lineNo, cover, list, colour);
        this.display = display;
        this.phoneNo = phoneNo;
        this.calculator = calculator;
        this.searchlist = searchlist;
        this.fmRadio = fmRadio;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public double getCalculator() {
        return calculator;
    }

    public void setCalculator(double calculator) {
        this.calculator = calculator;
    }

    public long getSearchlist() {
        return searchlist;
    }

    public void setSearchlist(long searchlist) {
        this.searchlist = searchlist;
    }

    public String getFmRadio() {
        return fmRadio;
    }

    public void setFmRadio(String fmRadio) {
        this.fmRadio = fmRadio;
    }

    @Override
    public String toString() {
        return "Mobile{" + "display=" + display + ", phoneNo=" + phoneNo + ", calculator=" + calculator + ", searchlist=" + searchlist + ", fmRadio=" + fmRadio + '}';
    }
    
    
    
    
}
