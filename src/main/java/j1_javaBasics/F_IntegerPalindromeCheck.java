package j1_javaBasics;

public class F_IntegerPalindromeCheck {
    public static void main(String[] args) {
        int n = 121;
        String s=Integer.toString(n);
        String rev = "";

        // Reverse the string `s`
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i); // Constructing the reversed string
        }

        System.out.println(rev); // Print the reversed string

        // Check if the original string `s` is equal to its reversed version `rev`
        if (s.equals(rev)) {
            System.out.println("palindrome string");
        } else {
            System.out.println("not palindrome");
        }
    }
}
