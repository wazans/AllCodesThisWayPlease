package Class12_Java_FileHandling;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class Class2_BufferedWriterExample {
    public static void main(String[] args) throws Exception {
    	FileWriter fw = new FileWriter("C:\\JavaFiles\\Buffered.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Buffered writing is fast");
        bw.newLine();
        bw.write("Used for large data");
        bw.close();
        System.out.println("Buffered write done");
    }
}