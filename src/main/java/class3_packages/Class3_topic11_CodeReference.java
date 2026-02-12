
package class3_packages;
import Class2_Java_Threads.Class2_topic11_Deadlock;


public class Class3_topic11_CodeReference {

    public static void main(String[] args) {

        // Classes inside same package
        // can access each other directly
    	Class2_topic11_Deadlock example = new Class2_topic11_Deadlock();

        System.out.println("Same package code reference");
    }

    /*
    OUTPUT:
    Same package code reference

    OUTPUT EXPLANATION:
    Classes in same package do not need import.
    */
}
