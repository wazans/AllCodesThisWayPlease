package ArrayProblems;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargestArrayNumber {
    public static void main(String[] args) {
        int a[] = {2, 6, 4, 7, 3, 12, 3, 4, 22, 34, 31, 8, 9, 23};

        Arrays.sort(a);

        int SecondLargest=a[a.length-2];
        System.out.println("The Second Largest Number is:");
        System.out.println(SecondLargest);

        }

    }

