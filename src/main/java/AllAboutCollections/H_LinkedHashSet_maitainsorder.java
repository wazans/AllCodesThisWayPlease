package AllAboutCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class H_LinkedHashSet_maitainsorder {
    public static void main(String[] args) {
        //Set<String> LinkhashSet=new HashSet<>();
        Set<String> LinkhashSet=new LinkedHashSet<>();
        LinkhashSet.add("Apple");
        LinkhashSet.add("Banana");
        LinkhashSet.add("Cherry");
        //LinkedHashSet: Maintains insertion order
        LinkhashSet.stream().forEach(System.out::println);
    }
}
