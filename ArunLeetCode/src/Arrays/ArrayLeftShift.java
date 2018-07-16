package Arrays;

public class ArrayLeftShift {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		arrayLeftShift(arr,3);
	}

	private static void arrayLeftShift(int[] arr, int k) {
		int len = arr.length;
		int[] res= new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			int pos = i-k;
			if(pos >= 0) {
				res[pos] = arr[i];
			}else {
				res[pos+len] = arr[i];
			}
		}
		
		for(int i : res) {
			System.out.print(i + ", ");
		}
	}
}
