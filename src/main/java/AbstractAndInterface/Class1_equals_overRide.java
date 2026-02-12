package AbstractAndInterface;

public class Class1_equals_overRide {

    String grade;   // variable to store grade

    // constructor to set grade value
    Class1_equals_overRide(String grade) {
        this.grade = grade;
    }

    // simple equals method to compare grades
    public boolean equals(Object o) {

        // convert Object to Grade, Object  →  Class1_equals_overRide
    	//Why is casting needed here?
    	//Because the equals() method receives Object type:
    	//Java only knows o is an Object, not specifically a Grade.	
    	//Java does NOT know it is a Grade / Class1_equals_overRide
        Class1_equals_overRide g = (Class1_equals_overRide) o;

        // compare grade values
        return grade.equals(g.grade);
    }

    public static void main(String[] args) {

        // create two Grade objects with same value
        Class1_equals_overRide g1 = new Class1_equals_overRide("A");
        Class1_equals_overRide g2 = new Class1_equals_overRide("A");

        // create one Grade object with different value
        Class1_equals_overRide g3 = new Class1_equals_overRide("B");

        // true because "A" equals "A"
        System.out.println(g1.equals(g2));

        // false because "A" does not equal "B"
        System.out.println(g1.equals(g3));

        // false because g1 and g2 are different objects in memory
        System.out.println(g1 == g2);
    }
}
