/*
 * Rappresemtare um tipo dado com una azione lancia che modifica lo stato del deado in maneira casuale
 * 
 */

package javaClass.ObjectedOriented.oo_exercise;

import java.util.Random;

public class exercise02 {
    public static void main(String[] args) {
        Dado d1 = new Dado();
        Dado d2 = new Dado();
        for (int i = 0; i < 10; i++) {
            d1.lancia();
            d2.lancia();
            System.out.println(String.format("dado 1: %s -- dado 2: %s", d1, d2));
        }
    }
}

class Dado {
    private int valore;
    private final int facce = 6;

    public void lancia() {
        Random rnd = new Random();
        valore = rnd.nextInt(facce) + 1;

    }

    public int getValore() {
        return valore;
    }

    public int getFacce() {
        return facce;
    }

    public String toString() {
        return "Dado [valore=" + valore + "]";
    }

}