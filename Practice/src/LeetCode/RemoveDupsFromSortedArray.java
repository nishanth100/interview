package LeetCode;

public class RemoveDupsFromSortedArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,2,3,3,4,4,4,5};
		removeDups(arr);
	}

	private static void removeDups(int[] arr) {

		int j=0;
		int[] res = new int[arr.length];
		for(int i =0; i< arr.length-1; i++) {
			if(arr[i] != arr[i+1]) {
				res[j] = arr[i];
				j++;
			}
		}
		res[j] = arr[arr.length -1];
		for(int k : res) {
			System.out.print(k + ", ");
		}
	}
}
