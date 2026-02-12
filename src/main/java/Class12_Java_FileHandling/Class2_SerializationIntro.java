package Class12_Java_FileHandling;
import java.io.Serializable;
public class Class2_SerializationIntro implements Serializable {
    int id;
    String name;
    public Class2_SerializationIntro(int id,String name){
        this.id=id;
        this.name=name;
    }
    public static void main(String[] args){
        System.out.println("Serialization example");
    }
}