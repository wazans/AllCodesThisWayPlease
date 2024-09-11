package ArrayProblems;

public class Smallest {
    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 7, 3, 11, 4, 7, 5, 4, 2, 4};
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            // if arr[i] is smaller than the current minimum
            if (arr[i] < min) {
                // then arr[i] is the new smallest value
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}

