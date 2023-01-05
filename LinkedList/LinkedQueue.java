package LinkedList;

public class LinkedQueue {
    Node front, rear;

    public LinkedQueue() {
        this.front = this.rear = null;
    }

    public void push(int val) {
        Node node = new Node(val);
        if (this.rear == null) {
            front = rear = node;
            return;
        }

        rear.next = node;
        rear = node;
    }

    public int dequeue() {
        if(front == null) return -9999;

        int val = front.val;
        front = front.next;

        return val;
    }

    public int peek() {
        if(front == null) return -9999;

        return front.val;
    }
}
