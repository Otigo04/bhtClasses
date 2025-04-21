package Lists;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("OTUNGA");
        arrayList.add("BERLIN");
        arrayList.add("ORHIGO");

        List<String> linkedList = new LinkedList<>(arrayList);

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
    }
}
