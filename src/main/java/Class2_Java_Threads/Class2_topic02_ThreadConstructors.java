package Class2_Java_Threads;
import java.lang.Thread;
public class Class2_topic02_ThreadConstructors {
	
    public static void main(String[] args) {
        Thread t1 = new Thread();//listening to music
    
        Thread t2 = new Thread("updated Thread");//watchng movie
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        // Output:
        // Thread-0
        // MyThread
        // Explanation:
        // JVM assigns default name if not provided
    }
}
