package strings;

public class LPSub {
	
	public static void main(String[] args) {
		
		
String str = "aabaa";
		
		System.out.println(lps(str));
	}

	private static String lps(String str) {

		if(str == null || str.length() == 0) {
			return "";
		}
		if(str.length() <2) {
			return str;
		}
		int len = str.length();
		int left = 0;
		int right =0;
		boolean[][] isPal = new boolean[len][len];
		
		for(int i=0; i<len; i++) {
			isPal[i][i] = true;
		}
		for(int j=1; j<len; j++) {
			for(int i=0; i<j; i++) {
				
				if(str.charAt(i) == str.charAt(j) && (j-i <=2 || isPal[i+1][j-1])) {
					isPal[i][j] = true;
					
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
