package javaClass.extraexercises;

public class CopyArray {
    public static void main(String[] args) {
        int x[] = {};
        int y[] = new int[x.length];

        if (x.length < 0) {
            x = null;
        }

        for (int i = 0; i < x.length; i++) {
            y[i] = x[i];
        }

        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }
    }
}
