package Class3_Collections_Topic1_to_Last;


import java.util.Map;
import java.util.HashMap;

public class Class3_topic16_Map {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<Integer,String>();

        map.put(1,"Java");
 
        map.put(21,"Python");
       // duplicate key, will overwrite previous value
		map.put(4,"C++");
		map.put(3,"Ruby"); // duplicate key, will overwrite previous value
        System.out.println(map);
       
        

        /*
         OUTPUT:

         EXPLANATION:
         - Map stores key-value pairs
         - Keys are unique
        */
    }
}
