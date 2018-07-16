package Arrays;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		
		int[] arr = {-1,2,1,-4};
		int target = 1;
		System.out.println(threeSumClosest(arr,target));
	}

	private static int threeSumClosest(int[] arr, int target) {
		Arrays.sort(arr);
		int n = arr.length;
		int closest = arr[0] + arr[1] + arr[2];
		for(int i=0; i<n-2; i++) {
			int j = i+1, k = n-1;
			while(j<k) {
				int sum = arr[i] + arr[j] + arr[k];
				if(sum == target) {
					return sum;
				}else if(sum < 0) {
					j++;
				}else {
					k--;
				}
				if(Math.abs(target - sum) < Math.abs(target - closest)) {
					closest = sum;
				}
			}
		}
	
		return closest;
	}
}
