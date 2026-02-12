package Class2_Java_Threads;
public class Class2_topic03_StartingThread extends Thread {
    public void run() {
        System.out.println("Thread running");
    }
    public static void main(String[] args) {
        Class2_topic03_StartingThread t = new Class2_topic03_StartingThread();
        t.start();
        // Output:
        // Thread running
        // Explanation:
        // start() creates new thread and calls run()
    }
}
