package Class2_Java_Threads;
class SafeAccount {
    int balance = 1000;
    synchronized void withdraw(int amt) {
        balance -= amt;
        System.out.println("Balance: " + balance);
    }
}

public class Class2_topic10_Synchronized {
    public static void main(String[] args) {
        SafeAccount a = new SafeAccount();
        new Thread(() -> a.withdraw(500)).start();
        new Thread(() -> a.withdraw(500)).start();
    }
}
