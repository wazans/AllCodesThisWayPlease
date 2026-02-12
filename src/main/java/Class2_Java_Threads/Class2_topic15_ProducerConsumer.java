package Class2_Java_Threads;

/*
 ============================================================
 TOPIC: PRODUCER – CONSUMER PROBLEM (INTER-THREAD COMMUNICATION)
 ============================================================

 WHAT IS PRODUCER–CONSUMER?
 -------------------------
 Producer–Consumer is a classic threading problem.
 One thread PRODUCES data.
 Another thread CONSUMES data.

 WHY THIS IS NEEDED:
 -------------------
 - To avoid busy waiting
 - To safely share resources
 - To coordinate thread execution

 JAVA METHODS USED:
 ------------------
 wait()   → Consumer waits when no item is available
 notify() → Producer wakes waiting consumer

 IMPORTANT RULES (EXAM GOLD):
 ----------------------------
 1) wait() and notify() must be inside synchronized methods
 2) wait() releases the lock
 3) notify() wakes ONE waiting thread
 4) Producer must notify AFTER producing data

 REAL-LIFE EXAMPLE:
 ------------------
 Factory produces items.
 Shop consumes items.
 Shop waits if factory has not produced yet.
*/

/*
 This class acts as a SHARED BUFFER between Producer and Consumer.
*/
public class Class2_topic15_ProducerConsumer {

    // Shared resource (buffer)
    int item = 0;

    // Flag to check whether item is produced or not
    boolean available = false;

    /*
     PRODUCER METHOD
     ----------------
     This method PRODUCES an item.
    */
    synchronized void produce() {

        // Step 1: Produce item
        item = 1;
        available = true;

        // Printing to show production
        System.out.println("Producer produced item: " + item);

        // Step 2: Notify waiting consumer
        notify();
    }

    /*
     CONSUMER METHOD
     ----------------
     This method CONSUMES the produced item.
    */
    synchronized void consume() {

        try {
            // Step 3: If item not available, consumer waits
            while (!available) {
                System.out.println("Consumer waiting for item...");
                wait();
            }

            // Step 5: Consume item after being notified
            System.out.println("Consumer consumed item: " + item);

            // Step 6: Reset availability
            available = false;

        } catch (InterruptedException e) {
            System.out.println("Consumer interrupted");
        }
    }

    public static void main(String[] args) {

        // Creating ONE shared object (buffer)
        Class2_topic15_ProducerConsumer pc =
                new Class2_topic15_ProducerConsumer();

        // Producer thread
        Thread producer = new Thread(() -> {
            pc.produce();
        }, "Producer-Thread");

        // Consumer thread
        Thread consumer = new Thread(() -> {
            pc.consume();
        }, "Consumer-Thread");

        /*
         STARTING ORDER:
         ---------------
         Consumer is started FIRST so it goes to WAITING state.
         Producer starts later and produces the item.
        */

        consumer.start();
        producer.start();

        /*
         EXPECTED OUTPUT (ORDERED):
         -------------------------
         Consumer waiting for item...
         Producer produced item: 1
         Consumer consumed item: 1

         STEP-BY-STEP OUTPUT EXPLANATION:
         --------------------------------
         1) Consumer thread starts
         2) No item available → consumer calls wait()
         3) Producer thread starts
         4) Producer produces item
         5) Producer calls notify()
         6) Consumer wakes up
         7) Consumer consumes item

         KEY LEARNING:
         -------------
         - Consumer waits safely without CPU wastage
         - Producer notifies after producing
         - Data is shared safely using synchronized + wait/notify
        */
    }
}
