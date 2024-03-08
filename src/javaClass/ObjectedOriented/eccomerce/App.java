package javaClass.ObjectedOriented.eccomerce;

public class App {
    public static void main(String[] args) {
        System.out.println("------start app------------");
        Storage storage = new Storage();

        storage.load(new Product("pasta", 4), 5);
        storage.load(new Product("rice", 2), 3);
        storage.load(new Product("chocolate", 5), 8);
        storage.load(new Product("chocolate", 5), 8);
        storage.load(new Product("juice", 2.5f), 4);
        storage.logStatus();
        System.out.println("||||||||||||||||||||||||||||");

        System.out.println(storage.findByName("chocolate"));

    }
}
