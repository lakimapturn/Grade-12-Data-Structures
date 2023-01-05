package Queue;

public class Queue {
    int front, rear;
    int queue[];

    public Queue() {
        front = rear = 0;
        queue = new int[10];
    }

    public void add(int val) {
        if (!this.isFull())
            queue[rear++] = val;
    }

    public int remove() {
        if (this.isEmpty()) {
            return -9999;
        }
        int val = queue[front++];

        if (rear == front && rear != 0) front = rear = 0;

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
