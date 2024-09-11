package Java_set2;

import java.util.Arrays;

public class F_SortArray {
    public static void main(String[] args) {
        int arr[] = {0, 30, 5, 6, 0, 0, 9, 27};
        //expected out put [0, 0, 0, 30, 5, 6, 9, 27
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i +" ");
        }


    }
}
