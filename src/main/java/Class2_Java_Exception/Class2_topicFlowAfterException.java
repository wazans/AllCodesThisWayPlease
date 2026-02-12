package Class2_Java_Exception;
class Class2_topicFlowAfterException {
    public static void main(String[] args) {
        try {
            System.out.println("Before exception");
            int x = 10 / 0;
            System.out.println("After exception");
        } catch (ArithmeticException e) {
            System.out.println("Exception handled");
        }
        System.out.println("Program continues");
    }
}
