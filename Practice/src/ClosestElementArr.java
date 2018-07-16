
public class ClosestElementArr {

	public static void main(String[] args) {
		
		int[] arr = {2,5,6,8,9};
		int target = 4;
		
		System.out.println(findClosest(arr,target));
	}

	private static int findClosest(int[] arr, int target) {

		if(arr.length == 0) return 0;
		
		if(arr.length == 1) return arr[0];
		
		int closestDiff = Integer.MAX_VALUE;
		int closestElement = 0;
		
		for(int i : arr) {
			if(Math.abs(target -i) < closestDiff) {
			closestDiff = Math.abs(target -i);
			closestElement = i;
			}
		}
		return closestElement;
	}
}
