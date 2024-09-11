package Java_set2;

import java.util.Arrays;
import java.util.Scanner;

public class U_Anagram {
    //LISTEN and SILENT are same characters only order of characters are different
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println("Enter String 1" +s1);
        System.out.println("Enter String 1" +s2);
        int n1=s1.length();
        int n2=s2.length();
        Arrays.sort(s1.toCharArray());
        Arrays.sort(s2.toCharArray());


    }
}
