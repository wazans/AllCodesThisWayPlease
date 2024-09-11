package Java_set2;

class invalidphonenumberException extends Exception
{
    invalidphonenumberException(String message)
    {
        super(message);
    }


}

public class C_invalidphonenumberException {

    private String mobilenuumber;

    public String getMobilenuumber() {
        return mobilenuumber;
    }

    public void setMobilenuumber(String mobilenuumber) {
        if (mobilenuumber.length() != 10)
        try{
                throw new invalidphonenumberException("invalid mobile number");
        }
        catch (invalidphonenumberException e)
        {
            e.printStackTrace();
        }
        this.mobilenuumber = mobilenuumber;

    }

    public static void main(String[] args) {
        C_invalidphonenumberException obj=new C_invalidphonenumberException();
        obj.setMobilenuumber("98544676554332389");
    }

}
