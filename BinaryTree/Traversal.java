package BinaryTree;

public class Traversal {
    public static void main(String args[]) {
        BinaryTree bt = new BinaryTree();
        bt.addNode(15);
        bt.addNode(7);
        bt.addNode(20);
        bt.addNode(6);
        bt.addNode(9);
        bt.preorder();
        bt.postorder();
        bt.inorder();
    }
}
