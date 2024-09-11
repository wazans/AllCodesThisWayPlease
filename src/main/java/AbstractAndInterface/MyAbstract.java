package AbstractAndInterface;

public class MyAbstract implements MyInterface{

    @Override
    public void mymsg() {
        System.out.println("A method declared in interface & defined in abstract");

    }

    public static void main(String[] args) {
        MyAbstract obj=new MyAbstract();
        obj.mymsg();
        System.out.println(obj.x);
    }
}
