package Class12_Java_FileHandling;
import java.io.File;
public class Class2_FileOSLevel {
    public static void main(String[] args) {
        File f = new File("C:\\JavaFiles\\LargeData.txt");
        System.out.println(f.exists());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
    }
}