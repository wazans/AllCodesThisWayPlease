package Class12_Java_FileHandling;

import java.io.*;

/*
 Serializable is a MARKER INTERFACE.
 - It has NO methods
 - It only tells JVM that objects of this class
   are allowed to be converted into byte stream
 - Without implementing Serializable, writeObject()
   will throw NotSerializableException
*/
public class Class2_SerializationExplained implements Serializable {

    /*
     Instance variables:
     - Belong to object
     - Will be serialized automatically
    */
    int id;
    String name;

    /*
     Constructor:
     - Used when object is created using new keyword
     - This constructor will NOT be called
       during deserialization
    */
    public Class2_SerializationExplained(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {

        /*
         Creating object normally in memory (RAM)
         At this moment, object exists only while
         program is running
        */
        Class2_SerializationExplained obj =
                new Class2_SerializationExplained(101, "Wasim");

        try {
            /*
             FileOutputStream:
             - Creates the file if it does not exist
             - Opens the file in write mode
             - Writes raw bytes into the file
            */
            FileOutputStream fos =
                    new FileOutputStream("C:\\JavaFiles\\student.ser");

            /*
             ObjectOutputStream:
             - Wraps FileOutputStream
             - Converts Java object into bytes
             - Enables serialization
            */
            ObjectOutputStream oos =
                    new ObjectOutputStream(fos);

            /*
             writeObject():
             - Actual SERIALIZATION happens here
             - JVM checks:
               1) Does the class implement Serializable?
               2) Are all instance variables serializable?
             - If yes → object is converted into byte stream
               and written to file
            */
            oos.writeObject(obj);

            /*
             Closing streams:
             - Always close streams to release system resources
            */
            oos.close();
            fos.close();

            /*
             Confirmation message
             File student.txt now contains serialized object data
            */
            System.out.println("Object serialized successfully");

        } catch (Exception e) {
            /*
             Handles:
             - IOException
             - NotSerializableException
             - Any unexpected runtime issue
            */
            e.printStackTrace();
        }
    }
}
