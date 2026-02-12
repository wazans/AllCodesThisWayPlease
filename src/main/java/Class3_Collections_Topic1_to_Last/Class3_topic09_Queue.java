package Class3_Collections_Topic1_to_Last;


import java.util.Queue;
import java.util.LinkedList;

public class Class3_topic09_Queue {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<Integer>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(15);
        q.add(11);
        q.add(30);
        
        

        System.out.println(q.remove());
        System.out.println(q);

        /*
         OUTPUT:
         10

         EXPLANATION:
         - Queue follows FIFO
         - First inserted element removed first
        */
    }
}
