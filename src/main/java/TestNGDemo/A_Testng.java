package TestNGDemo;


import org.testng.annotations.Test;

public class A_Testng {

    @Test
    public static void mymethodOne()
    {
        System.out.println("i am first");
    }
    @Test
    public static void mymethodTwo()
    {
        System.out.println("i am second");
    }
    @Test
    public static void mymethodThreeExclude()
    {
        System.out.println("i am second");
    }
}
