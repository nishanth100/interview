package binaryTree;


public class LowestCommonAncestorofBT {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(10);
		root.right.right = new TreeNode(5);
		root.right.right.right = new TreeNode(15);
		root.right.left = new TreeNode(9);
		
		TreeNode node = lca(root,root.right.right.right, root.left.left);
		System.out.println("ANCESTOR NODE " + node.val);
	}

	private static TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {

		if(root == null) {
			return null;
		}
		if(root == p || root == q) {
			return root;
		}
		
		TreeNode left = lca(root.left, p, q);
		TreeNode right = lca(root.right, p, q);
		
		if(left != null && right != null) {
			return root;
		}
		if(left == null && right == null) {
			return null;
		}
		return left != null ? left : right ;
	}
}
