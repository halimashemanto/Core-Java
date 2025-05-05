
package midxmoopinheritance.supper;


public class Fruits {
     private String sweetOrSour;
     private double quentity;
     private String Size;

    public Fruits() {
    }

    public Fruits(String sweetOrSour, double quentity, String Size) {
        this.sweetOrSour = sweetOrSour;
        this.quentity = quentity;
        this.Size = Size;
    }

    public String getSweetOrSour() {
        return sweetOrSour;
    }

    public void setSweetOrSour(String sweetOrSour) {
        this.sweetOrSour = sweetOrSour;
    }

    public double getQuentity() {
        return quentity;
    }

    public void setQuentity(double quentity) {
        this.quentity = quentity;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    @Override
    public String toString() {
        return "Fruits{" + "sweetOrSour=" + sweetOrSour + ", quentity=" + quentity + ", Size=" + Size + '}';
    }
     
     public void details(){
     
         System.out.println("SweetOrSour " + " : " + sweetOrSour + "\n" + "Quentity " + " : "+ quentity + "\n" + "Size "+ " : " + Size + "\n");
   
     }
     
     
     
}
