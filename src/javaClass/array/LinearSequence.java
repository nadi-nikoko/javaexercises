package javaClass.array;

public class LinearSequence {
    public static void main(String[] args) {

        int[] numeri = new int[10];
        ArrayTools.stampa(numeri);
        ArrayTools.LinearSequence(numeri, -1, numeri.length);
        ArrayTools.stampa(numeri);
    }
}
