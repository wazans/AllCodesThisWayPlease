package Java_set2;

public class StringManipulation {
    public static void main(String[] args) {
        String s="i am a                  strong string";
        System.out.println(s.substring(3,8));
        System.out.println(s.toUpperCase());
        System.out.println(s.replace('s','d'));
        System.out.println("Trimeed" +s.trim());
        System.out.println(s);

    }
}
