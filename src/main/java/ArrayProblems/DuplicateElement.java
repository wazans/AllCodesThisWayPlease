package ArrayProblems;

import java.util.*;

public class DuplicateElement {
    public static void main(String[] args) {
        // Array with duplicate elements
        int a[] = {1, 2, 1, 3, 3, 4, 4, 5};
        // HashSet to store non-duplicate elements
        Set<Integer> nonDuplicateSet = new HashSet<>();
        // Iterate through the array and add elements to the HashSet
        for (int i = 0; i < a.length; i++) {
            nonDuplicateSet.add(a[i]); // HashSet automatically handles duplicates
        }
        // Print non-duplicate elements from the HashSet
        System.out.print("Non-duplicate elements: ");
        for (Integer i : nonDuplicateSet) {
            System.out.print(i + " "); // Print each non-duplicate element
        }
        System.out.println(); // Move to the next line after printing all elements
    }
}
