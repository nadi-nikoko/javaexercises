package javaClass.ObjectedOriented.Cellphone_errore;

import java.util.ArrayList;
import java.util.List;

public class Cellphone {
    private String brand;
    private String phoneNumber;
    private static ArrayList<BrandPhone> cost;

    public Cellphone(String brand, String phoneNumber) {
        this.brand = brand;
        this.phoneNumber = phoneNumber;

    }

    public ArrayList<BrandPhone> getCost() {
        return cost;
    }

    public static void setCost(String brandCall, String brandReceive, double costs) {
        cost = new ArrayList<BrandPhone>();

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
