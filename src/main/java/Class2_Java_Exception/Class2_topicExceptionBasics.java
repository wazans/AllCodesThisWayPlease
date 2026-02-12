package Class2_Java_Exception;
class Class2_topicExceptionBasics {
    public static void main(String[] args) {
        try{
        	int a = 10;
        	  int b = 0;
              System.out.println(a / b);
        }
        catch(ArithmeticException e){
			System.out.println("Arithmetic Exception occurred: Division by zero is not allowed.");
		}
      
        System.out.println("End of the program");
    }
}
