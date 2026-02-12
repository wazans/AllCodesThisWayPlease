package Class1_OOPS;

class StaticParent {
    static void show() {
        System.out.println("Parent static method");
    }
}

class StaticChild extends StaticParent {
    static void show() {
        System.out.println("Child static method");
    }
}

public class Class1_topic18_StaticOverloadingVsHiding {
    public static void main(String[] args) {
        StaticParent p = new StaticChild();
        p.show();
    }
}

/*
OUTPUT:
Parent static method
*/
