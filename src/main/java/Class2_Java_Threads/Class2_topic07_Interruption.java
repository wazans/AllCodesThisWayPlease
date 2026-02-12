package Class2_Java_Threads;
public class Class2_topic07_Interruption extends Thread {
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
    public static void main(String[] args) {
        Class2_topic07_Interruption t = new Class2_topic07_Interruption();
        t.start();
        t.interrupt();
        // Output:
        // Thread interrupted
    }
}
