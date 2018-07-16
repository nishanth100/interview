package LeetCode;

import java.util.Hashtable;
import java.util.Set;

public class MajorityElement {

	public static void main(String[] args) {
		int[] arr = {1,2,4,2,2,3,4,3,2,2,4,3,2,2,2};
		findMajorityEle(arr);
	}

	private static void findMajorityEle(int[] arr) {
		int n = arr.length;
		Hashtable<Integer, Integer> table = new Hashtable<>();
		for(int i=0; i<n; i++) {
			if(table.containsKey(arr[i])) {
				table.put(arr[i], table.get(arr[i])+1);
			}else {
				table.put(arr[i], 1);
			}
		}
		Set<Integer> set = table.keySet();
		for(int k : set) {
			if(table.get(k) > n/2) {
				System.out.println("MAX NO OF OCCURENCES " + k);
				break;
			}
		}
	}
}
