package Class12_Java_FileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class Class2_FileWriterWrite {
    public static void main(String[] args)   {
        FileWriter fw;
		try {
			fw = new FileWriter("C:\\JavaFiles\\HCL.txt");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("Multiple lines written");
        
        
   
    }
}