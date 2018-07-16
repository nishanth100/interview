package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

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
		
		levelOrderTraversal(root);
		System.out.println();
		List<List<Integer>> res = levelbyLevelTraversal(root);
		System.out.println(res);
	}

	private static List<List<Integer>> levelbyLevelTraversal(TreeNode root) {
		
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> numList = new ArrayList<>();
		if(root == null) {
			return res;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		queue.offer(null);
		while(!queue.isEmpty()) {
			root = queue.poll();
			
			if(root != null) {
				System.out.print(root.val + ", ");
				numList.add(root.val);
				if(root.left != null) {
					queue.offer(root.left);
				}
				if(root.right != null) {
					queue.offer(root.right);
				}
			}else {
				res.add(numList);
				if(!queue.isEmpty()){
					numList = new ArrayList<>();
					queue.offer(null);
				}
			}
		}
		
		return res;
		
	}

	private static void levelOrderTraversal(TreeNode root) {

		if(root == null) {
			return;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			root = queue.poll();
			System.out.print(root.val + ", ");
			if(root.left != null) {
				queue.add(root.left);
			}
			if(root.right != null) {
				queue.add(root.right);
			}
		}
	}
}
