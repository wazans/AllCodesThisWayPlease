package j1_javaBasics;

public class wordInsideString {
    public static void main(String[] args) {
        String s="i am wasim ansari";
        String[] words=s.split(" ");
        for (String word : words) {
            int wordlength=word.length();
            System.out.println(word +" has "+ wordlength);
        }

    }
}
