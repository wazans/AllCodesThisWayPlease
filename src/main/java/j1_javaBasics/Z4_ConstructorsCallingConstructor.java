package j1_javaBasics;

public class Z4_ConstructorsCallingConstructor {

    public Z4_ConstructorsCallingConstructor()
    {

        System.out.println("i am default");

    }
    public Z4_ConstructorsCallingConstructor(String s)
    {
        this();
        System.out.println("i am paramterized");
        new Z4_ConstructorsCallingConstructor();
    }

    public static void main(String[] args) {
        Z4_ConstructorsCallingConstructor obj=new Z4_ConstructorsCallingConstructor("wasim");
    }

}
