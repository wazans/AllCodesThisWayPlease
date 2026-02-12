package Class1_OOPS;

class FinalDemo {
    final int x = 10;

    final void show() {
        System.out.println("Final method");
    }
}

public class Class1_topic07_FinalKeyword {
    public static void main(String[] args) {
        FinalDemo f = new FinalDemo();
        System.out.println(f.x);
        f.show();
    }
}

/*
OUTPUT:
10
Final method
*/
