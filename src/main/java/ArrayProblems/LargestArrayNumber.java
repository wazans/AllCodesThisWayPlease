package ArrayProblems;

import java.util.Collections;

public class LargestArrayNumber {
    public static void main(String[] args) {
        int arr[]={2,6,4,7,3,2,3,4,2,5,3,8,9,23};
        int max=arr[0];
        for (int i = 0; i < arr.length ; i++) {

            max=arr[i]>max?arr[i]:max;


        }
        System.out.println(max);
    }
}
