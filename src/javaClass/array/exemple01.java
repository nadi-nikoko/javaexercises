package javaClass.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class exemple01 {

    public static void main(String[] args) {

        Map<String, String> states = new HashMap<String, String>();
        states.put("ca", "California");
        states.put("az", "Arizona");
        states.put("mn", "Minnesota");
        states.put("nj", "New Jersey");

        System.out.println(states.get("ca")); // California
        System.out.println(states.get("zz")); // null (no entry for key "zz")
        states.put("ca", "The Golden State"); // Overwrite the old entry

        // Pull out live Collection of all the values.
        Collection<String> values = states.values();
        System.out.println(values); // [Minnesota, New Jersey, The Golden State, Arizona]

        // Pull out live set of the keys -- use to print key->value for
        // the whole map. The order of the keys is random for a HashSet.
        Set<String> keys = states.keySet();
        for (String key : keys) {
            System.out.println(key + "->" + states.get(key));
        }
        // mn->Minnesota
        // nj->New Jersey
        // ca->The Golden State
        // az->Arizona

        // More complex -- create a map of Strings to Lists of Integers
        Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
        List<Integer> nums = new ArrayList<Integer>();
        nums.addAll(Arrays.asList(1, 2, 3, 4, 5));
        map.put("1-5", nums);
    }
}
