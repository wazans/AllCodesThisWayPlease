
package FileRemainingTopics;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Class1_topic02_OutputStream {
	public static void main(String[] args) {

		// THEORY:
		// OutputStream is used to write raw byte data into a file.

		try {
			// Step 1: Create OutputStream connected to file
			OutputStream out = new FileOutputStream("data.txt");

			// Step 2: Write data as bytes
			out.write("Hello Java".getBytes());

			// Step 3: Flush and close
			out.flush();
			out.close();

			System.out.println("Data written successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// OUTPUT:
		// Data written successfully

		// OUTPUT EXPLANATION:
		// The message confirms that bytes are written into data.txt file.
	}
}
