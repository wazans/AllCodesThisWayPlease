package Class3_Collections_Topic1_to_Last;


import java.util.Vector;

public class Class3_topic07_Vector {

    public static void main(String[] args) {

        // Vector is synchronized (thread-safe)
        Vector<String> v = new Vector<String>();

        v.add("A");
        v.add("B");
        v.add("A"); // allows duplicates
        v.add("C");
        v.add("D");
        System.out.println(v.firstElement());
        

        System.out.println(v);

        /*
         OUTPUT:
         [A, B]

         EXPLANATION:
         - Vector is legacy class
         - Slower than ArrayList
        */
    }
}
