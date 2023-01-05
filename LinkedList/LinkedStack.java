package LinkedList;

public class LinkedStack {
    Node top;

    public LinkedStack() {
        this.top = null;
    }

    public void push(int val) {
        Node node = new Node(val);
        if (this.top == null) {
            top = node;
            return;
        }

        node.next = top;
        top = node;
    }

    public int pop() {
        if(top == null) return -9999;

        int val = top.val;
        top = top.next;

        return val;
    }

    public int peek() {
        if(top == null) return -9999;

        return top.val;
    }
}
