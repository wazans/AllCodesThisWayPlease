package Class1_OOPS;

class Student {
    int id;

    Student(int id) {
        this.id = id;
    }

    public String toString() {
        return "Student id: " + id;
    }

    public boolean equals(Object o) {
        Student s = (Student) o;
        return this.id == s.id;
    }

    public int hashCode() {
        return id;
    }
}

public class Class1_topic10_ObjectClassMethods {
    public static void main(String[] args) {
        Student s1 = new Student(1);
        Student s2 = new Student(1);

        System.out.println(s1);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
    }
}

/*
OUTPUT:
Student id: 1
true
1
*/
