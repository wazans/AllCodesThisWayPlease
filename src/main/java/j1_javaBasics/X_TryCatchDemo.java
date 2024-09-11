package j1_javaBasics;

public class X_TryCatchDemo {
    public static void main(String[] args) {
        try{
            int x=99;
            int y=99/0;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
