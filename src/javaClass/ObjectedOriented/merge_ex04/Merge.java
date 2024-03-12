package javaClass.ObjectedOriented.merge_ex04;

import java.util.LinkedList;
import java.util.List;

public class Merge {

    public static void main(String[] args) {
        List<Integer> prima = new LinkedList<Integer>();
        prima.add(1);
        prima.add(2);
        prima.add(3);
        prima.add(4);
        List<Integer> seconda = new LinkedList<Integer>();
        seconda.add(5);
        seconda.add(6);
        seconda.add(7);
        seconda.add(8);
        List<Integer> together = new LinkedList<Integer>();

        if (prima.size() == seconda.size()) {
            int count = 0;
            while (count < prima.size()) {
                together.add(prima.get(count));
                together.add(seconda.get(count));
                count++;
            }
        } else
            throw new IllegalArgumentException("linkedList have different sizes");
        together.forEach(System.out::println);
    }
}
