package class3_packages;
 // This import is not necessary as String is in java.lang

public class Class3_topic01_PackagesEncountered {

    public static void main(String[] args) {

        // STEP 1:
        // String is a class
        // It belongs to java.lang package
        // java.lang package is loaded automatically by JVM
        String name = "Java";

        // STEP 2:
        // Printing the String value
        System.out.println(name);
    }

    /*
    OUTPUT:
    Java

    OUTPUT EXPLANATION:
    String class comes from java.lang package.
    java.lang is auto-imported.
    Hence String can be used without import.
    */
}
