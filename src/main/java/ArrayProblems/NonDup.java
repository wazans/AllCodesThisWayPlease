package ArrayProblems;

import java.util.HashSet;
import java.util.Set;

public class NonDup {
    public static void main(String[] args) {
        int a[]={1,1,2,3,4,4,5,6,6,6,7,7,7,8,8,9};
        Set<Integer> hs=new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {

            hs.add(a[i]);

        }
        System.out.println(hs);

    }
}
