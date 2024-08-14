package DSA.Hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        // Adding element in map
        // (key:dish,value:price)
        map.put("Rice", 80);
        map.put("soup", 50);
        map.put("Noodle", 70);
        // printing maps
        System.out.println(map);
        // updating value in map
        map.put("Rice", 120);
        System.out.println(map);
        // searching
        if (map.containsKey("pizza")) {
            System.out.println("key is present");
        } else {
            System.out.println("key is not present");
        }
        System.out.println(map.get("Rice"));
        System.out.println(map.get("pizza"));
        // Iteration type 1
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.print(e.getKey() + " ");
            System.out.print(e.getValue());
            System.out.println();
        }
        // Iteration (2)
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }
        //removing element
        map.remove("Rice");
        System.out.println(map);
    }
}
