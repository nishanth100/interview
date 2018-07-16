package careercup_arrays;

public class ThreeLargestNumInArray {
	/*
	 * Initiate first, second and third element with MIN_Value. 
	 * Compare each element with the first ,second and third element as we move along the array.
	   Time Complexity : O(n) Space Complexity : O(1)
	 */

	public static void main(String[] args) {
		
		int[] arr = {-1,3,4,5,8,18,45,65,23,34};
		findThreeLargestNum(arr);
	}

	private static void findThreeLargestNum(int[] arr) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			}else if(arr[i] > second) {
				third = second;
				second = arr[i];
			}else if(arr[i] > third) {
				third = arr[i];
			}
		}
		System.out.println("FIRST " + first);
		System.out.println("SCOND " + second);
		System.out.println("THIRD " + third);
	}
}
