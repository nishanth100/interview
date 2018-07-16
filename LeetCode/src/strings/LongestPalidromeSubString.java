package strings;

public class LongestPalidromeSubString {

	public static void main(String[] args) {
		
		String str = "bacab";
		
		System.out.println(lps(str));
	}

	private static String lps(String str) {
		
		if(str == null || str.length() < 2) {
			return str;
		}
		
		int length = str.length();
		int left = 0;
		int right = 0;
		
		boolean[][] isPalindrome = new boolean[length][length];
		
		for(int j = 1; j < length; j++) {
			for(int i = 0; i < j; i++) {
		
				boolean isInnerWordPali = isPalindrome[i+1][j-1] || j -i <= 2;
				
				if(str.charAt(i) == str.charAt(j) && isInnerWordPali) {
					isPalindrome[i][j] = true;
					if( j- i > right -left) {
						left = i;
						right = j;
					}
				}
			}
		}
		return str.substring(left, right+1);
	}
}
