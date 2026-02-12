
package class3_packages;

class DefaultClass {

    // Default access method
    void show() {
        System.out.println("Default access method");
    }
}

public class Class3_topic07_DefaultAccess {

    public static void main(String[] args) {

        // STEP 1:
        // DefaultClass is accessible inside same package
        DefaultClass obj = new DefaultClass();

        // STEP 2:
        obj.show();
    }

    /*
    OUTPUT:
    Default access method

    OUTPUT EXPLANATION:
    Default access works only within same package.
    */
}
