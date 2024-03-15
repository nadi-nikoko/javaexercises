package javaClass.ObjectedOriented.inheritance;

public class Animal {
    public static void main(String[] args) {
        Animal.makeSound();
        Cat.makeSound();
    }

    public static void makeSound() {
        System.out.println("animal make sounds");
    }
}

class Cat extends Animal {
    public static void makeSound() {
        System.out.println("auau");
    }
}
