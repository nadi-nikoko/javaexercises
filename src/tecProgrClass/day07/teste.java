package tecProgrClass.day07;

import java.util.ArrayList;
import java.util.List;

public class teste {

    private ArrayList<Integer> twoNum;

    public teste() {
        this.twoNum = new ArrayList<>();
    }

    public static void main(String[] args) {
        teste array = new teste();
        array.add(5);
        array.add(3);
        System.out.println(array.findSmaller());
    }

    private void add(int i) {
        this.twoNum.add(i);
    }

    public int findSmaller() {
        int max = twoNum.get(0);
        for (int num : twoNum) {
            if (max > twoNum.get(1))
                max = twoNum.get(1);
        }
        return max;
    }
}
