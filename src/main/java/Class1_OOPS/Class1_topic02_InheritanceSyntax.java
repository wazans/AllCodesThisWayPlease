package Class1_OOPS;

class A {
    int x = 10;
}

class B extends A {
    int y = 20;
}

public class Class1_topic02_InheritanceSyntax {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.x);
        System.out.println(obj.y);
    }
}

/*
SYNTAX:
class Child extends Parent

OUTPUT:
10
20
*/
