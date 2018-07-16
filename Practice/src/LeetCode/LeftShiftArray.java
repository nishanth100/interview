package LeetCode;

public class LeftShiftArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		int shifts = 4;
		int len = arr.length;
		leftShiftArray(arr,shifts,len);
	}

	private static void leftShiftArray(int[] arr, int shifts, int len) {
		
		int[] res = new int[len];
		
		for(int i=0; i<len; i++) {
			
			int pos = i -shifts;
			
			if( pos >= 0) {
				res[pos] = arr[i];
			}else {
				res[pos + len] = arr[i];
			}
		}
		
		for(int i : res) {
			System.out.print(i + ", ");
		}
	}
}
