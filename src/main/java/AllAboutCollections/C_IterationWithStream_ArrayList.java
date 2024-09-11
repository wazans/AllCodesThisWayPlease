package AllAboutCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors; // This import is needed for certain collection operations
import java.util.stream.Stream; // General stream operations


public class C_IterationWithStream_ArrayList {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        fruits.stream().forEach(System.out::println);
        ///or....

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
