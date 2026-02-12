package Class2_Java_Threads;
public class Class2_topic06_Lifecycle extends Thread {
    public void run() {
        System.out.println("Thread in RUNNING state");
    }
    public static void main(String[] args) {
        Class2_topic06_Lifecycle t = new Class2_topic06_Lifecycle();
        t.start();
        // Output:
        // Thread in RUNNING state
    }
}
