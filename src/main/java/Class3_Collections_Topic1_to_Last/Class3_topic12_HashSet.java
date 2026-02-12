package Class3_Collections_Topic1_to_Last;


import java.util.HashSet;

public class Class3_topic12_HashSet {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();

        set.add("Java");
        set.add("Java");
        set.add("Ruby");
        set.add("Python");
        set.add("C++");

        System.out.println(set);

        /*
         OUTPUT:
         [Java]

         EXPLANATION:
         - Uses hashCode()
         - No order guaranteed
        */
    }
}
