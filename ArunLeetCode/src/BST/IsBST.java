package BST;

public class IsBST {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(20);
		root.left = new TreeNode(18);
		root.right = new TreeNode(26);
		root.left.left = new TreeNode(12);
		root.left.right = new TreeNode(19);
		root.right.right = new TreeNode(30);
		root.right.right.right = new TreeNode(45);
		root.right.left = new TreeNode(24);
		System.out.println(isValidBST(root));
	}

	private static boolean isValidBST(TreeNode root) {

		long min = Integer.MIN_VALUE;
		long max = Integer.MAX_VALUE;
		return isBST(root,min,max);
	}

	private static boolean isBST(TreeNode root, long min, long max) {
		if(root == null) {
			return true;
		}
		if(root.val <= min || root.val >= max) {
			return false;
		}
		return isBST(root.left, min, root.val) && isBST(root.right, root.val, max);
	}
}
