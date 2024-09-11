package j1_javaBasics;

public class A1_Prime {

    public static void main(String[] args) {
        // Loop through numbers from 100 to 200
        for (int number = 100; number <= 200; number++) {
            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible by i, hence not prime
            }
        }
        return true; // Number is prime if no divisors are found
    }
}
