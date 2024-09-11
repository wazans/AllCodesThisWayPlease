package j1_javaBasics;

public class N_SwapNumbers_NDigits {
    public static void main(String[] args) {
        //Remember swap mean just place it from last to first and vice-versa
        int n = 4256; // Example number; can be any number of digits

        // Convert the number to a string to easily access digits
        String s = String.valueOf(n);

        // If the number is a single digit, no swap is needed
        if (s.length() < 2) {
            System.out.println("The swapped number is " + n);
            return;
        }

        // Get the first and last digits
        char firstDigit = s.charAt(0);
        char lastDigit = s.charAt(s.length() - 1);

        // Get the middle part of the number
        String middlePart = s.substring(1, s.length() - 1);

        // Build the new number as a string with swapped first and last digits
        String swappedStr = lastDigit + middlePart + firstDigit;

        // Convert the swapped string back to an integer
        int swappedNumber = Integer.parseInt(swappedStr);

        System.out.println("The swapped number is " + swappedNumber);
    }
}
