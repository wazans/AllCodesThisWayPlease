package AllAboutCollections;

import java.util.Set;
import java.util.TreeSet;

public class I_TreeSet_sorts {
    public static void main(String[] args) {
        //TreeSet: Sorted order.
        Set<Integer> ts=new TreeSet<>();
        ts.add(3);
        ts.add(1);
        ts.add(4);
        ts.add(5);
        ts.add(6);
        ts.add(2);
        ts.add(77);
        ts.stream().forEach(System.out::println);



    }
}
