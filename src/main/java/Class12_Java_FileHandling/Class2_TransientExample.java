package Class12_Java_FileHandling;
import java.io.Serializable;
public class Class2_TransientExample implements Serializable {
    int id;
    transient String password;
    public Class2_TransientExample(int id,String password){
        this.id=id;
        this.password=password;
    }
    public static void main(String[] args){
        System.out.println("Transient hides password");
    }
}