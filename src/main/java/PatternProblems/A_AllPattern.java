package PatternProblems;

public class A_AllPattern {
    public static void main(String[] args) {
        //Pattern4(5);
        DaimondPatter(5);
    }

    public static void Pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }

    public static void Pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }

    public static void Pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(row);
            }
            System.out.println(" ");
        }

    }

    public static void Pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row);
            }
            System.out.println("");
        }

    }

    public static void Pattern5(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totatColInRow = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totatColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
    public static void Pattern6(int n) {
        for(int row=1;row<=n;row++)
        {
            int count=1;
            for(int col=1;col<=row;col++)
            {
                System.out.print(count +" ");
                count++;
            }
            System.out.println(" ");
        }
    }

    public static void DaimondPatter(int n)
    {
        for(int row=1;row<=2 * n ; row ++)
        {
            int totalCloumnCount=row> n ? 2 * n - row : row;
            int total_Space=n-totalCloumnCount;
            for(int s=1;s<=total_Space;s++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=totalCloumnCount;col++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }


}
