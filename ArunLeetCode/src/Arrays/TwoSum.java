package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
	/*
	 * Time complexity : O(n)O(n). 
	 * We traverse the list containing nn elements only once. Each look up in the table costs only O(1)O(1) time.
       Space complexity : O(n)O(n). The extra space required depends on the number of items stored in the hash table,
       which stores at most nn elements.
	 */

	public static void main(String[] args) {
		
		int[] arr = {0,5,2,4,3,1};
		System.out.println(twoSum(arr, 5));
	}

	private static List<List<Integer>> twoSum(int[] arr, int target) {
 
		List<List<Integer>> res = new ArrayList<>();
		if(arr == null || arr.length == 0) {
			return res;
		}
		if(arr.length == 1 && arr[0] < target) {
			return res;
		}
		List<Integer> sol = null;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(target - arr[i])) {
				sol = new ArrayList<>();
				sol.add(map.get(target - arr[i]));
				sol.add(i);
				res.add(sol);
			}else {
				map.put(arr[i], i);
			}
		}
		
		return res;
	}
}
