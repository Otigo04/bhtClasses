package MapsUndCollections;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"OTUNGA");
        map.put(2,"ORHIGO");
        map.put(3,"VENEZUELA");

        System.out.println("Map: " + map);
        System.out.println("Value for key 2: " + map.get(2));
    }
}
