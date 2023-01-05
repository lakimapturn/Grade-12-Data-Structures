package BinaryTree;

public class BinaryTree {
    private BTNode head;

    public BinaryTree(BTNode head) {
        this.head = head;
    }

    public BinaryTree() {
        this.head = null;
    }

    public BTNode getHead() {
        return head;
    }

    public void setHead(BTNode head) {
        this.head = head;
    }

    private void addNode(BTNode node, int val) {
        if (head == null) {
            head = new BTNode(val);
        } else if (val < node.getData()) {
            if (node.getLeft() == null)
                node.setLeft(new BTNode(val));
            else
                addNode(node.getLeft(), val);
        } else {
            if (node.getRight() == null)
                node.setRight(new BTNode(val));
            else
                addNode(node.getRight(), val);
        }
    }

    public void addNode(int val) {
        addNode(head, val);
    }

    private void preorder(BTNode root) {
        if (root == null) {
            return;
        } else {
            System.out.println(root.getData());
            preorder(root.getLeft());
            preorder(root.getRight());
        }
    }

    private void postorder(BTNode root) {
        if (root == null) {
            return;
        } else {
            postorder(root.getLeft());
            postorder(root.getRight());
            System.out.println(root.getData());
        }
    }

    private void inorder(BTNode root) {
        if (root == null) {
            return;
        } else {
            inorder(root.getLeft());
            System.out.println(root.getData());
            inorder(root.getRight());
        }
    }

    public void preorder() {
        preorder(head);
    }

    public void postorder() {
        postorder(head);
    }

    public void inorder() {
        inorder(head);
    }
}
