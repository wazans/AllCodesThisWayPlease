import java.util.Scanner;

public class AIDemo {

	public static void main(String[] args) {
		// Accept input from command-line arguments if provided; otherwise read from stdin
		String input;
		if (args != null && args.length > 0) {
			input = String.join(" ", args);
		} else {
			System.out.print("Enter a string: ");
			Scanner sc = new Scanner(System.in);
			input = sc.nextLine();
			sc.close();
		}

		String reversedStr = reverseString(input);
		boolean palindrome = isPalindrome(input);
		System.out.println("Original String: " + input);
		System.out.println("Reversed String: " + reversedStr);
		System.out.println("Is palindrome (ignoring case and non-alphanumeric): " + palindrome);

	}

	// Reverses the given string. Returns empty string for null input.
	public static String reverseString(String s) {
		if (s == null) return "";
		return new StringBuilder(s).reverse().toString();
	}

	// Checks if the string is a palindrome.
	// Normalizes by removing non-alphanumeric characters and comparing case-insensitively.
	public static boolean isPalindrome(String s) {
		if (s == null) return false;
		String normalized = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		int i = 0, j = normalized.length() - 1;
		while (i < j) {
			if (normalized.charAt(i) != normalized.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}

}