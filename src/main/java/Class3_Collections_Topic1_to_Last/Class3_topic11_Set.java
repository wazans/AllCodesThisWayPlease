package Class3_Collections_Topic1_to_Last;


import java.util.Set;
import java.util.HashSet;

public class Class3_topic11_Set {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<Integer>();

        set.add(1);
        set.add(3);
        set.add(12);
        set.add(23);
        set.add(2);
        System.out.println(set.contains(43));
    
        

        System.out.println(set);

        /*
         OUTPUT:
         [1]

         EXPLANATION:
         - Set does not allow duplicates
        */
    }
}
