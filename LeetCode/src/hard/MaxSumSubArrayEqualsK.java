package hard;

import java.util.HashMap;
import java.util.Map;

public class MaxSumSubArrayEqualsK {

	public static void main(String[] args) {
		
		int[] arr = {1,-1,2,5,3,-2};
		int target = 6;
		
		System.out.println(maxSumSubrrayLength(arr,target));
	}

	private static int maxSumSubrrayLength(int[] arr, int k) {
		
		if(arr == null || arr.length == 0) {
			return 0;
		}
		int n = arr.length;
		for(int i=1; i<n; i++) {
			arr[i] += arr[i-1];
		}
		
		Map<Integer,Integer> map = new HashMap<>();
		map.put(0, -1);
		int max = 0;
		for(int i=0; i<n; i++) {
			if(map.containsKey(arr[i] -k)) {
				max = Math.max(max, i - map.get(arr[i]-k));
			}
			if(!map.containsKey(arr[i])){
				map.put(arr[i], i);
			}
		}
		return max;
	}
}
