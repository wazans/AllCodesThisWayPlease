package AllAboutCollections;

import java.util.HashMap;
import java.util.Map;

public class D_IterationWithStream_HashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"E");

        map.entrySet().stream().forEach(System.out::println);
        //or....
        for (Integer i : map.keySet()) {
            System.out.println(i);
        }
        //or...
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
