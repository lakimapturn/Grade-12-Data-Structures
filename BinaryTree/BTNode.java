package BinaryTree;

public class BTNode {
    private BTNode left;
    private BTNode right;
    private int data;

    public BTNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }

    public BTNode(BTNode left, BTNode right, int data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }

    public BTNode getLeft() {
        return left;
    }

    public void setLeft(BTNode left) {
        this.left = left;
    }

    public BTNode getRight() {
        return right;
    }

    public void setRight(BTNode right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
