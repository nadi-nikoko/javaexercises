package tecProgrClass.day07;

public class SortingString {
    public static void main(String[] args) {

        String[] names = { "zero", "nadi", "nicoco", "lucia", "maria", "andre" };
        String nametemp = "";
        int index = 0;

        while (index < names.length) {
            for (int i = 0; i < names.length - 1; i++) {
                if (names[i].compareTo(names[i + 1]) > 0) {
                    nametemp = names[i];
                    names[i] = names[i + 1];
                    names[i + 1] = nametemp;
                }
            }
            index++;
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
