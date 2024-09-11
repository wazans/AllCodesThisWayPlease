package j1_javaBasics;

public class W_EncapsulationDemo {
    public static void main(String[] args) {
        W_EncapsulationDemo obj=new W_EncapsulationDemo();
        obj.setPAN("ABCD1234");
        obj.setSal(12309876);
        System.out.println(obj.getPAN());
        System.out.println(obj.getSal());
    }

    private String PAN;
    private int sal;

    //alt+"insert"
    public String getPAN() {
        return PAN;
    }

    public int getSal() {
        return sal;
    }

    public void setPAN(String PAN) {
        this.PAN = PAN;
    }

    public void setSal(int sal) {
        if (sal > 0) {
            this.sal = sal; //this.sal -> refers to instance variable     id refers to the local variable
        } else {
            System.out.println("sal must be positive.");
        }

    }
}
