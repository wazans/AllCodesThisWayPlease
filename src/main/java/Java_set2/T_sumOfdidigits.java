package Java_set2;

import java.util.Scanner;

public class T_sumOfdidigits {
    public static void main(String[] args) {
        int digit,sum=0;
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
                while(number>0)
                {
                   digit=number%10;
                   sum=sum+digit;
                   number=number/10;
                }
        System.out.println("the sum of digiti is "  +sum);
    }
}
