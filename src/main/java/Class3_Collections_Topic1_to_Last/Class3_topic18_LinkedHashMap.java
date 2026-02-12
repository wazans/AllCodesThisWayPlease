package Class3_Collections_Topic1_to_Last;


import java.util.LinkedHashMap;

public class Class3_topic18_LinkedHashMap {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();

        map.put(2,"B");
        map.put(1,"A");
        map.put(2,"C");// duplicate key, will overwrite previous value
        map.put(3,"D");
        map.put(null,"E");
        map.put(1,"F");System.out.println(map);

        /*
         OUTPUT:
         {2=B, 1=A}

         EXPLANATION:
         - Maintains insertion order
        */
    }
}
