package Selenium_Collections_Framework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

public class C_QueueAndParallelResultDemo {

	public static void main(String[] args) {
		Queue<String> frameworkSteps = new LinkedList<>();
		frameworkSteps.offer("Open browser");
		frameworkSteps.offer("Launch application");
		frameworkSteps.offer("Login");
		frameworkSteps.offer("Search employee");
		frameworkSteps.offer("Close browser");

		System.out.println("Queue example for framework step execution:");
		while (!frameworkSteps.isEmpty()) {
			System.out.println("Executing step: " + frameworkSteps.poll());
		}

		ConcurrentHashMap<String, String> parallelResults = new ConcurrentHashMap<>();
		parallelResults.put("Chrome_Test_01", "PASS");
		parallelResults.put("Edge_Test_01", "PASS");
		parallelResults.put("Firefox_Test_01", "FAIL");

		System.out.println("Thread-safe result storage: " + parallelResults);
	}
}
