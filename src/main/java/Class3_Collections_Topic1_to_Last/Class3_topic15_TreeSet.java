package Class3_Collections_Topic1_to_Last;


import java.util.TreeSet;

public class Class3_topic15_TreeSet {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<Integer>();

        set.add(20);
        set.add(10);
        set.add(20); // duplicate, will be ignored
        set.add(15);
        set.add(32);
        set.add(35);
		

        System.out.println(set);

        /*
         OUTPUT:
         [10, 20]

         EXPLANATION:
         - Automatically sorted
        */
    }
}
