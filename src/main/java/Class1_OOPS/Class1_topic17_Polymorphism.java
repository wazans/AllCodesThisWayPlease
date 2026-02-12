package Class1_OOPS;

class ParentPoly {
    void show() {
        System.out.println("Parent method");
    }
}

class ChildPoly extends ParentPoly {
    void show() {
        System.out.println("Child method");
    }
}

public class Class1_topic17_Polymorphism {
    public static void main(String[] args) {
        ParentPoly p = new ChildPoly();
        p.show();
    }
}

/*
OUTPUT:
Child method
*/
