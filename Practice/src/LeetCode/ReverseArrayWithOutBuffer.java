package LeetCode;

public class ReverseArrayWithOutBuffer {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		reverseArray(arr);
		for(int j : arr) {
			System.out.print(j + ", ");
		}
	}

	private static void reverseArray(int[] arr) {

		int s = 0;
		int e = arr.length-1;
		while(s <= e) {
			swap(arr,s,e);
			s++;
			e--;
		}
	}

	private static void swap(int[] arr,int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
        
	}
}
