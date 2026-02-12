package AbstractAndInterface;

public class ClassInmplemnetsInterface extends Person  implements Interface1, Interface2 {

	public static void main(String[] args) {
		
		Interface1 obj=new ClassInmplemnetsInterface();
		obj.implementME();

	}

	@Override
	public void implementME() {
		
		System.out.println("i am implementing the abstract method of Interface1");
		
	}

	@Override
	void getUID() {
		// TODO Auto-generated method stub
		
	}

}
