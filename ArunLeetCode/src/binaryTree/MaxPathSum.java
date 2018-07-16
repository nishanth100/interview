package binaryTree;

public class MaxPathSum {
	
	public int max = Integer.MIN_VALUE;

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
		MaxPathSum msp = new MaxPathSum();
		System.out.println(msp.maxPathSum(root));
	}

	public int maxPathSum(TreeNode root) {
		helper(root);
		return max;
	}
	
	public  int helper(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int left = Math.max(helper(root.left), 0);
		int right = Math.max(helper(root.right),0);
		max = Math.max(max, root.val+left+right);
		return root.val + Math.max(left, right);
	}
}
