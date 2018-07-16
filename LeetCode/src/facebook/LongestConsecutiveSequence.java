package facebook;

import java.util.Arrays;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		
		int[] arr = {100,4,200,2,3,1};
		
		System.out.println(findLongestSubSequenceLength(arr));
	}

	private static int findLongestSubSequenceLength(int[] arr) {

		if(arr == null || arr.length == 0) return 0;
		
		Arrays.sort(arr);
		
		int longestStreak = 1;
	    int currentStreak = 1;
	    
	    for(int i=1; i<arr.length;i++) {
	    	
	    	if(arr[i] != arr[i-1]) {
	    		if(arr[i] == arr[i-1] +1) {
	    			currentStreak += 1;
	    		}else {
	    			longestStreak = Math.max(longestStreak, currentStreak);
	    			currentStreak = 1;
	    		}
	    	}
	    }
	  
		return Math.max(longestStreak, currentStreak);
	}
}
