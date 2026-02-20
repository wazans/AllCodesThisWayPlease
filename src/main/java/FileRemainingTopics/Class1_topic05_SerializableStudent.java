
package FileRemainingTopics;

import java.io.Serializable;

public class Class1_topic05_SerializableStudent implements Serializable {

	// THEORY:
	// Serializable allows object state to be saved into file.

	private static final long serialVersionUID = 1L;

	int id;
	String name;

	public Class1_topic05_SerializableStudent(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {

		// Dummy main for exam requirement
		System.out.println("Serializable class created");

		// OUTPUT:
		// Serializable class created

		// OUTPUT EXPLANATION:
		// Confirms class supports serialization.
	}
}
