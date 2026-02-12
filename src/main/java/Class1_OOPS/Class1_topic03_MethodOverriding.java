package Class1_OOPS;

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Class1_topic03_MethodOverriding {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        
    }
}

/*
OUTPUT:
Dog barks

OUTPUT EXPLANATION:
Overridden method is called at runtime.
*/
