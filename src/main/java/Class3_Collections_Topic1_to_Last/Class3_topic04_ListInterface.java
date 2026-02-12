package Class3_Collections_Topic1_to_Last;


import java.util.List;
import java.util.ArrayList;

public class Class3_topic04_ListInterface {

    public static void main(String[] args) {

        // List reference using ArrayList object
        List<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("A");
        list.add("C");
        list.remove("C");
        list.add("D");
        

        for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

        /*
         OUTPUT:
         A

         EXPLANATION:
         - List allows index based access
         - Maintains insertion order
        */
    }
}
