package j1_javaBasics;

public class K_AutoBoxingAndUnboxing {
    public static void main(String[] args) {
        int num=8; //primitive data type 'int' and primitive variable 'num'
        Integer num1=new Integer(num); // Boxing
        System.out.println("The primitive variable is converted into into object reference variable num1 and this is boxing "  +num1);

        Integer num2=num; //Auto-Boxing
        System.out.println("The primitive variable is converted into into object reference variable num1 and this is Auto-boxing "  +num2);

        int num3=num2;  //Auto-UnBoxing
        System.out.println("The object reference variable num2 is converted into into primitive variable num3 and this is Auto-unboxing "  +num2);

    }
}
