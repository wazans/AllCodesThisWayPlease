package Class1_OOPS;

class SuperParent {
    int x = 10;

    SuperParent() {
        System.out.println("Parent constructor");
    }

    void show() {
        System.out.println("Parent show method");
    }
}

class SuperChild extends SuperParent {
    int x = 20;

    SuperChild() {
        super(); // calls parent constructor
        System.out.println("Child constructor");
    }

    void display() {
        // accessing parent variable
        System.out.println(super.x);

        // calling parent method
        super.show();
    }
}

public class Class1_topic20_SuperKeyword {
    public static void main(String[] args) {
        SuperChild c = new SuperChild();
        c.display();
    }
}

/*
SUPER KEYWORD USES:
1. Access parent variable
2. Call parent method
3. Call parent constructor

OUTPUT:
Parent constructor
Child constructor
10
Parent show method

OUTPUT EXPLANATION:
super refers to immediate parent class object.
*/
