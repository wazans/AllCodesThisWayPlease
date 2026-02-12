package Class3_Collections_Topic1_to_Last;


import java.util.Stack;

public class Class3_topic08_Stack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(15);
        stack.push(11);

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        stack.remove(0); // removes element at index 0
        System.out.println(stack);

        /*
         OUTPUT:
         20

         EXPLANATION:
         - Stack follows LIFO
         - pop() removes top element
        */
    }
}
