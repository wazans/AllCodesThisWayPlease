package Java_set2;

public class J_SwapStrings {

    public static void main(String[] args) {
        String a="Hello";
        String b="World";
        a= a + b;
        b=a.substring(0,a.length()-b.length());
        System.out.println("b is " +b);
        a=a.substring(b.length());
        System.out.println("a is " +a);

    }

}
