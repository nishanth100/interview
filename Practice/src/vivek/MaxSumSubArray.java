package vivek;

public class MaxSumSubArray {

	public static void main(String[] args) {
		
		int[] arr = {-1,2,4,0,-2,3,5,-4,6,8,9};
		findMaxSumSubArray(arr);
	}

	private static void findMaxSumSubArray(int[] arr) {

		int start = 0, end = 0, s = 0;
		int maxSoFar = arr[0];
		int maxEndHere = 0;
		
		for(int i=0; i<arr.length; i++) {
			maxEndHere = maxEndHere + arr[i];
			if(maxSoFar < maxEndHere) {
				maxSoFar = maxEndHere;
				start = s;
				end = i;
			}
			if(maxEndHere < 0) {
				maxEndHere = 0;
				s = i +1;
			}
		}
		
		System.out.println("Start Index of SubArray " + start + " And "+ " End index of Array " + end +  " SUM OF SUB ARRAY : " + maxSoFar);
	}
}
