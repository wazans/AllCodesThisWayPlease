package j1_javaBasics;

public class B_ArrayOddEvenCheck {

    public static void main(String[] args) {

        int[] a = {1, 2, 5, 3, 22, 55, 88, 2232, 125};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i] + " is even");
            } else {
                System.out.println(a[i] + " is odd");
            }
        }

    }
}
