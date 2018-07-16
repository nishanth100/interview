package hard;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxSlidingWindow {

	public static void main(String[] args) {

		int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		int[] res = maxSlidingWindow(arr, k);

		for (int i : res) {
			System.out.print(i + ", ");
		}
	}

	public static int[] maxSlidingWindow(int[] nums, int k) {
		/*
		 * int len = nums.length; int[] res = new int[len-k+1];
		 * 
		 * if(nums == null || nums.length == 0) { return res; }
		 * 
		 * Queue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
		 * 
		 * @Override public int compare(Integer o1, Integer o2) { return
		 * Integer.compare(o2, o1); } });
		 * 
		 * for(int i=0; i<k; i++) { queue.add(nums[i]); } res[0] = queue.peek();
		 * 
		 * for(int i=k; i<len; i++) { queue.remove(nums[i-k]); queue.add(nums[i]);
		 * res[i-k+1] = queue.peek(); } return res;
		 * 
		 * 
		 * final int[] max_left = new int[nums.length]; final int[] max_right = new
		 * int[nums.length];
		 * 
		 * max_left[0] = nums[0]; max_right[nums.length - 1] = nums[nums.length - 1];
		 * 
		 * for (int i = 1; i < nums.length; i++) { max_left[i] = (i % k == 0) ? nums[i]
		 * : Math.max(max_left[i - 1], nums[i]);
		 * 
		 * final int j = nums.length - i - 1; max_right[j] = (j % k == 0) ? nums[j] :
		 * Math.max(max_right[j + 1], nums[j]); }
		 * 
		 * final int[] sliding_max = new int[nums.length - k + 1]; for (int i = 0, j =
		 * 0; i + k <= nums.length; i++) { sliding_max[j++] = Math.max(max_right[i],
		 * max_left[i + k - 1]); }
		 * 
		 * return sliding_max;
		 */

		if (nums == null || nums.length < k || k <= 0) {
			return new int[0];
		}
		int[] rst = new int[nums.length - k + 1];
		Deque<Integer> deque = new ArrayDeque<Integer>();
		for (int i = 0; i < k - 1; i++) {
			inQueue(deque, nums[i]);
		}

		for (int i = k - 1; i < nums.length; i++) {
			inQueue(deque, nums[i]); // clean up and add new smallest maximum, if applicable
			rst[i - k + 1] = deque.peekFirst();
			outQueue(deque, nums[i - k + 1]); // remove top max if the num === max
		}
		return rst;
	}

	private static void inQueue(Deque<Integer> deque, int num) {
		while (!deque.isEmpty() && deque.peekLast() < num) { // top
			deque.pollLast();
		}
		deque.offerLast(num);
	}

	private static void outQueue(Deque<Integer> deque, int num) {
		if (deque.peekFirst() == num) {
			deque.pollFirst();
		}
	}

}
