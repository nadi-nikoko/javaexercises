package javaClass.array;

public class SimpleStatistcs {

    public static void main(String[] args) {
        int data[] = { 12, 5, 2, 5, 2, 5 };
        System.out.println(sum(data));
        if (data.length == 0 || data == null) {
            System.out.println("empty array");
        }
    }

    public static int minimum(int[] data) {
        int res = data[0];
        for (int i = 0; i < data.length; i++) {
            if (res > data[i]) {
                res = data[i];
            }
        }
        return res;
    }

    public static int maximum(int[] data) {
        int res = data[0];
        for (int i = 0; i < data.length; i++) {
            if (res < data[i]) {
                res = data[i];
            }
        }
        return res;
    }

    public static double sum(int[] data) {
        double total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        return total;
    }

    public static double average(int[] data) {
        double total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        total = total / data.length;
        return total;
    }
}
