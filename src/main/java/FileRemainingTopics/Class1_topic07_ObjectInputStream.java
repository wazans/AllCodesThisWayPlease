
package FileRemainingTopics;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Class1_topic07_ObjectInputStream {
	public static void main(String[] args) {

		// THEORY:
		// ObjectInputStream reads object back from file.

		try {
			// Step 1: Create stream
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"));

			// Step 2: Read object
			Class1_topic05_SerializableStudent s = (Class1_topic05_SerializableStudent) ois.readObject();

			// Step 3: Display data
			System.out.println("ID: " + s.id);
			System.out.println("Name: " + s.name);

			// Step 4: Close stream
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// OUTPUT:
		// ID: 1
		// Name: Amit

		// OUTPUT EXPLANATION:
		// Object is reconstructed from file successfully.
	}
}
