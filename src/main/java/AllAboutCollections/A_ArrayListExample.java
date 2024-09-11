package AllAboutCollections;

import java.util.ArrayList;

public class A_ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Print the list
        System.out.println("Fruits: " + fruits);

        // Access an element
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Remove an element
        fruits.remove("Banana");
        System.out.println("Fruits after removal: " + fruits);

        // Iterate over elements
        for (String fruit : fruits) {
            System.out.print(fruit+" ");
        }

        // Size of the list
        int size = fruits.size();
        System.out.println("Number of fruits: " + size);
    }
}
