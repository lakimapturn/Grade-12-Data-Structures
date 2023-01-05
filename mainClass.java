import LinkedList.LinkedList;
import LinkedList.LinkedQueue;
import Queue.DQueue;
import Stack.Stack;

public class mainClass {
    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.reverse();
//        list.print();

//        DQueue queue = new DQueue();
//
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.dequeue();
//        queue.enqueue(9);
//
//        queue.print();

        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.print();
    }
}
