package LeetCode;

public class FindMaxAverage {
	
	public static void main(String[] args) {
		
	int[] nums = {2,5,6,-11,13,14,22,34,38};
	int k = 5;
	System.out.println(findMaxAvg(nums,k));
	
	}


	/*
	 * this will take O(n) time and O(n) space
	 */
	private static double findMaxAvg(int[] nums, int k) {
		
		int[] sum = new int[nums.length];
		sum[0] = nums[0];
		for(int i=1; i<nums.length; i++) {
			sum[i] = sum[i-1] + nums[i];
		}
		double res = sum[k-1] * 1.0/k;
		
		for(int i=k; i<nums.length; i++) {
			res = Math.max(res, (sum[i] - sum[i-k]) * 1.0/k);
		}
		return res;
	}
}
