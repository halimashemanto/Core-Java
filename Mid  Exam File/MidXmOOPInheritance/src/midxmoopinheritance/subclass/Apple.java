
package midxmoopinheritance.subclass;

import midxmoopinheritance.supper.Fruits;


public class Apple extends Fruits{
    private boolean redOrGreen;
    private String isImported;
    private String quality;

    public Apple() {
    }

    public Apple(boolean redOrGreen, String isImported, String quality) {
        this.redOrGreen = redOrGreen;
        this.isImported = isImported;
        this.quality = quality;
    }

    public Apple(boolean redOrGreen, String isImported, String quality, String sweetOrSour, double quentity, String Size) {
        super(sweetOrSour, quentity, Size);
        this.redOrGreen = redOrGreen;
        this.isImported = isImported;
        this.quality = quality;
    }

    public boolean isRedOrGreen() {
        return redOrGreen;
    }

    public void setRedOrGreen(boolean redOrGreen) {
        this.redOrGreen = redOrGreen;
    }

    public String getIsImported() {
        return isImported;
    }

    public void setIsImported(String isImported) {
        this.isImported = isImported;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Apple{" + "redOrGreen=" + redOrGreen + ", isImported=" + isImported + ", quality=" + quality + '}';
    }

    @Override
    public void details() {
        super.details(); 
        
        System.out.println("RedOrGreen" + " : " + redOrGreen + "\n" + "IsImported" + " : " + isImported + "\n" + "Quality" + " : " + quality);
    }
    
    
}
