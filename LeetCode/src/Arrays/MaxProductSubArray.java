package Arrays;

public class MaxProductSubArray {

	public static void main(String[] args) {
		
		int[] arr  = {2,3,-2,4};
		
		System.out.println(maxProductSubArray(arr));
	}

	private static int maxProductSubArray(int[] arr) {

		if(arr == null  || arr.length == 0) {
			return 0;
		}
		
		int max = arr[0], min = arr[0], res = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			int temp = max;
			max = Math.max(Math.max(max*arr[i], min*arr[i]), arr[i]);
			min = Math.min(Math.min(temp*arr[i], min*arr[i]), arr[i]);
			if(max > res) {
				res = max;
			}
		}
		return res;
	}
}
