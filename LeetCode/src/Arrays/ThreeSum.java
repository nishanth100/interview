package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	
	/*
	 * Given arr of integers find the 3 elements list whose some equals to 0
	 */

	public static void main(String[] args) {
		int[] arr = {-4,-2,-1,-1,0,1,2};
		List<List<Integer>> res = threeSum(arr);
		System.out.println(res);
	}
	private static List<List<Integer>> threeSum(int[] arr) {
		List<List<Integer>> result = new ArrayList<>();
		Set<String> set = new HashSet<String>();
		Arrays.sort(arr);
		int n = arr.length;
		for(int i =0; i< n-2; i++) {
			int j = i+1, k = n-1;
			while(j<k) {
				int sum = arr[i] + arr[j] + arr[k];
				if(sum == 0) {
					String key = String.format("%d,%d,%d", arr[i],arr[j],arr[k]);
					if(!set.contains(key)) {
						set.add(key);
						List<Integer> sol = new ArrayList<>();
						sol.add(arr[i]);
						sol.add(arr[j]);
						sol.add(arr[k]);
						result.add(sol);
					}
					j++;
					k--;
				}else if(sum <0) {
					j++;
				}else {
					k--;
				}
			}
		}
		return result;
	}
}
