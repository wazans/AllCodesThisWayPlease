package Class2_Java_Threads;
public class Class2_topic11_Deadlock {
    static Object A = new Object();
    static Object B = new Object();
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized(A) {
                synchronized(B) {}
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized(B) {
                synchronized(A) {}
            }
        });
        t1.start(); t2.start();
        // Output:
        // Program hangs (deadlock)
    }
}
