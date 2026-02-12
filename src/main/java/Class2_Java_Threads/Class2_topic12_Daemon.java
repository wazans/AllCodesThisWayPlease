package Class2_Java_Threads;


public class Class2_topic12_Daemon extends Thread {
	/*
	 ============================================================
	 TOPIC: DAEMON THREAD
	 ============================================================

	 WHAT IS A DAEMON THREAD?
	 -----------------------
	 A daemon thread is a background service thread.
	 It runs in the background to support user threads.
	 Examples: Garbage Collector, background cleanup tasks.

	 IMPORTANT JVM RULE:
	 -------------------
	 JVM terminates when ALL USER THREADS finish execution.
	 JVM does NOT wait for daemon threads to complete.

	 KEY POINT:
	 ----------
	 Daemon threads may stop at ANY time when JVM exits.
	 Output from daemon thread is NOT guaranteed.
	*/

    // run() method contains the code executed by the daemon thread
    public void run() {

        // This line will execute ONLY if JVM gives CPU time
        System.out.println("Daemon running");
    }

    public static void main(String[] args) {

        // Creating thread object (still a USER thread at this point)
        Class2_topic12_Daemon t = new Class2_topic12_Daemon();
        // Converting this thread into DAEMON thread
        // IMPORTANT: setDaemon(true) must be called BEFORE start()
        t.setDaemon(true);


        // Starting the daemon thread
        // JVM may or may not execute run() before exiting
        t.start();

        /*
         PROGRAM FLOW:
         -------------
         1) main thread starts
         2) daemon thread is started
         3) main thread ends immediately (no more code)
         4) JVM checks running threads
         5) Only daemon thread is left
         6) JVM exits and daemon thread may be killed

         POSSIBLE OUTPUT:
         ----------------
         Case 1:
         Daemon running

         Case 2:
         (No output)

         WHY?
         ----
         Because JVM does not wait for daemon threads.
        */
    }
}

// Output may vary: sometimes "Daemon running" is printed, sometimes not.