/*
 * Create a tipo that represents a dot in a cartseian plan
 * o objeto nao pode ser modificavel
 * escreva to strin and equals
 * escrevi um main com um exemplo
 */

package javaClass.ObjectedOriented.oo_exercise;

public class exercise01 {

    public static void main(String[] args) {
        Punto p2 = new Punto(8, 7);
        Point pp1 = new Point(4, 5);
        pp1.move(3, 3);

        System.out.println(pp1.toString());
        pp1.move(3, 3);
        System.out.println(pp1.toString());
    }

}

class Punto {
    private final int x;
    private final int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Punto [x=" + x + ", y=" + y + "]";
    }

    public int getY() {
        return y;
    }

    /*
     * public Punto(int x, int y) {
     * int z = 10;
     * int w = 10;
     * 
     * int[][] cartesian = new int[z][w];
     * 
     * for (int i = 0; i < cartesian.length; i++) {
     * for (int j = 0; j < cartesian.length; j++) {
     * cartesian[j][i] = 1;
     * cartesian[x][y] = 0;
     * System.out.print("    " + cartesian[j][i]);
     * }
     * System.out.println();
     * }
     * System.out.println();
     * }
     * public String toString() {
     * return "Punto [x=" + x + ", y=" + y + "]";
     * }
     */
}

record Point(int x, int y) {
    public Point move(int deltax, int deltay) {
        return new Point(
                (x + deltax),
                (y + deltay));

    }
}