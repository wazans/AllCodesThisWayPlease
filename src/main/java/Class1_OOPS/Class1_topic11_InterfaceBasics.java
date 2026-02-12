package Class1_OOPS;

interface MyInterface {
    void show();

    default void msg() {
        System.out.println("Default method");
    }

    static void info() {
        System.out.println("Static method in interface");
    }
}

class Impl implements MyInterface {
    public void show() {
        System.out.println("Implemented show");
    }
}

public class Class1_topic11_InterfaceBasics {
    public static void main(String[] args) {
        Impl i = new Impl();
        i.show();
        i.msg();
        MyInterface.info();
    }
}

/*
OUTPUT:
Implemented show
Default method
Static method in interface
*/
