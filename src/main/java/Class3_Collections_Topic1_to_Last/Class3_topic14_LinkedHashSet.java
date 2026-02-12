package Class3_Collections_Topic1_to_Last;


import java.util.LinkedHashSet;

public class Class3_topic14_LinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

        set.add(3);
        set.add(1);
        set.add(12);
        set.add(23);
        set.add(2);
        set.add(3); // duplicate, will be ignored
        System.out.println(set.contains(12));
        System.out.println(set.getFirst());
        System.out.println(set);

        /*
         OUTPUT:
         [3, 1]

         EXPLANATION:
         - Maintains insertion order
        */
    }
}
