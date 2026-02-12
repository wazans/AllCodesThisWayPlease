package Class3_Collections_Topic1_to_Last;


import java.util.Properties;

public class Class3_topic19_Properties {

    public static void main(String[] args) {

        Properties p = new Properties();

        p.setProperty("user","admin");
        p.setProperty("password","1234");

        System.out.println(p.getProperty("user"));
        System.out.println(p.getProperty("password"));

        /*
         OUTPUT:
         admin

         EXPLANATION:
         - Used for configuration data
         - Both key and value are String
        */
    }
}
