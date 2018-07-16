package facebook;

import java.util.Arrays;

public class KthLargestElementInArray {

	public static void main(String[] args) {
		
		int[] arr = {3,2,3,1,2,4,5,5,6};
		int target = 4;
		
		System.out.println(findKthElement(arr,target));
	}

	private static int findKthElement(int[] arr,int k) {
		if(arr == null || arr.length == 0) return  -1;
		
		Arrays.sort(arr);
		
		int n = arr.length;
		
		return arr[n-k];
	}
}
