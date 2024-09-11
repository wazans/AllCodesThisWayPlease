package j1_javaBasics;

public class Z23_Subtring_trim_index {

    public static void main(String[] args) {
        String s="wasim(guest)";
        int startIndex=s.indexOf('(');
        int endIndex=s.indexOf(')');
        String output=s.substring(startIndex+1,endIndex);
        System.out.println(output);
        String outs=s.trim().substring(0,startIndex);
        System.out.println(outs);


    }
}
