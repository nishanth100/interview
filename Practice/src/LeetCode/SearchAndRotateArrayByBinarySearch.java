package LeetCode;

public class SearchAndRotateArrayByBinarySearch {

	public static void main(String[] args) {
		int[] arr = {9,11,12,14,17,23,34,3,5,7,8};
		
 //		int[] arr = {1,2};
		int target = 14;
		int res = findTargetIndex(arr,target);
		System.out.println(res);
	}

	private static int findTargetIndex(int[] arr, int target) {
		int pivotIndex = findPivotIndex(arr,0,arr.length);
		System.out.println(pivotIndex);
		int low =0;
		int high =0;
		if(arr[pivotIndex] > target && target < arr[arr.length-1]) {
			low = pivotIndex;
			high = arr.length;
		}else {
			low = 0;
			high = pivotIndex -1;
		}
		
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

	private static int findPivotIndex(int[] arr, int start, int end) {
		if(arr == null || arr.length == 0) {
			return 0;
		}
		if(arr.length == 1) {
			return arr[0];
		}
		
		if(arr[start] < arr[end-1]) {
			return arr[0];
		}
		int mid = (start + end)/2;
		if(arr[mid] > mid +1) {
			return mid +1;
		}else if(arr[mid] > arr[start]) {
			 return findPivotIndex(arr, start, mid-1);
		}else {
			return findPivotIndex(arr, mid+1, end);
		}
	}
}
