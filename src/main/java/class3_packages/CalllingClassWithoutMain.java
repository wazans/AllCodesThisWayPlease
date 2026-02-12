package class3_packages;
import java.lang.Math;

public class CalllingClassWithoutMain {

	public static void main(String[] args) {
		// STEP 1:
		// Creating an object of MyClassWithoutMain
		MyClassWithoutMain obj = new MyClassWithoutMain();

		// STEP 2:
		// Accessing the variable x from MyClassWithoutMain
		System.out.println("Value of x: " + obj.x);
		System.out.println((Math.random()));

	}

}
