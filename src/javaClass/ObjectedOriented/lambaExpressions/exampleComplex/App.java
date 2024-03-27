package javaClass.ObjectedOriented.lambaExpressions.exampleComplex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {

        Person mica = new Person("mica", 29);
        Person joao = new Person("joao", 35);
        Person pedro = new Person("pedrowwww", 22);
        Person maria = new Person("mariaaaaa", 12);

        List<Person> people = Arrays.asList(mica, joao, pedro, maria);

        System.out.println("simple method resolution");
        System.out.println("filter name");
        filterName(people);
        System.out.println("filter age");
        filterAge(people);
        System.out.println("-----------------");

        System.out.println("lambda expression resolution");

        Predicate<Person> nameFilter = a -> (a.getName().length() < 5);
        Predicate<Person> ageFilter = a -> (a.getAge() < 25);

        System.out.println("filter name");
        filter(nameFilter, people);
        System.out.println("filter age");
        filter(ageFilter, people);
        System.out.println("--------------------");
        System.out.println("method reference style");

        Predicate<Person> nameFilterMR = Person::isNameBiggerThan5Char;
        Predicate<Person> ageFilterMR = Person::isAgeLessThan25;

        System.out.println("filter name");
        filter(nameFilterMR, people);
        System.out.println("filter age");
        filter(ageFilterMR, people);

    }

    public static void filterName(List<Person> people) {
        for (Person person : people) {
            if (person.getName().length() < 5) {
                System.out.println(person.getName());
            }
        }
    }

    public static void filterAge(List<Person> people) {
        for (Person person : people) {
            if (person.getAge() < 25) {
                System.out.println(person.getName());
            }
        }
    }

    public static void filter(Predicate n, List<Person> people) {
        for (Person person : people) {
            if (n.test(person)) {
                System.out.println(person.getName());
            }
        }
    }
}
