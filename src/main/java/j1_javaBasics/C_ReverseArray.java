package j1_javaBasics;

public class C_ReverseArray {
    public static void main(String[] args) {

        int[] numbers = {1, 5, 3, 4, 6};
        //System.out.println(numbers[0]);
        //System.out.println(numbers[4]);
        for (int i=numbers.length-1;i>=0;i--){
            System.out.print(numbers[i] + ",");
        }
    }
}
