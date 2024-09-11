package PatternProblems;

public class C_DecreasingTriangle {
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                //inner loop will run n=6 time for the first row untill the value of j=7
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
}
