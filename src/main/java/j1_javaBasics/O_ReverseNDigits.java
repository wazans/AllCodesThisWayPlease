package j1_javaBasics;

public class O_ReverseNDigits {
    public static void main(String[] args) {
        int n=683647346;
        String s=String.valueOf(n);
        String rev="";
        for (int i = s.length()-1;i>=0;i--) {
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);

    }
}
