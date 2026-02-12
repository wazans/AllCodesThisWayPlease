package Class12_Java_FileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class Class2_FileWriterExample {
    public static void main(String[] args) throws IOException  {
        FileWriter fw = new FileWriter("C:\\JavaFiles\\JavaNew1.txt");
        fw.write("welcome to hcl technologies\n");
        fw.close();
        System.out.println("File written successfully");
    }
}