package Queue;

public class DQueue {
    int front, rear;
    int queue[];

    public DQueue() {
        front = rear = 0;
        queue = new int[10];
    }

    public boolean add(int val) {
        if (!this.isFull()) {
            queue[rear++] = val;
            return true;
        }
        return false;
    }

    public int remove() {
        if (this.isEmpty()) {
            return -999999999;
        }
        int val = queue[front++];

        return val;
    }

    public boolean enqueue(int val) {
        if (!this.isFull() && front != 0) {
            queue[--front] = val;
            return true;
        }
        return false;
    }

    public int dequeue() {
        if (this.isEmpty() && rear > 0) {
            return -9999;
        }
        int val = queue[--rear];

        return val;
    }


    public boolean isFull() {
        if (rear == queue.length) return true;
        return false;
    }

    public boolean isEmpty() {
        if (rear == front) return true;
        return false;
    }

    public void print() {
        for (int i = front; i < rear; i++) {
            System.out.println(queue[i] + " ");
        }
    }
}
