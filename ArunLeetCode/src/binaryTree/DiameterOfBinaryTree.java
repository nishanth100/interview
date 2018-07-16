package binaryTree;


public class DiameterOfBinaryTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		System.out.println(diameterOfBinaryTree(root));
	}

	private static int diameterOfBinaryTree(TreeNode root) {
		int max = 0;
		if(root == null) {
			return 0;
		}
		int left = diameterOfBinaryTree(root.left);
		int right = diameterOfBinaryTree(root.right);
		max = Math.max(max, left+right);
		return Math.max(left, right) +1;
	}
}
