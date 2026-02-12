package Class3_Collections_Topic1_to_Last;


import java.util.LinkedList;

public class Class3_topic10_LinkedList {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.add("D");
        list.add("B");
        list.add("Q");
        list.add("S");
//        list.addFirst("B");
//        list.addFirst("C");
//        list.addFirst("C");

        System.out.println(list);

        /*
         OUTPUT:
         [C, B, A]

         EXPLANATION:
         - Fast insertion at head
         - No shifting required
        */
    }
}
