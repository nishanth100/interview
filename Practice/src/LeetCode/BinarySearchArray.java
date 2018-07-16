package LeetCode;

public class BinarySearchArray {

	public static void main(String[] args) {
		
		int[] arr = {3,5,7,8,9,12,14,16,17,20,25,36};
		
		int target = 17;
		int res = findTargetIndex(arr,target);
		System.out.println(res);
	}

	private static int findTargetIndex(int[] arr, int target) {
		
		int low = 0;
		int high = arr.length;
		
		while(low <= high) {
			int mid = (low+high)/2;
			if(arr[mid] == target) {
				return mid;
			}
			if(arr[mid] > target) {
				high = mid -1;
			}else if(arr[mid] < target) {
				low = mid +1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}
