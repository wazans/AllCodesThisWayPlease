package j1_javaBasics;

public class M_SwapNumbers_TwoDigits
{
    public static void main(String[] args) {
        int n=23;
        int x=n%10;//2
        int y=n/10;//3
        System.out.println(n%10);
        System.out.println(n/10);
        System.out.print("the swapped number is " + x%10+y  );

    }
}
