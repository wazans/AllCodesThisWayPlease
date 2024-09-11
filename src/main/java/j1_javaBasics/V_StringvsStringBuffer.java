package j1_javaBasics;

public class V_StringvsStringBuffer {
    public static void main(String[] args) {
        // Immutable String Example
        String original = "Hello";
        String modified = original.concat(" World");

        // Printing modified and original strings
        System.out.println("Modified String (String): " + modified);
        System.out.println("Original String (String): " + original);

        /*
         * In this example:
         * - original is "Hello".
         * - modified is a new string "Hello World" created by concatenating " World" to original.
         * - original remains unchanged after concatenation.
         *
         * This demonstrates that strings in Java are immutable, meaning:
         * - Once a string is created, its content cannot be changed.
         * - Any operation that appears to modify a string actually creates a new string object.
         */

        // Mutable StringBuffer Example
        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append(" World");

        // Printing StringBuffer content
        System.out.println("Modified String (StringBuffer): " + buffer);

        /*
         * StringBuffer (or StringBuilder) in Java:
         * - Unlike String, StringBuffer and StringBuilder are mutable.
         * - They can be modified in-place without creating new objects.
         * - append() method in StringBuffer adds the specified string at the end of the existing content.
         *
         * For example:
         * - Initially, buffer is "Hello".
         * - After appending " World", buffer becomes "Hello World".
         *
         * StringBuffer is preferred in scenarios where frequent modifications to strings are required
         * because it avoids the overhead of creating new string objects.
         */

        // Mutable StringBuilder Example
        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" World");

        // Printing StringBuilder content
        System.out.println("Modified String (StringBuilder): " + builder);

        /*
         * StringBuilder in Java:
         * - StringBuilder is similar to StringBuffer but is not synchronized.Mutable but not synchronized.
         * - It is preferred in single-threaded environments for better performance.
         * - Like StringBuffer, StringBuilder can be modified in-place using methods like append().
         *
         * In this example:
         * - Initially, builder is "Hello".
         * - After appending " World", builder becomes "Hello World".
         */

    }
}
