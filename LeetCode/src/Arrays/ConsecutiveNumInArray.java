package Arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConsecutiveNumInArray {

	public static void main(String[] args) {
		
		int[] arr = {-2,4,2,1,-1,4,3,0,6,5};
		
			System.out.println(findConsecutiveNum(arr));
		}
	

	private static int findConsecutiveNum(int[] arr) {
		
		if(arr == null || arr.length == 0) {
			return -1;
		}
		
	//	Set<Integer> set = new HashSet<>();
		Set<Integer> set = new TreeSet<Integer>();
		for(int i : arr) {
			set.add(i);
		}
		int max = 0;
		
		for(int i : set) {
			if(set.contains(i-1)) {
				continue;
			}
			
			int len = 0;
			while(set.contains(i++)) {
				len++;
			}
			max = Math.max(max, len);
		}
		return max;
	}
}
