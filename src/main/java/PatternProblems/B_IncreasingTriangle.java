package PatternProblems;

public class B_IncreasingTriangle {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                //inner loop will run 1 time for the first row
                //inner loop will run 6 time for the sixth row
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
