package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class BoundariesOfBT {

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
		List<Integer> list = boundariesOfBT(root);
		System.out.println(list);
	}

	private static List<Integer> boundariesOfBT(TreeNode root) {

		List<Integer> res = new ArrayList<>();
		if(root == null) {
			return res;
		}
		if(root.left != null || root.right != null) {
			res.add(root.val);
		}
		leftBoundaries(root.left,res);
		leaves(root,res);
		rightBoundaries(root.right,res);
		
		return res;
	}

	private static void leaves(TreeNode root, List<Integer> res) {

		if(root == null) {
			return;
		}
		if(root.left == null && root.right == null) {
			res.add(root.val);
		}
		leaves(root.left,res);
		leaves(root.right, res);
	}

	private static void rightBoundaries(TreeNode root, List<Integer> res) {
		if(root == null || (root.left == null && root.right == null)) {
			return;
		}
		if(root.right != null) {
			rightBoundaries(root.right, res);
		}else {
			rightBoundaries(root.left, res);
		}
		res.add(root.val);
	}

	private static void leftBoundaries(TreeNode root, List<Integer> res) {
		if(root == null || (root.left == null && root.right == null)) {
			return;
		}
		res.add(root.val);
		if(root.left != null) {
			leftBoundaries(root.left, res);
		}else {
			leftBoundaries(root.right, res);
		}
	}
}
