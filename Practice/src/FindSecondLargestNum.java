import java.util.Arrays;

public class FindSecondLargestNum {

	public static void main(String[] args) {
		
		int[] arr = {3,5,12,8,23,30};
		
		System.out.println("NUM " + findSecondLarge(arr));
		secondLargest(arr);
	}

	private static int findSecondLarge(int[] arr) {

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i] > first) {
				second = first;
				first = arr[i];
			}else if(arr[i] > second) {
				second = arr[i];
			}
		}
		return second;
	}
	
	private static void secondLargest(int[] arr) {
		
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-2]);
		
	}
}
