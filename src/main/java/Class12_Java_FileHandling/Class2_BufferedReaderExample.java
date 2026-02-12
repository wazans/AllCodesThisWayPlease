package Class12_Java_FileHandling;
import java.io.BufferedReader;
import java.io.FileReader;
public class Class2_BufferedReaderExample {
    public static void main(String[] args) throws Exception {
    	FileReader fr = new FileReader("C:\\JavaFiles\\Info.txt");
        BufferedReader br = new BufferedReader(fr);
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
		fr.close();
    }
}