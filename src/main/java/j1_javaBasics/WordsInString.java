package j1_javaBasics;


public class WordsInString {
    public static void main(String[] args) {
        String str = "I love programming in Java";
        String[] words = str.split(" ");
        int maxLength = 0;
        String maxWord = "";

        for (String word : words) {
            int length = word.length();
            if (length > maxLength) {
                maxLength = length;
                maxWord = word;
            }
        }

        System.out.println("The word with the maximum length is: " + maxWord);
        System.out.println("The length of the word is: " + maxLength);
    }
}
