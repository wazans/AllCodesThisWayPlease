package AbstractAndInterface;

public class Class1_without_ToString {

    String name;     // teacher name
    int facultyId;   // teacher id

    // constructor to initialize values
    Class1_without_ToString(String name, int facultyId) {
        this.name = name;
        this.facultyId = facultyId;
    }

    public static void main(String[] args) {

        // create Teacher object
        Class1_without_ToString t = new Class1_without_ToString("Tom", 101);

        // printing object directly
        // Java calls default toString() from Object class
        System.out.println(t);
    }
}
