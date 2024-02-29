package tecProgrClass.day04;

public class exercise01 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int x = 0;

        for (int a : arr) {
            a = (6 * x);
            x++;
            System.out.println(a);
        }

    }
}
