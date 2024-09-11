package ArrayProblems;

public class DuplicateArray {
    public  static void iamduplicate()
    {
        int arr[]={1,2,4,5,2,3,5,7,1,2,3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                    if(arr[i]==arr[j]){
                System.out.print(arr[j] +" ,");}
            }
        }
    }

    public static void main(String[] args) {
        iamduplicate();
    }
}
