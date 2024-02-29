/*
 * 
 * write a program where compares 2 arrays of int
 */

package javaClass.array;

import java.util.Arrays;

public class exercise01 {

    public static void main(String[] args) {

        int x[] = { 1, 3, 5, 7 };
        int y[] = { 1, 3, 5, 8 };
        int count = 0;
        int yL = y.length;
        int xL = x.length;
        boolean b = true;

        if (xL != yL) {
            b = false;
        }
        /*
         * while (count < xL && b) {
         * if (x[count] != y[count]) {
         * b = false;
         * } else
         * b = true;
         * count++;
         * }
         */

        for (int i = 0; i < xL; i++) {
            if (x[i] != y[i]) {
                b = false;
            } else
                b = true;
        }
        System.out.println(b);

        /*
         * if (xL == yL) {
         * while (x[count] == y[count]) {
         * if (!(count == xL && count == yL))
         * count++;
         * if (xL == count) {
         * System.out.println("they are the same");
         * break;
         * }
         */
    }
}
