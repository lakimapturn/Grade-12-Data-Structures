package LinkedList;

public class Node {
    public int val;
    public Node next;

    public Node() {
        this.val = 0;
        this.next = null;
    }

    public Node(int val) {
        this.val = val;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
