package LinkedList;

import java.util.Stack;

public class LinkedList {
    Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public LinkedList() {
        this.head = null;
    }

    public void add(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            return;
        }

        Node n = head;
        for (; n.next != null; n = n.next) ;

        n.next = node;
    }

    public int remove(int pos) {
        if (head == null) return -999;

        return 9;
    }

    public void reverse() {
        LinkedStack stack = new LinkedStack();

        Node n = head;
        while (n != null) {
            stack.push(n.val);
            n = n.next;
        }

        head = new Node(stack.pop());
        n = head;
        while (stack.peek() != -9999) {
            n.next = new Node(stack.pop());
            n = n.next;
        }
        n.next = new Node(stack.pop());
    }

    public void print() {
        Node n = head;
        while (n.next != null) {
            System.out.println(n.val);
            n = n.next;
        }
    }
}
