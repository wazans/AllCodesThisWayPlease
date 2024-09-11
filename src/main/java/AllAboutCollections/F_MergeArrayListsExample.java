package AllAboutCollections;

import java.util.ArrayList;

public class F_MergeArrayListsExample {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("Apple");
        al1.add("Banana");


        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Cherry");
        al2.add("Date");
        al1.addAll(al2);
        for (String s : al1) {
            System.out.println(s);
        }
       
    }
}
