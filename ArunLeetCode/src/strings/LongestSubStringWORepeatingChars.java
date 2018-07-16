package strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWORepeatingChars {

	public static void main(String[] args) {
		
		String str = "pwwkew";
		System.out.println(lSubStringWORepeatingChar(str));
	}

	private static int lSubStringWORepeatingChar(String str) {
		
		int maxLen =0;
		
		Set<Character> set = new HashSet<>();

		int i = 0;
		int j = 0;
		while(j < str.length()) {
			if(!set.contains(str.charAt(j))) {
				set.add(str.charAt(j));
				j++;
				maxLen = Math.max(maxLen, j-i);
			}else {
				set.remove(str.charAt(i));
				i++;
			}
		}
		return maxLen;
	}
}
