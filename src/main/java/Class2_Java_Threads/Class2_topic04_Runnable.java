package Class2_Java_Threads;
public class Class2_topic04_Runnable implements Runnable {
    public void run() {
        System.out.println("Runnable thread executed");
    }
    public static void main(String[] args) {
    	Runnable r = new Class2_topic04_Runnable();
        Thread t = new Thread(r);
        t.start();
        // Output:
        // Runnable thread executed
    }
}
