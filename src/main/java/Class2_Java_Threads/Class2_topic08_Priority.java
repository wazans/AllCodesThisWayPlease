package Class2_Java_Threads;
public class Class2_topic08_Priority {
    public static void main(String[] args) {
        Thread t = new Thread();
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t.getPriority());
        // Output:
        // 10
    }
}
