
package FileRemainingTopics;

import java.io.File;

public class Class1_topic01_FileClass {
	public static void main(String[] args) {

		// THEORY:
		// File class represents a file or directory path in Java.
		// It does NOT read or write data, it only gives information about the file.

		// Step 1: Create File object
		File f = new File("sample.txt");

		// Step 2: Display file details
		System.out.println("Path: " + f.getPath());
		System.out.println("Absolute Path: " + f.getAbsolutePath());
		System.out.println("Exists: " + f.exists());

		// OUTPUT:
		// Path: sample.txt
		// Absolute Path: C:\...\sample.txt
		// Exists: false

		// OUTPUT EXPLANATION:
		// Path shows file name.
		// Absolute path shows full location.
		// Exists is false because file is not created yet.
	}
}
