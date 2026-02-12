package AbstractAndInterface;

public class Class1_toString_overRide {

    private String name;
    private int facultyId;

    Class1_toString_overRide(String name, int facultyId) {
        this.name = name;
        this.facultyId = facultyId;
    }

    @Override
    public String toString() {
        // Human-readable object representation
        return name + " (" + facultyId + ")";
    }

    public static void main(String[] args) {
        Class1_toString_overRide t = new Class1_toString_overRide("Tom", 101);

        // println internally calls toString()
        System.out.println(t);
    }
}
