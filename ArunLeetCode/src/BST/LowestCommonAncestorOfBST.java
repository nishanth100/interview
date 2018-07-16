package BST;

public class LowestCommonAncestorOfBST {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(20);
		root.left = new TreeNode(18);
		root.right = new TreeNode(26);
		root.left.left = new TreeNode(12);
		root.left.right = new TreeNode(19);
		root.right.right = new TreeNode(30);
		root.right.right.right = new TreeNode(45);
		root.right.left = new TreeNode(24);
		
		TreeNode node = lca(root,root.right.right.right, root.left.left);
		System.out.println("ANCESTOR NODE " + node.val);
	}

	private static TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
		
		if(root == null) {
			return null;
		}
		if(root.val > Math.max(p.val, q.val)) {
			return lca(root.left,p,q);
		}
		if(root.val < Math.min(p.val, q.val)) {
			return lca(root.right,p,q);
		}
		return root;
	}
}
