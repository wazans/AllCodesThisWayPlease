package Class3_Collections_Topic1_to_Last;


import java.util.ArrayList;

public class Class3_topic03_Generics {

    public static void main(String[] args) {

        // Generic ArrayList allows only String type
        ArrayList<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
        list.add("Ruby");
        list.add("Go");
        list.add(12);  // This will cause a compile-time error

        //iterate through the list and print each element
       for(String s:list)
       {
    	   System.out.println(s);
       }
    }
}
