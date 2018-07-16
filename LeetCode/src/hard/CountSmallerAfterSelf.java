package hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountSmallerAfterSelf {

	public static void main(String[] args) {
		
		int[] arr = {4,2,6,1,3};
		
		List<Integer> res = countSmaller(arr);
		System.out.println(res);
	}

	private static List<Integer> countSmallerNumbers(int[] arr) {

		List<Integer> res = new ArrayList<>();
		
		if(arr == null || arr.length == 0) {
			return res;
		}
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j =i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					continue;
				}
				if(arr[i] > arr[j]) {
					count += 1;
				}
			}
			res.add(count);
			count = 0;
		}
		
		return res;
	}
	
	public static List<Integer> countSmaller(int[] nums) {
	    Integer[] ans = new Integer[nums.length];
	    List<Integer> sorted = new ArrayList<Integer>();
	    for (int i = nums.length - 1; i >= 0; i--) {
	        int index = findIndex(sorted, nums[i]);
	        ans[i] = index;
	        sorted.add(index, nums[i]);
	    }
	    return Arrays.asList(ans);
	}
	private static int findIndex(List<Integer> sorted, int target) {
	    if (sorted.size() == 0) return 0;
	    int start = 0;
	    int end = sorted.size() - 1;
	    if (sorted.get(end) < target) return end + 1;
	    if (sorted.get(start) >= target) return 0;
	    while (start + 1 < end) {
	        int mid = start + (end - start) / 2;
	        if (sorted.get(mid) < target) {
	            start = mid + 1;
	        } else {
	            end = mid;
	        }
	    }
	    if (sorted.get(start) >= target) return start;
	    return end;
	}
}
