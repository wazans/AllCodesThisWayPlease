package PatternProblems;

public class D_HillPattern {
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=n;i++)
        {   //6 spaces and 1 * and so on
            for(int j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
