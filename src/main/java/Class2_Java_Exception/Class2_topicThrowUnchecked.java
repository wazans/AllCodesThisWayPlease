package Class2_Java_Exception;
class Class2_topicThrowUnchecked {
    public static void main(String[] args) {
        int age = 19;
        if (age < 18) {
            throw new RuntimeException("too yound to vote");
        }
        System.out.println("Eligible to vote");
    }
}
// Compare this snippet from Class2_topicTryMultipleCatch.java:
// package Class2_Java_Exception;			