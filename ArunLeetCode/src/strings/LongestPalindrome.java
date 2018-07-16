package strings;

public class LongestPalindrome {

	public static void main(String[] args) {
		
		String str = "caba";
		
		System.out.println(findLongestPal(str));
	}

	private static String findLongestPal(String str) {
		if(str == null || str.length() == 0) {
			return "";
		}
		if(str.length() == 1) return str;
		int len = str.length();
		int left = 0;
		int right = 0;
		
		boolean[][] isPalindrome = new boolean[len][len];
		for(int j =1; j<len; j++) {
			for(int i=0; i<j; i++) {
				if(str.charAt(i) == str.charAt(j) && (j-i <= 2 || isPalindrome[i+1][j-1])) {
					isPalindrome[i][j] = true;
					if(j-i > right -left) {
						left = i;
						right = j;
					}
					
				}
			}
		}

		return str.substring(left, right+1);
	}
}
