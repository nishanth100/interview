package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraverse {

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
		List<Integer> list =preOrderTraverse(root);
		System.out.println(list);
	}

	private static List<Integer> preOrderTraverse(TreeNode root) {
		List<Integer> list =new ArrayList<>();
		helper(root,list);
		return list;
	}

	// V , L, R
	private static void helper(TreeNode root, List<Integer> list) {

		if(root != null) {
			list.add(root.val);
			if(root.left != null) {
				helper(root.left, list);
			}
			if(root.right != null) {
				helper(root.right, list);
			}
		}
	}
}
