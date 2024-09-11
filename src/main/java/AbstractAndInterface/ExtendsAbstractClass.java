package AbstractAndInterface;

public class ExtendsAbstractClass extends AbstractClassDemo {
    @Override
    public void abstractMethod() {
        System.out.println("implemented the abstract method of abstract class");
    }

    public static void main(String[] args) {
        ExtendsAbstractClass obj=new ExtendsAbstractClass();
        obj.abstractMethod();
    }
}
