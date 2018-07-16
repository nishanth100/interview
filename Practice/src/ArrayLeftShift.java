import java.util.Arrays;

public class ArrayLeftShift {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int k = 4;
		int len = 5;
		int[] res = leftShiftArray(arr,len,k);
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i] + ", ");
		}
	}

	private static int[] leftShiftArray(int[] arr, int len, int k) {
		
		int length = arr.length;
		int[] newArr = new int[length];
		for(int i=0; i< length; i++) {
			int pos = i -k;
			
			if(pos >= 0) {
				newArr[pos] = arr[i];
			}else {
				newArr[pos + length] = arr[i];
			}
		}
		return newArr;
	}
}
