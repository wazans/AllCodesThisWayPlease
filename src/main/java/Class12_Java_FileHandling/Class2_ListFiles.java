package Class12_Java_FileHandling;
import java.io.File;
public class Class2_ListFiles {
    public static void main(String[] args) {
        File dir = new File("C:\\JavaFiles");
        File[] files = dir.listFiles();
        //int[] file=dir.listFiles();
        for(File f : files){
            if(f.isDirectory())
                System.out.println(f.getName()+" -> Directory");
            else
                System.out.println(f.getName()+" -> File");
        }
    }
}