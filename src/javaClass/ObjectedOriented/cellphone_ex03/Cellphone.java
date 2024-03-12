package javaClass.ObjectedOriented.cellphone_ex03;

import java.util.ArrayList;

public class Cellphone {
    private String brand;
    private String phoneNumber;
    //// why static arrayList
    private static ArrayList<BrandPhone> cost;

    public Cellphone(String brand, String phoneNumber) {
        this.brand = brand;
        this.phoneNumber = phoneNumber;
        this.cost = new ArrayList<BrandPhone>();

    }

    public double getCost(Cellphone phone, double min) {
        double res = -1;
        boolean findData = false;
        for (BrandPhone current : cost) {
            if (this.brand.equals(current.getNameBrand())) {
                if (current.getBrandToCall().equals(phone.getBrand())) {
                    res = current.getCostPerMin() * min;
                    findData = true;
                }
            }
        }
        if (!findData) {
            throw new IllegalArgumentException("this data is not available");
        }
        return res;
    }

    public static void setCost(String nameBrand, String brandToCall, double costs) {
        BrandPhone newCost = new BrandPhone(nameBrand, brandToCall, costs);
        cost.add(newCost);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
