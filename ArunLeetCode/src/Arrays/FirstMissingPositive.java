package Arrays;

public class FirstMissingPositive {

	public static void main(String[] args) {
		
		int[] arr = {4,5,2,1};
		System.out.println(firstMissingPositive(arr));
	}

	private static int firstMissingPositive(int[] arr) {

		int len = arr.length;
		
		for(int i=0; i<len; i++) {
			while(arr[i] > 0 && arr[i] <= arr.length && arr[arr[i] -1] != arr[i]) {
				swap(arr,i,arr[i]-1);
			}
		}
		
		for(int i=0; i<len; i++) {
			if(arr[i] != i+1) {
				return i+1;
			}
		}
		
		
		return -1;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
