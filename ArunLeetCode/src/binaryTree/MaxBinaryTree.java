package binaryTree;

import java.util.LinkedList;
import java.util.Queue;


public class MaxBinaryTree {

	public static void main(String[] args) {
		int[] nums = {3,2,1,6,0,5};
		TreeNode root = maxBinaryTree(nums);
		System.out.println(treeNodeToString(root));
	}

	  public static String treeNodeToString(TreeNode root) {
	        if (root == null) {
	            return "[]";
	        }
	    
	        String output = "";
	        Queue<TreeNode> nodeQueue = new LinkedList<>();
	        nodeQueue.add(root);
	        while(!nodeQueue.isEmpty()) {
	            TreeNode node = nodeQueue.remove();
	    
	            if (node == null) {
	              output += "null, ";
	              continue;
	            }
	    
	            output += String.valueOf(node.val) + ", ";
	            nodeQueue.add(node.left);
	            nodeQueue.add(node.right);
	        }
	        return "[" + output.substring(0, output.length() - 2) + "]";
	    }

	private static TreeNode maxBinaryTree(int[] nums) {
		return construct(nums, 0, nums.length);
	}

	private static TreeNode construct(int[] nums, int l, int r) {
		if(l == r) {
			return null;
		}
		int max = max(nums, l, r);
		TreeNode root = new TreeNode(nums[max]);
		root.left = construct(nums, l, max);
		root.right = construct(nums, max+1, r);
		return root;
	}

	private static int max(int[] nums, int l, int r) {
		int max = l; 
		for(int i=l; i<r; i++) {
			if(nums[max] < nums[i]) {
				max = i;
			}
		}
		return max;
	}
}
