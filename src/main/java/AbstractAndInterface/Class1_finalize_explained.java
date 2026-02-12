package AbstractAndInterface;
//
public class Class1_finalize_explained {

	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize() method called");
	}

	public static void main(String[] args)  {
		Class1_finalize_explained obj = new Class1_finalize_explained();
		obj = null; // Make the object eligible for garbage collection

	

		// Adding a small delay to ensure finalize() gets called
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}