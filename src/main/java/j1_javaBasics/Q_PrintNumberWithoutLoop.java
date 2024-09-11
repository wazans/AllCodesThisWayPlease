package j1_javaBasics;

public class Q_PrintNumberWithoutLoop {
    public static void main(String[] args) {
        DisplayNum(1);
    }

    public static void DisplayNum(int n)
    {
        if(n<=100){

            System.out.println(n);
            DisplayNum(n+1);
        }

    }
}
