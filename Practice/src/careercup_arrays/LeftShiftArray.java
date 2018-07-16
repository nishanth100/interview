package careercup_arrays;

public class LeftShiftArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int shift = 4;
		
		leftShiftArray(arr,shift);
	}

	private static void leftShiftArray(int[] arr, int k) {
		int len = arr.length;
		int[] res = new int[len];
		
		for(int i=0; i<arr.length; i++) {
			int pos = i - k;
			
			if(pos >=  0) {
				res[pos] = arr[i]; 
			}else {
				res[pos + len] = arr[i];
			}
		}
		for(int j : res) {
			System.out.print(j + ", ");
		}
	}
}
