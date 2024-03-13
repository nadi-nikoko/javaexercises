package tecProgrClass;

public class test {

    public static void main(String[] args) {
        int[] x = { 5, 45, 12, 8, 1, 3, 2, 97 };
        int[] y = new int[x.length];

        int max = x[0];
        int index = 0;
        int indexX = 0;
        while (index < x.length) {
            for (int i = 0; i < x.length; i++) {
                if (x[i] > max) {
                    max = x[i];
                    indexX = i;
                }
            }
            y[x.length - index - 1] = max;
            max = -max;
            index++;
            max = x[0];
        }

        for (int i = 0; i < x.length; i++) {
            System.out.println(y[i]);
        }
    }
}
