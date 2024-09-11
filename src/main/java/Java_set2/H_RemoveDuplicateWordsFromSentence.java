package Java_set2;

import java.util.*;

public class H_RemoveDuplicateWordsFromSentence {
    public static void main(String[] args) {
        String s = "my name is is wasim wasim";
        String[] words = s.split(" ");

        // Using a LinkedHashSet to store unique words
        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));
        System.out.println(uniqueWords);
        System.out.println(String.join(" ",uniqueWords));
    }
}
