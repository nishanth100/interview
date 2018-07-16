package binaryTree;

import java.util.List;

public class MaxDepthOfBinaryTree {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(8);
		root.right.left = new TreeNode(6);
		root.right.left.left = new TreeNode(9);
		root.right.left.right = new TreeNode(10);
		System.out.println(maxDepth(root));
	}

	private static int maxDepth(TreeNode root) {
		
		if(root == null) {
			return 0;
		}
		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);
		int maxDepth = Math.max(leftDepth, rightDepth) +1;
		return maxDepth;
	}
}
