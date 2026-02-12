package Class1_OOPS;

class Base {
    int x = 10;
}

class Derived extends Base {
    int x = 20;
}

public class Class1_topic06_VariableShadowing {
    public static void main(String[] args) {
        Derived d = new Derived();
        System.out.println(d.x);
    }
}

/*
OUTPUT:
20

EXPLANATION:
Child variable hides parent variable.
*/
