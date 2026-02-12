package AbstractAndInterface;

// Parent class
public class Class1_Parent {

    static void show() {
        System.out.println("Parent show()");
    }
}

// Child class
class Child extends Class1_Parent {

    // This does NOT override — it HIDES the parent method
    static void show() {
        System.out.println("Child show()");
    }

    public static void main(String[] args) {

        // Parent reference pointing to Child object
        Class1_Parent p = new Child();

        // Static method call depends on reference type
        p.show();           // Parent show()

        // Static method should be called using class name
        Child.show();       // Child show()
    }
}
