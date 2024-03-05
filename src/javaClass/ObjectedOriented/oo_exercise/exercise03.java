/*
 * Rappresemtare um tipo dado com una azione lancia che modifica lo stato del deado in maneira casuale
 * 
 */

package javaClass.ObjectedOriented.oo_exercise;

import java.util.Random;

public class exercise03 {
    public static void main(String[] args) {
        Dado d1 = new Dado();
        Dado d2 = new Dado();

        int vitd1 = 0;
        int vitd2 = 0;
        int index = 0;
        while (vitd1 < 1000 || vitd2 < 1000) {
            d1.lancia();
            d2.lancia();
            System.out.println(String.format("dado 1: %s -- dado 2: %s", d1, d2));
            if (d1.getValore() > d2.getValore())
                vitd1++;
            if (d2.getValore() > d1.getValore())
                vitd2++;
            index++;
        }
        if (vitd1 < vitd2)
            System.out.println("dado 2 is the winner");
        if (vitd1 > vitd2)
            System.out.println("dado 2 is the winner");

        System.out.println("in total the dars were played " + index);
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