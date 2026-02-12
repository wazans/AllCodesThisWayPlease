package Class1_OOPS;

interface Calc {
    int add(int a, int b);
}

public class Class1_topic12_FunctionalInterface {
    public static void main(String[] args) {
        Calc c = (a, b) -> a + b;
        System.out.println(c.add(2, 3));
    }
}

/*
OUTPUT:
5
*/
