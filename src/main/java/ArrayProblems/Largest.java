package ArrayProblems;

public class Largest {
    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 7, 3, 11, 4, 74, 5, 4, 2, 4};
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
            {
                max=arr[i];
            }

        }
        System.out.println(max);

    }
}
