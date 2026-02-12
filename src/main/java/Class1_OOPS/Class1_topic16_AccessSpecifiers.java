package Class1_OOPS;

class AccessDemo {
    private int a = 10;
    int b = 20;
    protected int c = 30;
    public int d = 40;
}

public class Class1_topic16_AccessSpecifiers {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}

/*
OUTPUT:
20
30
40
*/
