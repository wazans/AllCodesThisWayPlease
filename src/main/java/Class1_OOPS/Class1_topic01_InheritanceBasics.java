package Class1_OOPS;

class Parent {
    int money = 100;

    void showMoney() {
        System.out.println("Parent money: " + money);
    }
}

class Child extends Parent {
    void showChild() {
        System.out.println("Child accessing parent money: " + money);
    }
}

public class Class1_topic01_InheritanceBasics {
    public static void main(String[] args) {
        Child c = new Child();
        c.showMoney();
        c.showChild();
    }
}

/*
OUTPUT:
Parent money: 100
Child accessing parent money: 100

OUTPUT EXPLANATION:
Child class inherits Parent class.
So child object can access parent members.
*/
