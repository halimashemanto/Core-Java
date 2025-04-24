
package objclasspractice.general.subclass;

import objclasspractice.general.Books;


public class WaterPot extends Books{
    private String materials;
    private String plastic;
    private long quentity;
    private double litter;
    private String juice;
    private String water;
    private String normalWater;
    private String coldWater;

    public WaterPot() {
    }

    public WaterPot(String materials, String plastic, long quentity, double litter, String juice, String water, String normalWater, String coldWater) {
        this.materials = materials;
        this.plastic = plastic;
        this.quentity = quentity;
        this.litter = litter;
        this.juice = juice;
        this.water = water;
        this.normalWater = normalWater;
        this.coldWater = coldWater;
    }

    public WaterPot(String materials, String plastic, long quentity, double litter, String juice, String water, String normalWater, String coldWater, String page, String ink, int pageNo, double lineNo, String cover, float list, String colour) {
        super(page, ink, pageNo, lineNo, cover, list, colour);
        this.materials = materials;
        this.plastic = plastic;
        this.quentity = quentity;
        this.litter = litter;
        this.juice = juice;
        this.water = water;
        this.normalWater = normalWater;
        this.coldWater = coldWater;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public String getPlastic() {
        return plastic;
    }

    public void setPlastic(String plastic) {
        this.plastic = plastic;
    }

    public long getQuentity() {
        return quentity;
    }

    public void setQuentity(long quentity) {
        this.quentity = quentity;
    }

    public double getLitter() {
        return litter;
    }

    public void setLitter(double litter) {
        this.litter = litter;
    }

    public String getJuice() {
        return juice;
    }

    public void setJuice(String juice) {
        this.juice = juice;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getNormalWater() {
        return normalWater;
    }

    public void setNormalWater(String normalWater) {
        this.normalWater = normalWater;
    }

    public String getColdWater() {
        return coldWater;
    }

    public void setColdWater(String coldWater) {
        this.coldWater = coldWater;
    }

    @Override
    public String toString() {
        return "WaterPot{" + "materials=" + materials + ", plastic=" + plastic + ", quentity=" + quentity + ", litter=" + litter + ", juice=" + juice + ", water=" + water + ", normalWater=" + normalWater + ", coldWater=" + coldWater + '}';
    }
    
    
    
    
    
    
    
    
    
}
