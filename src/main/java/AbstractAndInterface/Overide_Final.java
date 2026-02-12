package AbstractAndInterface;

public class Overide_Final {
	
	
	public void Method() {
		System.out.println("This is A METHOD BODY."); 
	}
	
	public static void main(String[] args) {
		Overide_Final obj = new sbs();
		obj.Method();
	}
	

}

class sbs extends Overide_Final{
	
	public void Method(int a) {
		System.out.println("This is A METHOD BODY.");
	}
	
}
