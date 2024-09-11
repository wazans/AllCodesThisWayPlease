package AbstractAndInterface;

public class ClassImplemntsMultipleInheritance implements  MultipleInheritance1, MultipleInheritance2{
    @Override
    public void speed() {
        System.out.println("ClassImplemntsMultipleInheritance1");
    }

    @Override
    public void distance() {
        System.out.println("ClassImplemntsMultipleInheritance2");
    }

    public static void main(String[] args) {
        ClassImplemntsMultipleInheritance obj=new ClassImplemntsMultipleInheritance();
        obj.distance();
        obj.speed();
    }
}
