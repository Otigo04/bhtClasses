package MapsUndCollections;

import java.util.*;

public class SortingTable {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Banana", "Apple", "Cherry", "Adolfo", "Beinschere");
        Collections.sort(list);
        System.out.println(list);

        List<Integer> numbers = Arrays.asList(5, 2, 8, 1);
        numbers.sort(Comparator.reverseOrder());
        System.out.println("Reverse sorted numbers: " + numbers);
    }
}
