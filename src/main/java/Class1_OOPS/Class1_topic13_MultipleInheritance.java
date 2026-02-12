package Class1_OOPS;

interface A1 {
    void showA();
}

interface B1 {
    void showB();
}

class Multi implements A1, B1 {
    public void showA() {
        System.out.println("A method");
    }

    public void showB() {
        System.out.println("B method");
    }
}

public class Class1_topic13_MultipleInheritance {
    public static void main(String[] args) {
        Multi m = new Multi();
        m.showA();
        m.showB();
    }
}

/*
OUTPUT:
A method
B method
*/
