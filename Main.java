import java.util.*;

public class Main {
    public static void main(String[] args) {
        Tree.Node root = new Tree.Node(1, null, null);
        root.left = new Tree.Node(2, null, null);
        root.right = new Tree.Node(3, null, null);
        root.left.left = new Tree.Node(4, null, null);
        root.left.right = new Tree.Node(5, null, null);
        root.right.left = new Tree.Node(6, null, null);
        root.right.right = new Tree.Node(7, null, null);

        Tree.preorder(root);
        System.out.println("\n\n");
        Tree.inorder(root);
        System.out.println("\n\n");
        Tree.postorder(root);
    }
}
