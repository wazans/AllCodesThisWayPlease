package Class12_Java_FileHandling;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class Class2_BufferedWriterLargeData {
    public static void main(String[] args) throws Exception {
    	FileWriter fw = new FileWriter("C:\\JavaFiles\\BiggggFile.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for(int i=1;i<=10000;i++){
            bw.write("This is line number : " + i);
            bw.newLine();
        }
        bw.close();
        System.out.println("Large data written successfully");
    }
}