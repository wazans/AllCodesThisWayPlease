package Java_set2;


import java.util.Scanner;

class MyException extends Exception
{
    MyException(String message)
    {
        super(message);
    }
}
public class D_TryCatchFinalyDemo {
    public static void main(String[] args) {
        D_TryCatchFinalyDemo obj=new D_TryCatchFinalyDemo();
        //Scanner scanner: This declares a variable named scanner of type Scanner.
        //new Scanner(System.in): This creates a new Scanner object that reads input from the standard input stream (System.in),
        // which typically corresponds to keyboard input.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter nationality
        System.out.print("Enter your nationality: ");
        //scanner.nextLine(): This method call waits for the user to input a line of text and press Enter.
        String nationality = scanner.nextLine();

        obj.setnationality(nationality);
        obj.getnationality();
    }
    private String nationality;

    public String getnationality() {
        return nationality;
    }

    public void setnationality(String nationality) {
        this.nationality = nationality;
        if (!nationality.equalsIgnoreCase("Indian")) {
            try {
                throw new MyException("You are not eligible to vote");

            } catch (MyException e) {
                e.printStackTrace();
            }
        }
    }



}
