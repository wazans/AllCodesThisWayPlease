package AbstractAndInterface;

public class ClassImplemntsMultipleInheritance implements  MultipleInheritance1, MultipleInheritance2 {
    @Override
    public void speed() {
        System.out.println("ClassImplemntsMultipleInheritance1");
    }


    public static void main(String[] args) {
        ClassImplemntsMultipleInheritance obj=new ClassImplemntsMultipleInheritance();
        
        obj.speed();
        obj.distance();
        
    }


	@Override
	public void distance() {
		System.out.println("ClassImplemntsMultipleInheritance2");
		
	}
}
