package AllAboutCollections;

import java.util.HashSet;
import java.util.Set;


public class G_HashSetExample {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        //     No Duplicates: Set does not allow duplicate elements.
        hashSet.add("Apple");
        // HashSet: No guaranteed order.
        for (String s : hashSet) {
            System.out.println(hashSet);
        }
    }




}
