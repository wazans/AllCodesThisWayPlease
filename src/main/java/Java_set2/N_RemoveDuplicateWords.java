package Java_set2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class N_RemoveDuplicateWords {
    public static void main(String[] args) {
        String s="my my name is is ali";
        String[] words=s.split(" ");
        Set<String> nondup=new LinkedHashSet<>(Arrays.asList(words));
        System.out.println(nondup);
        System.out.println(String.join(" ", nondup));

    }
}
