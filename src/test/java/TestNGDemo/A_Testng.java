package TestNGDemo;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A_Testng {
	@BeforeClass
	public static void classBefore() {
		System.out.println("before class");
	}
	
	@BeforeTest
	public static void methodBefore() {
		System.out.println("before test");
	}
	@Test
	public static void mymethodOne() {
		System.out.println("boy");
	}

	@Test(priority = 2)
	public static void mymethodTwo() {
		System.out.println("girl");
	}

	@Test(priority = 1)
	public static void mymethodThird() {
		System.out.println("men");
	}
	@AfterTest
	public static void methodafter() {
		System.out.println("after test");
	}
	@AfterClass
	public static void classafter() {
		System.out.println("after class");
	}
}
