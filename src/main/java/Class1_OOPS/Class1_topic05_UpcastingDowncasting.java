package Class1_OOPS;

class ParentCast {
    void show() {
        System.out.println("Parent method");
    }
}

class ChildCast extends ParentCast {
    void childOnly() {
        System.out.println("Child method");
    }
}

public class Class1_topic05_UpcastingDowncasting {
    public static void main(String[] args) {
        ParentCast p = new ChildCast();
        p.show();

        ChildCast c = (ChildCast) p;
        c.childOnly();
    }
}

/*
OUTPUT:
Parent method
Child method
*/
