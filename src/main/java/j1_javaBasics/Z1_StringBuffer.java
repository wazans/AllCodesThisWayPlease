package j1_javaBasics;

public class Z1_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Wasim");
        System.out.println(sb.capacity());
        sb.append(" Ansari");
        System.out.println(sb.capacity());
        System.out.println(sb);
        System.out.println(sb.capacity());

    }
}
