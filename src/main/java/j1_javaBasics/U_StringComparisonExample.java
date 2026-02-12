package j1_javaBasics;

public class U_StringComparisonExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        //When you create a string using the new keyword, 
        //it creates a new object on the heap
        String str3 = "Hello";
        //Both str1 and str3 refer to the same object 
        //because they are initialized with the same literal.

        // Using == for reference equality
        //The == operator checks if two references point to the same object.
        System.out.println("Using == for reference equality:");
        System.out.println("str1 == str2: " + (str1 == str2)); // false
        System.out.println("str1 == str3: " + (str1 == str3)); // true


        // Using equals for content equality
        //The equals method checks if two objects have the same content.
        System.out.println("\nUsing equals for content equality:");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true

        /*

            String str1 = "Hello";
                    This creates a string "Hello" and stores it in the string pool.
            String str3 = "Hello";
                    Since "Hello" is already in the string pool, str3 refers to the same object as str1.
            String str2 = new String("Hello");
                    This creates a new string object in memory, separate from the string pool.
         */
    }
}