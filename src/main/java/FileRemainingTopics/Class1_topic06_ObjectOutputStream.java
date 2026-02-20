
package FileRemainingTopics;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Class1_topic06_ObjectOutputStream {
	public static void main(String[] args) {

		// THEORY:
		// ObjectOutputStream writes complete object into file.

		try {
			// Step 1: Create object
			Class1_topic05_SerializableStudent s = new Class1_topic05_SerializableStudent(1, "Amit");

			// Step 2: Create streams
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"));

			// Step 3: Write object
			oos.writeObject(s);

			// Step 4: Close stream
			oos.close();

			System.out.println("Object Serialized");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// OUTPUT:
		// Object Serialized

		// OUTPUT EXPLANATION:
		// Student object state is saved into student.ser file.
	}
}
