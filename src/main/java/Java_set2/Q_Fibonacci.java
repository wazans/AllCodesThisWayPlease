package Java_set2;

public class Q_Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of terms
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: " + a + " " + b);

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }
}