package AbstractAndInterface;

//Abstract class
abstract class Person {

 // concrete method
 void getName() {
     System.out.println("Name: John Doe");
 }

 // concrete method
 void getAddress() {
     System.out.println("Address: xyz street");
 }

 // abstract method (implementation depends on child)
 abstract void getUID();
}

//Child class
class Student extends Person {

 // compulsory implementation
 void getUID() {
     System.out.println("Student ID: STU101");
 }
}

//Child class
class Teacher extends Person {

 // compulsory implementation
 void getUID() {
     System.out.println("Teacher ID: TEA501");
 }
}

//Main class
public class Class1_Abstract {
 public static void main(String[] args) {

     Person p1 = new Student();   // parent reference, child object
     p1.getName();
     p1.getAddress();
     p1.getUID();

     System.out.println("------");

     Person p2 = new Teacher();
     p2.getName();
     p2.getAddress();
     p2.getUID();
 }
}
