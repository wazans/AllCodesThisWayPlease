package AllAboutCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class E_CopyOnwriteDemo_ArrayList {
    public static void main(String[] args) {
        List<String> fruits = new CopyOnWriteArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        fruits.stream().forEach(System.out::println);
    }
}
