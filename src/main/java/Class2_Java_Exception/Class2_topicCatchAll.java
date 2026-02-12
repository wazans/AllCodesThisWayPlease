package Class2_Java_Exception;


class Class2_topicCatchAll {
    public static void main(String[] args) {
        try {
            int arr[] = new int[2];
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println("Some exception occurred");
        }
    }
}
