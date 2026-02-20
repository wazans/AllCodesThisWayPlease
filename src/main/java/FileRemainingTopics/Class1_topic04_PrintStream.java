
package FileRemainingTopics;

import java.io.PrintStream;
import java.io.File;

public class Class1_topic04_PrintStream {
	public static void main(String[] args) {

		// THEORY:
		// PrintStream is used to write formatted data easily.
		// System.out is a PrintStream object.

		try {
			// Step 1: Create PrintStream
			PrintStream ps = new PrintStream(new File("log.txt"));

			// Step 2: Write text
			ps.println("Java PrintStream Example");

			// Step 3: Close stream
			ps.close();

			System.out.println("Log written");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// OUTPUT:
		// Log written

		// OUTPUT EXPLANATION:
		// Data is written into log.txt using println method.
	}
}
