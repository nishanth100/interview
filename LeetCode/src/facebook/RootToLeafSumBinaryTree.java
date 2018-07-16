package facebook;

import java.util.ArrayList;
import java.util.List;

public class RootToLeafSumBinaryTree {

	public static void main(String[] args) {
		
		TreeNode node = new TreeNode(4);
    	node.left = new TreeNode(5);
    	node.right = new TreeNode(6);
    	node.right.right = new TreeNode(8);
    	node.left.left = new TreeNode(15);
    	node.right.right.left = new TreeNode(12);
    	node.left.right = new TreeNode(10);
    	
    	node.right.right.left = new TreeNode(17);
    	node.left.right.left = new TreeNode(11);
    	
    	boolean isSum = rootToLeafSummary(24,node);
    	System.out.println();
    	System.out.println(isSum);
		
	}
	
	private static boolean rootToLeafSummary(int sum, TreeNode root) {

		List<Integer> result = new ArrayList<>();
		if(root == null) {
			return false;
		}
		
		if(root.left == null && root.right == null) {
			if(root.val == sum) {
			result.add(root.val);
			System.out.println(result);
			return true; 
			}else {
				return false;
			}
		}
		
		if(rootToLeafSummary(sum -root.val, root.left)) {
			result.add(root.val);
			System.out.println(result);
			return true;
		}
		if(rootToLeafSummary(sum-root.val, root.right)) {
			result.add(root.val);
			System.out.println(result);
			return true;
		}
		System.out.println(result);
		return false;
	}

	static class TreeNode {
    	
    	int val;
    	TreeNode left;
    	TreeNode right;
    	
    	public TreeNode(int val) {
			this.val = val;
		}
    }
}
