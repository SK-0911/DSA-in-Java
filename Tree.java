
public class Tree {
	static class Node {
		int data;
		Node left, right;

		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	Node rootNode;

	public static void preorder(Node root) {
		if (root == null)
			return;
		System.out.println(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}

	public static void inorder(Node root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.println(root.data + " ");
		inorder(root.right);
	}

	public static void postorder(Node root) {
		if (root == null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data + " ");
	}
}
