package j1_javaBasics;

public class P_StaticVar {
    int age;
    String name;
    static  String company="HP";
    String Sal;

    public static void main(String[] args) {
        P_StaticVar obj=new P_StaticVar();
        P_StaticVar obj1=new P_StaticVar();
        P_StaticVar obj2=new P_StaticVar();
        P_StaticVar obj3=new P_StaticVar();

        obj.name="Satish";
        System.out.println(company);
        obj.Sal="3344545";

        obj1.name="Ramesh";
        company="HP";
        obj1.Sal="33445dd5";

        obj2.name="Suresh";
        company="HP";
        obj2.Sal="243434";


        obj3.name="Yogesh";
        company="HP";
        obj3.Sal="243434";
    }
}
