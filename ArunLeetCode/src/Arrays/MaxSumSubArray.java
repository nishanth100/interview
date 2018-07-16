package Arrays;

public class MaxSumSubArray {

	public static void main(String[] args) {
		
		int[] arr = {-1,2,4,0,-2,3,5,-4,6,8,9};
		System.out.println(maxSumSubArray(arr));
	}

	private static int maxSumSubArray(int[] arr) {
		if(arr.length == 0) {
			return 0;
		}
		int maxSofar = arr[0];
		int maxEndHere = 0;
		int start =0, s = 0, end = 0;
		
		for(int i=0; i<arr.length; i++) {
			maxEndHere = maxEndHere + arr[i];
			if(maxSofar < maxEndHere) {
				maxSofar = maxEndHere;
				start = s;
				end = i;
			}
			if(maxEndHere < 0) {
				maxEndHere = 0;
				s = s+1;
			}
			
		}
		System.out.println("SUB ARRAY START is " + start + " END IS " + end + " SUM = " + maxSofar);
		return maxSofar;
	}
}
