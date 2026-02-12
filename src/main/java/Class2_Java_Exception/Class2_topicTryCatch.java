package Class2_Java_Exception;
class Class2_topicTryCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        System.out.println("Program ends safely");
    }
}
