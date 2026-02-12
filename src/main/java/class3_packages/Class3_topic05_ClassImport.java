
package class3_packages;

import java.util.ArrayList;

public class Class3_topic05_ClassImport {

    public static void main(String[] args) {

        // STEP 1:
        // ArrayList imported using import statement
        ArrayList list = new ArrayList();

        // STEP 2:
        list.add(10);
        list.add(20);

        // STEP 3:
        System.out.println(list);
    }

    /*
    OUTPUT:
    [10, 20]

    OUTPUT EXPLANATION:
    Import statement allows using class name directly.
    */
}
