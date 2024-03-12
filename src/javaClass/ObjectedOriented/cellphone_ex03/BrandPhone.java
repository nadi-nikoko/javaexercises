package javaClass.ObjectedOriented.cellphone_ex03;

public class BrandPhone {
    private String nameBrand;
    private String brandToCall;
    private double costPerMin;

    public BrandPhone(String nameBrand, String brandToCall, double costPerMin) {
        this.nameBrand = nameBrand;
        this.brandToCall = brandToCall;
        this.costPerMin = costPerMin;
    }

    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }

    public String getBrandToCall() {
        return brandToCall;
    }

    public void setBrandToCall(String brandToCall) {
        this.brandToCall = brandToCall;
    }

    public double getCostPerMin() {
        return costPerMin;
    }

    public void setCostPerMin(double costPerMin) {
        this.costPerMin = costPerMin;
    }
}
