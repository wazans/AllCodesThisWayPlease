package Class12_Java_FileHandling;



import java.io.BufferedWriter;
import java.io.FileWriter;

/*
 This program demonstrates writing LARGE DATA using BufferedWriter.
 We will write 10,000 lines into a file.
*/

public class Class2_BufferWriter_largeFile {

    public static void main(String[] args) throws Exception {

        // FileWriter connects Java program to file
        FileWriter fw =
                new FileWriter("C:\\JavaFiles\\LargeData1.txt");

        // BufferedWriter improves performance for large data
        BufferedWriter bw = new BufferedWriter(fw);

        /*
         Loop runs 10,000 times
         Each iteration writes one line into the file
        */
        for (int i = 1; i <= 10000; i++) {

            bw.write("This is line number : " + i);
            bw.newLine(); // moves cursor to next line
        }

        // Closing BufferedWriter automatically closes FileWriter
        bw.close();

        System.out.println("Large data written successfully using BufferedWriter");
    }
}

