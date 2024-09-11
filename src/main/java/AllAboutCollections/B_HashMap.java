package AllAboutCollections;

import java.util.HashMap;

public class B_HashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hs=new HashMap();
        //No duplicate keys: Each key can map to at most one value.
        hs.put(1,"Delhi");
        hs.put(1,"Kolkata");//will replace
        //Allows null values and one null key.
        hs.put(null,"no city");
        hs.put(null,"another no city");//will replace
        hs.put(11,null);//allows null values but only one null key
        System.out.println(hs);
        //Not synchronised: If multiple threads access a HashMap concurrently, and at least one of the threads modifies the map structurally, it must be synchronized externally.
        //Does not maintain insertion order: The order of keys and values can change.
        HashMap<String, String> map = new HashMap<>();
        map.put("One", "1");
        map.put("Two", "2");
        map.put("Three", "3");
        map.put("Four", "4");

        // Print the map
        System.out.println(map); // Output could be in any order, e.g., {Three=3, One=1, Four=4, Two=2}
    }
}
