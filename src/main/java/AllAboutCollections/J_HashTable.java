package AllAboutCollections;

import java.util.HashMap;
import java.util.Hashtable;

public class J_HashTable {
    public static void main(String[] args) {
        Hashtable<String,Integer> hashtable=new Hashtable<>();
        hashtable.put("Alice", 890);
        hashtable.put("Bob", 987-654-3210);
        //hashtable.put("C", null); //NullPointerException
//        Characteristics of Hashtable
//        Synchronized: Thread-safe.
//                Legacy: Older class, not recommended for new code.
//                No Nulls: Does not allow null keys or values.
        // Iterate over key-value pairs
        for (String key : hashtable.keySet()) {
            System.out.println("Name: " + key + ", Phone: " + hashtable.get(key));

        }


    }
}
