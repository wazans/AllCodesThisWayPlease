package Class3_Collections_Topic1_to_Last;


public class Class3_topic13_HashCode {

    public static void main(String[] args) {

        String a = "Java";
        String b = "Java";

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        /*
         OUTPUT:
         Same hash value

         EXPLANATION:
         - Equal objects must have same hashCode
        */
    }
}
