package Class1_OOPS;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}

public class Class1_topic09_AbstractClass {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}

/*
OUTPUT:
Drawing circle
*/
