package Class2_Java_Exception;
class Class2_topicParseInt {
    public static void main(String[] args) {
        String s = "wasim";
        try {
            int x = Integer.parseInt(s);
            System.out.println("String is numeric "  + x);
        } catch (NumberFormatException e) {
            System.out.println("String is not numeric");
        }
    }
}
