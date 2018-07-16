package careercup_arrays;

public class ClosestNum {
	
	public static void main(String[] args) {
		
		int[] arr = {};
		int target = 4;
		System.out.println(findClosest(arr,target));
	}

	private static int findClosest(int[] arr, int target) {
		if(arr.length == 0) return -1;
		if (arr.length == 1) return arr[0];
		
		int closeseDiff = Integer.MAX_VALUE;
		int closestElement = 0;
		
		for(int i : arr) {
			if(Math.abs(target -i) < closeseDiff) {
				closeseDiff = Math.abs(target -i);
				closestElement = i;
			}
		}
		return closestElement;
	}

}

