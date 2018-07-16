package binaryTree;


public class InvertTree {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(4);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(2);
		root.right.left= new TreeNode(1);
		root.right.right = new TreeNode(5);
		System.out.println("BEFORE " + MaxBinaryTree.treeNodeToString(root));
		TreeNode node = invertTree(root);
		System.out.println("After " + MaxBinaryTree.treeNodeToString(node));
	}

	private static TreeNode invertTree(TreeNode root) {
		if(root == null) {
			return null;
		}
		TreeNode left = invertTree(root.left);
		TreeNode right = invertTree(root.right);
		root.left = right;
		root.right = left;
		return root;
	}
}
