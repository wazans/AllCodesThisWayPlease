package j1_javaBasics;

public class S_LargestOfThree {
    public static void main(String[] args) {
        int x=2;
        int y=5;
        int z=3;
        int largest;
        if(x>=y && x>=z)
        {
            largest=x;
        }
        if(y>=x && y>=z)
        {
            largest=y;
        }
        else {
            largest=z;
        }
        System.out.println("The Largest is "   +largest);
    }
}
