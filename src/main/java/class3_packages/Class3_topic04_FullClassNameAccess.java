
package class3_packages;

public class Class3_topic04_FullClassNameAccess {

    public static void main(String[] args) {

        // STEP 1:
		// Accessing class using full class name (including package)
    	class3_packages.MyClassWithoutMain obj = new class3_packages.MyClassWithoutMain();
		System.out.println("[" + obj.x + ", B]");
       
    }

    /*
    OUTPUT:
    [A, B]

    OUTPUT EXPLANATION:
    Full class name includes package + class.
    Import statement is not required.
    */
}
