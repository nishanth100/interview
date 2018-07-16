package careercup_arrays;

import java.util.HashMap;
import java.util.Map;

public class ArrayTwoSum {

	public static void main(String[] args) {
		
		int[] arr = {2,4,5,6,7,8};
		int target = 11;
		
		int[] res = finTwoSum(arr,target);
		for(int i: res) {
			System.out.println(i + ", ");
		}
	}

	private static int[] finTwoSum(int[] arr, int target) {
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		int[] res = new int[2];
		for(int i=0; i<arr.length; i++) {
			
			if(map.containsKey(target - arr[i])) {
				res[0] = i;
				res[1] = map.get(target - arr[i]);
				break;
			}
				map.put(arr[i], i);
		}
		return res;
	}
}
