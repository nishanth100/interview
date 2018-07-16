package strings;

public class KMPSubStringSearch {

	public static void main(String[] args) {
		/*
		 * In the given String find the pattern using KMP search
		 */
		
		 String str = "abcxabcdabcdabcy";
	     String subString = "abcdabcy";
	     
	     boolean result = KMP(str.toCharArray(),subString.toCharArray());
	     System.out.println(result);
	}

	private static boolean KMP(char[] text, char[] pattern) {

		int[] lps = computeTempArray(pattern);
		
		int i = 0;
		int j = 0;
		
		while(i <text.length && j<pattern.length) {
			if(text[i] == pattern[j]) {
				i++;
				j++;
			}else {
				if(j != 0) {
					j = lps[j-1];
				}else {
					i++;
				}
			}
		}
		if(j == pattern.length) {
			return true;
		}
		
		return false;
	}

	/**
     * Compute temporary array to maintain size of suffix which is same as prefix
     * Time/space complexity is O(size of pattern)
     */
	private static int[] computeTempArray(char[] pattern) {
		
		int[] lps = new int[pattern.length];
		
		int index = 0;
		for(int i=1; i<pattern.length;) {
			if(pattern[i] == pattern[index]) {
				lps[i] = index +1;
				index++;
				i++;
			}else {
				if(index != 0) {
					index = lps[index-1];
				}else {
					lps[i] = 0;
					i++;
				}
			}
		}
		return lps;
	}
}
