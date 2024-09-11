package Java_set2;

class MyAllExceptionclass extends Exception
{

    MyAllExceptionclass(String message)
    {
        super(message);
    }

}
public class E_EndToEndExceptionDemo {
    private int num;
    public static void main(String[] args) {
        E_EndToEndExceptionDemo obj=new E_EndToEndExceptionDemo();
        obj.setNum(-1);
        obj.Division(3);

    }

    public void setNum(int num) {
        this.num = num;
        if(num<0)
        {
            try {
                throw new MyAllExceptionclass("a negative number");
            }
            catch (MyAllExceptionclass e)
            {
                e.printStackTrace();
            }
        }
    }
    public void Division(int num)
    {
        this.num = num;
        int y = 0;
        int z=num/y;
        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
    }

    public int getNum() {
        return num;
    }
}
