package Java_set2;


/*
 Demonstrates:
 - Command line arguments
 - Parsing String → int
 - throw keyword
 - Unchecked exception (RuntimeException)
*/
class Class2_topicThrowUnchecked_CommandLine {

    public static void main(String[] args) {

        /*
         args[] contains values passed from command line.
       `
        */

        // Check whether age argument is provided
        if (args.length == 0) {
            throw new RuntimeException("Age not provided. Please pass age as command line argument");
        }

        /*
         Command line arguments are ALWAYS String
         So we must convert String → int
        */
        int age = Integer.parseInt(args[0]);

        /*
         Business rule:
         Voting allowed only for age >= 18
        */
        if (age < 18) {

            /*
             throw keyword:
             - Manually creates and throws an exception
             - RuntimeException is UNCHECKED
             - JVM does not force try-catch
            */
            throw new RuntimeException("Not eligible to vote. Age: " + age);
        }

        // Executes only if exception is NOT thrown
        System.out.println("Eligible to vote. Age: " + age);
    }
}
