package javaClass.ObjectedOriented.lambaExpressions.exampleComplex;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAgeLessThan25() {
        return this.getAge() < 25;
    }

    public boolean isNameBiggerThan5Char() {
        return this.getName().length() < 5;
    }

}
