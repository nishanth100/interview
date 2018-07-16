package LeetCode;

public class LeaderArray {

	public static void main(String[] args) {
		
		int[] arr = {23,12,5,8,9,1,21,16};
		
		maxFromRight(arr);
	}

	private static void maxFromRight(int[] arr) {
		
		int mfr = arr[arr.length -1];
		System.out.print(mfr +", ");
		for(int i=arr.length -2; i>=0; i--) {
			if(arr[i] > mfr) {
				System.out.print(arr[i] + ", ");
				mfr = arr[i];
			}
		}
	}
}
