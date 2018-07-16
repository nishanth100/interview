package hard;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubString {

	public static void main(String[] args) {

		String S = "ADOBECODEBANC";
		String T = "ABC";

		System.out.println(findMinWindowSub(S, T));
	}

	private static String findMinWindowSub(String s, String t) {
		char[] chsS = s.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char chT : t.toCharArray()) {
			if(map.containsKey(chT)) {
				map.put(chT, map.get(chT) +1);
			}else {
				map.put(chT, 1);
			}
		}
		
		// step 2. use two pointers
		int start = 0, end = 0, count = 0;
		String res = "";
		while (end < s.length()) {
			char ch_j = chsS[end];
			if (map.containsKey(ch_j)) {
				// j find a character, update the count and the map
				if (map.get(ch_j) > 0) {
					count++;
				}
				map.put(ch_j, map.get(ch_j) - 1);
				while (count == t.length()) {
					// count the length of current substring
					if (res.equals("") || end - start + 1 < res.length()) {
						res = s.substring(start, end + 1);
					}
					char ch_i = chsS[start];
					if (map.containsKey(ch_i)) {
						// i find a character, update the count
						if (map.get(ch_i) >= 0) {
							count--;
						}
						map.put(ch_i, map.get(ch_i) + 1);
					}
					start++;
				}
			}
			end++;
		}
		return res;
	}
}
