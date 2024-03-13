package javaClass.ObjectedOriented;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("One", "1");
        map.put("Five", "5");
        map.put("Four", "4");
        map.put("Two", "2");
        map.put("Three", "3");
        System.out.println("HashMap: " + map);

        Map<String, String> map2 = new LinkedHashMap<>();
        map2.put("One", "1");
        map2.put("Five", "5");
        map2.put("Four", "4");
        map2.put("Two", "2");
        map2.put("Three", "3");
        System.out.println("LinkedHashMap: " + map2);

        Map<String, String> map3 = new TreeMap<>();
        map3.put("One", "1");
        map3.put("Five", "5");
        map3.put("Four", "4");
        map3.put("Two", "2");
        map3.put("Three", "3");
        System.out.println("TreeMap: " + map3);
    }
}