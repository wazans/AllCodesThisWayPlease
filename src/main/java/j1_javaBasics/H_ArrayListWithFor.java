package j1_javaBasics;

import java.util.ArrayList;

public class H_ArrayListWithFor {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("wasim");
        al.add("Amna");
        al.add("Daniyal");
        al.add("Noida");
        al.add("Delhi");

        //type fori
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        //type iter
        for (String s : al) {
            System.out.println(s);

        }


        ArrayList<Integer> ai=new ArrayList<Integer>();
        ai.add(1);
        ai.add(99);
        int x=(ai.get(1));
        System.out.println(x);
    }
}
