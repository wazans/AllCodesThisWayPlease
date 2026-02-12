package Class2_Java_Threads;

/*
 ============================================================
 TOPIC: INTER-THREAD COMMUNICATION (wait() / notify())
 ============================================================

 WHAT IS INTER-THREAD COMMUNICATION?
 ----------------------------------
 Inter-thread communication allows threads to TALK to each other.
 One thread can PAUSE its execution and another thread can WAKE it UP.

 Java provides three methods for this:
 1) wait()
 2) notify()
 3) notifyAll()

 IMPORTANT RULES (EXAM GOLD):
 ----------------------------
 1) wait() and notify() belong to Object class, NOT Thread class
 2) They MUST be called inside synchronized context
 3) wait() releases the lock
 4) notify() does NOT release the lock immediately

 REAL-LIFE EXAMPLE:
 ------------------
 Person A (Thread-1) waits for food.
 Person B (Thread-2) prepares food and notifies.
*/

/*
 This class contains shared methods used by multiple threads.
*/
public class Class2_topic13_InterThread {

    // This method makes the thread WAIT
    synchronized void waitMethod() {

        try {
            // Step 1: Thread enters synchronized method
            System.out.println(Thread.currentThread().getName()
                    + " entered waitMethod()");

            // Step 2: Thread calls wait()
            // Thread releases the lock and goes to WAITING state
            System.out.println(Thread.currentThread().getName()
                    + " is waiting...");
            wait();

            // Step 5: Thread resumes after notify()
            System.out.println(Thread.currentThread().getName()
                    + " resumed after notify");

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    // This method NOTIFIES waiting thread
    synchronized void notifyMethod() {

        // Step 3: Notifier thread enters synchronized method
        System.out.println(Thread.currentThread().getName()
                + " entered notifyMethod()");

        // Step 4: notify() wakes ONE waiting thread
        notify();

        System.out.println(Thread.currentThread().getName()
                + " sent notification");
    }

    public static void main(String[] args) {

        // Creating ONE shared object
        Class2_topic13_InterThread obj =
                new Class2_topic13_InterThread();

        // Thread-1 will WAIT
        Thread t1 = new Thread(() -> {
            obj.waitMethod();
        }, "Thread-1");

        // Thread-2 will NOTIFY
        Thread t2 = new Thread(() -> {
            try {
                // Delay added to ensure Thread-1 waits first
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            obj.notifyMethod();
        }, "Thread-2");

        // Starting both threads
        t1.start();
        t2.start();

        /*
         EXPECTED OUTPUT (ORDER IS IMPORTANT):
         ------------------------------------
         Thread-1 entered waitMethod()
         Thread-1 is waiting...
         Thread-2 entered notifyMethod()
         Thread-2 sent notification
         Thread-1 resumed after notify

         STEP-BY-STEP OUTPUT EXPLANATION:
         --------------------------------
         1) Thread-1 enters waitMethod()
         2) Thread-1 calls wait() and goes to WAITING state
         3) Thread-2 enters notifyMethod()
         4) Thread-2 calls notify()
         5) Thread-1 wakes up and continues execution

         KEY LEARNING:
         -------------
         - wait() pauses execution AND releases lock
         - notify() wakes waiting thread
         - Thread resumes ONLY after notifier releases lock
        */
    }
}
