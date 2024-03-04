package javaClass.extraexercises;

public class FindMedianSortedArrays {
    public static void main(String[] args) {
        int x[] = { 1, 2, 3 };
        int y[] = { 1, 2, 3 };
        System.out.println(MedianSortedArrays(x, y));
    }

    public static double MedianSortedArrays(int[] nums1, int[] nums2) {
        double total = 0;
        for (int num1 : nums1) {
            total += num1;
        }
        for (int num2 : nums2) {
            total += num2;
        }
        total = total / (nums1.length + nums2.length);
        return total;
    }
}
