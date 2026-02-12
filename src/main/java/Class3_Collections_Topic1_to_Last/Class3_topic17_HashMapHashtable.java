package Class3_Collections_Topic1_to_Last;


import java.util.HashMap;
import java.util.Hashtable;

public class Class3_topic17_HashMapHashtable {

    public static void main(String[] args) {

        

        Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
        ht.put(1,"Java");
        ht.put(2,"C"); 
        ht.put(7,"Python"); 
        ht.put(4,"Ruby");
        ht.put(2, "C++"); // duplicate key, will overwrite previous value
        ht.put(5, "Go");
        ht.put(3, "Ruby");

        System.out.println(ht);

       
    }
}
