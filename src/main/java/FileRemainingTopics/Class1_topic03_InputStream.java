
package FileRemainingTopics;

import java.io.FileInputStream;
import java.io.InputStream;

public class Class1_topic03_InputStream {
	public static void main(String[] args) {

		// THEORY:
		// InputStream reads raw byte data from a file.

		try {
			// Step 1: Create InputStream
			InputStream in = new FileInputStream("data.txt");

			// Step 2: Read byte by byte
			int data;
			while ((data = in.read()) != -1) {
				System.out.print((char) data);
			}

			// Step 3: Close stream
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// OUTPUT:
		// Hello Java

		// OUTPUT EXPLANATION:
		// Each byte is converted to character and printed.
	}
}
