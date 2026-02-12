package Class3_Collections_Topic1_to_Last;


import java.util.ArrayList;

public class Class3_topic06_TypeErasure {

    public static void main(String[] args) {

        // Generic type exists only at compile time
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);

        System.out.println(list);

        /*
         OUTPUT:
         [10]

         EXPLANATION:
         - At runtime generic type is removed
         - This is called Type Erasure
        */
    }
}
