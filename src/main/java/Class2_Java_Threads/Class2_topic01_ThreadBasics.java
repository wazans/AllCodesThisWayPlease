package Class2_Java_Threads;
import java.lang.Thread;
public class Class2_topic01_ThreadBasics {
	
    public static void main(String[] args) {
        // JVM starts execution with main thread
        System.out.println("my name is: " + Thread.currentThread().getName());
        // Output:
        // Current Thread: main
        // Explanation:
        // main thread is created by JVM automatically
        
    }
}
