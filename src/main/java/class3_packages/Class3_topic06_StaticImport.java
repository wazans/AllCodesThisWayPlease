
package class3_packages;
import static java.lang.Math.PI;

import static java.lang.Math.sqrt;

public class Class3_topic06_StaticImport {

    public static void main(String[] args) {

        // STEP 1:
        // Using static members directly due to static import
        System.out.println(PI);

     
    }

    /*
    OUTPUT:
    3.141592653589793
    4.0

    OUTPUT EXPLANATION:
    Static import removes need of class name for static members.
    */
}
