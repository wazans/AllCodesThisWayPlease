package AbstractAndInterface;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueStringArray {

    public static void main(String[] args) {
        String s[]={"wasim","wasim","sudhakar","sudhakar"};
        HashSet<String> hs= new HashSet<>();
        for(int i=0;i< s.length;i++)
        {
            hs.add(s[i]);
        }
        System.out.print(hs +",");

    }
}
