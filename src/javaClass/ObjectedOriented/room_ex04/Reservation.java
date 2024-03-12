package javaClass.ObjectedOriented.room_ex04;

public class Reservation {

    private String name;
    private int dayIN;
    private int dayOUT;

    public Reservation(String name, int dayIN, int dayOUT) {
        this.name = name;
        this.dayIN = dayIN;
        this.dayOUT = dayOUT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Reservation [name=" + name + "]";
    }

    public int getDayIN() {
        return dayIN;
    }

    public void setDayIN(int dayIN) {
        this.dayIN = dayIN;
    }

    public int getDayOUT() {
        return dayOUT;
    }

    public void setDayOUT(int dayOUT) {
        this.dayOUT = dayOUT;
    }

    public boolean isOverlapped(int dayIN, int dayOUT) {
        if (this.dayIN == dayIN || this.dayIN == dayOUT || this.dayOUT == dayIN || this.dayOUT == dayOUT) {

        }
    }

    public boolean isReserved(int day) {
        return this.dayIN == day || this.dayOUT == day || this.dayIN > day && this.dayOUT < day;
    }
}
