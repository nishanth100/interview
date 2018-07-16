package LeetCode;

public class RotationOfArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		
		rotateArray(arr,2);
	}

	private static void rotateArray(int[] arr, int rotate) {
		int len = arr.length;
		int[] res = new int[arr.length];
		for(int i=0; i<len-rotate; i++) {
			res[i] = arr[len - rotate];
		}
		
	}
}
