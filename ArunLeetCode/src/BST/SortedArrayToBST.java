package BST;

import java.util.LinkedList;
import java.util.Queue;

public class SortedArrayToBST {

	public static void main(String[] args) {
		
		int[] arr = {-10,-3,0,5,9};
		TreeNode root = convertToBST(arr);
		printTree(root);
	}

	private static void printTree(TreeNode root) {

		if(root == null) {
			return;
		}
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			root = queue.poll();
			System.out.print(root.val + ", ");
			if(root.left != null) {
				queue.offer(root.left);
			}
			if(root.right != null) {
				queue.offer(root.right);
			}
		}
	}

	private static TreeNode convertToBST(int[] arr) {
		
		if(arr == null || arr.length == 0) {
			return null;
		}
		TreeNode root = helper(arr,0,arr.length-1);
		return root;
	}

	private static TreeNode helper(int[] arr, int low, int high) {
		if(low > high) {
			return null;
		}
		int mid = (low+high)/2;
		
		TreeNode node = new TreeNode(arr[mid]);
		node.left = helper(arr, low, mid-1);
		node.right = helper(arr, mid+1, high);
		return node;
	}
}
