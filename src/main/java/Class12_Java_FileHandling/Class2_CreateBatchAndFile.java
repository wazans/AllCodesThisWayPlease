package Class12_Java_FileHandling;
import java.io.File;
public class Class2_CreateBatchAndFile {
    public static void main(String[] args) throws Exception {
        File dir = new File("C:\\JavaFiles\\Wasim");
        dir.mkdir();
        File file = new File(dir,"BatchMates.txt");
        file.createNewFile();
        System.out.println("Folder and file created");
    }
}