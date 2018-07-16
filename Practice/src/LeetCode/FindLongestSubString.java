package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindLongestSubString {

	public static void main(String[] args) {
		
		String str = "abcabcbb";
		
		System.out.println(findLongSubStrWithHash(str));
		System.out.println(findLongSubStrWithAsCII(str));
		System.out.println(findLengthWithSet(str));
	}

	/*
	 * this will take O(n) time and O(1) space
	 */
	private static int findLongSubStrWithAsCII(String str) {
		int len = str.length();
		int res =0;
		
		int[] arr = new int[128];
		
		for( int j=0, i=0; j<len; j++) {
			i = Math.max(arr[str.charAt(j)], i);
			res = Math.max(res, j-i +1);
			arr[str.charAt(j)] = j +1;
		}
		return res;
	}


	/*
	 * this will take O(n) time and O(n) space
	 */
	private static int findLongSubStrWithHash(String str) {
		
		int len = str.length();
		int res = 0;
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int j=0, i=0; j<len; j++) {
			if(map.containsKey(str.charAt(j))) {
				i= Math.max(map.get(str.charAt(j)), i);
			}
			res = Math.max(res, j-i+1);
			map.put(str.charAt(j), j+1);
		}
		return res;
	}
	
	private static int findLengthWithSet(String str) {
		
		int maxLength = 0;
		int i=0, j=0;
		Set<Character> set = new HashSet<Character>();
		while(j < str.length()) {
			if(!set.contains(str.charAt(j))) {
				set.add(str.charAt(j));
				j++;
				maxLength = Math.max(maxLength, j-i);
			}else {
				set.remove(str.charAt(i));
				i++;
			}
		}
		return maxLength;
	}

	}

