package javaClass.extraexercises;

public class LinearSequence {
    public static void main(String[] args) {
        int x[] = { 1, 2, 3, 4, 5 };
        int n = 3;
        int y[] = new int[x.length];

        for (int i = 0; i < x.length; i++) {
            if (i == 0)
                y[i] = x[i] + n;
            else
                y[i] = x[i] + (i * n);
        }

        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i] + ", ");
        }
    }
}
