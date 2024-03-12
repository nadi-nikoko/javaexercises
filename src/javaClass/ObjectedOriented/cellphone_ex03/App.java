package javaClass.ObjectedOriented.cellphone_ex03;

public class App {

    static Cellphone a = new Cellphone("TIMMY", "3341234");
    static Cellphone b = new Cellphone("Megafon", "3355678");
    static Cellphone c = new Cellphone("Odissey", "3384343");

    public static void main(String[] args) {
        Cellphone.setCost("TIMMY", "TIMMY", 0.05);
        Cellphone.setCost("TIMMY", "Megafon", 0.15);
        Cellphone.setCost("Megafon", "TIMMY", 0.25);
        System.out.println(a.getCost(b, 10));
        System.out.println(b.getCost(a, 8));
        System.out.println(a.getCost(c, 10)); // This will throw an exception if not handled
    }

}
