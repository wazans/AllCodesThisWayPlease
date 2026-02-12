package Class2_Java_Threads;
public class Class2_topic05_Callback implements Runnable {
    public void run() {
        System.out.println("run() called by JVM");
    }
    public static void main(String[] args) {
        Thread t = new Thread(new Class2_topic05_Callback());
        t.start();
        // Output:
        // run() called by JVM
        // Explanation:
        // JVM calls run() automatically (callback)
    }
}
