package AbstractAndInterface;
class Person1 {
    // implicitly extends Object
}

class Students1 extends Person {
}

public class Class1_OjectsExplained {
    public static void main(String[] args) {
        Students1 s = new Students1();

        // These methods come from Object class
        System.out.println(s.toString());
        System.out.println(s.hashCode());
    }
}
