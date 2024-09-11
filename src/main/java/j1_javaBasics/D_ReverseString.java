package j1_javaBasics;


public class D_ReverseString {
    public static void main(String[] args) {

        String s="elephant";
        //last index is 4
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
    }
}
