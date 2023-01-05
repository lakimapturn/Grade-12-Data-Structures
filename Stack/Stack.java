package Stack;

public class Stack {
    int top;
    int stack[];

    public Stack() {
        top = 0;
        stack = new int[10];
    }

    public boolean isFull() {
        if (top == stack.length) return true;
        return false;
    }

    public boolean isEmpty() {
        if (top == 0) return true;
        return false;
    }

    public boolean push(int val) {
        if (!this.isFull()) {
            stack[top++] = val;
            return true;
        }
        return false;
    }

    public int pop() {
        if (!this.isEmpty()) {
            return stack[--top];
        }
        return -999999999;
    }

    public int peek() {
        if (!this.isEmpty()) {
            return stack[top-1];
        }
        return -999999999;
    }

    public void print() {
        for (int i = top-1; i >= 0; i--) {
            System.out.println(stack[i] + " ");
        }
    }
}
