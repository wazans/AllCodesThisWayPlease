package Java_set2;

public class G_SecondLargestArrayElement {
    public static void main(String[] args) {
        int a[]={400,6,96,77,82,93,0,2,3,4,5};
        int max=a[0];
        for (int i = 0; i < a.length; i++) {

            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println(max);
        int secondMax=Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<max && a[i]>secondMax)
            {
                secondMax=a[i];
            }
        }
        System.out.println(secondMax);

    }
}
