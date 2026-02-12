
package j1_javaBasics;

public class StringComparisonExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = "Hello";

        // Using == for reference equality
        System.out.println("Using == for reference equality:");
        System.out.println("str1 == str2: " + (str1 == str2)); // false
        System.out.println("str1 == str3: " + (str1 == str3)); // true

        // Using equals for content equality
        System.out.println("\nUsing equals for content equality:");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
    }
}
