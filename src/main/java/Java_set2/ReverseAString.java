package Java_set2;

    public class ReverseAString {
        public static void main(String[] args) {
            String s="wasim";
            String rev="";
            for (int i = s.length()-1; i >=0 ; i--) {
               rev=rev+s.charAt(i);
            }
            System.out.println(rev);

        }
    }
