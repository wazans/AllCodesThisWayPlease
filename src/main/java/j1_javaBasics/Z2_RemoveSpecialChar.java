package j1_javaBasics;

import java.util.Scanner;

public class Z2_RemoveSpecialChar {

    public static void i_remove_specials()
    {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter string with special character");
        String s1=sc1.next();



        String s2=s1.replaceAll("[^a-zA-Z\\s]","");
        System.out.println("Enter string with special character removed is     "+ s2);
        sc1.close();

    }

    public static void main(String[] args) {
        i_remove_specials();
    }
}
