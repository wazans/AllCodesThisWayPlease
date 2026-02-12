public class ReverseNumber {
    static int  number=1234567;
    static String mynum= String.valueOf(number);
    static String rev="";
    public static void main(String[] args) {
        for (int i=mynum.length()-1; i >= 0 ; i--) {
            rev=rev+mynum.charAt(i);
        }
        System.out.print(rev);
        //Change this to command line argument
       
    }


}
