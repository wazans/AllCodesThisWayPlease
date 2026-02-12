package Class3_Collections_Topic1_to_Last;


import java.util.ArrayList;
import java.util.List;

public class Class3_topic05_ArrayList {

    public static void main(String[] args) {

    	List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

		 // Remove element at index 0
        list.remove(3);

        System.out.println(list);
        

        /*
         OUTPUT:
         [2]

         EXPLANATION:
         - Element at index 0 removed
         - Remaining elements shift left
        */
    }
}
