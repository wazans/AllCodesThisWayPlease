package selenium_basics.radiobutton;

public class DebugDemo {

    public static void main(String[] args) {
        int number = 5;

        int sum = calculateSum(number);

        System.out.println("Expected: 15");
        System.out.println("Actual: " + sum);
    }

    public static int calculateSum(int num) {
        int total = 0;

        // BUG: Wrong condition (< instead of <=)
        for (int i = 1; i <= num; i++) {
            total = total + i;
        }

        return total;
    }
}
