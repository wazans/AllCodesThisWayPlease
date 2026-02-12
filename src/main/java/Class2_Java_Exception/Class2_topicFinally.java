package Class2_Java_Exception;
class Class2_topicFinally {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
            System.out.println("after an exception");
        } catch (ArithmeticException e) {
            System.out.println("Exception handled");
        } finally {
            System.out.println("Cleanup code runs");
        }
    }
}
