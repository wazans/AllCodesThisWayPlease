package Class12_Java_FileHandling;
import java.io.FileReader;
public class Class2_FileReaderExample {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("C:\\JavaFiles\\HCL.txt");
        int ch;
        while((ch = fr.read()) != -1){
            System.out.print((char)ch);
            
           
        }
        fr.close();
        
       
    }
}