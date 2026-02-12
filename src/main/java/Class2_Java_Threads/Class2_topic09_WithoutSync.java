package Class2_Java_Threads;

/*
 ============================================================
 TOPIC: WITHOUT SYNCHRONIZATION (RACE CONDITION DEMO)
 ============================================================

 WHY YOU ARE GETTING *NO OUTPUT*:
 -------------------------------


 This line:
     balance -= amt;
 only updates memory.
 It does NOT print balance.

 So the program runs correctly,
 but console looks blank.


*/

/* 
 Account class represents a shared resource.
 One Account object is used by multiple threads.
*/
class Account {

    // Shared variable (critical section)
    int balance = 1000;

    // Method is NOT synchronized
    // Multiple threads can enter at the same time
    void withdraw(int amt) {

        // Local copy read from shared memory
        int temp = balance;

        // Simulating delay to increase chance of race condition
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }

        // Updating balance using old value (problem happens here)
        balance = temp - amt;

        // Printing to show what actually happened
        System.out.println(
            Thread.currentThread().getName() +
            " withdrew " + amt +
            " | Balance now = " + balance
        );
    }
}

/*
 Main class
*/
public class Class2_topic09_WithoutSync {

    public static void main(String[] args) {

        // Creating ONE shared Account object
        Account a = new Account();

        // Thread A tries to withdraw 500
        Thread t1 = new Thread(() -> a.withdraw(500), "Thread-A");

        // Thread B tries to withdraw 750
        Thread t2 = new Thread(() -> a.withdraw(750), "Thread-B");

        // Starting both threads almost at the same time
        t1.start();
        t2.start();

        /*
         EXPECTED OUTPUT (order may vary):
         --------------------------------
         Thread-A withdrew 500 | Balance now = 500
         Thread-B withdrew 750 | Balance now = 250

         OR

         Thread-B withdrew 750 | Balance now = 250
         Thread-A withdrew 500 | Balance now = 500

         WHY THIS IS WRONG:
         ------------------
         Initial balance = 1000
         Total withdrawal requested = 500 + 750 = 1250

         Correct final balance SHOULD be:
         1000 - 1250 = -250

         But due to race condition:
         - Both threads read balance = 1000
         - Both calculate independently
         - One update overwrites the other

         RESULT:
         --------
         Final balance becomes 250 or 500
         This proves DATA INCONSISTENCY.
        */
    }
}
