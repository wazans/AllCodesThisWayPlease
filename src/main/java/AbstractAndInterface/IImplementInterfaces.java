package AbstractAndInterface;

public class IImplementInterfaces implements Interface1, Interface2 {
    @Override
    public void implementME() {
        System.out.println("i support multiple inheritance by implemting where these Interfaces have the same abstract method in it");
    }
}
