package strings;

public class RepeatedSubStringPattern {

	public static void main(String[] args) {
		
		String str = "ababab";
		
		System.out.println(repeatedSubstringPattern(str));
	}

	private static boolean repeatedSubstringPattern(String str) {
		
		if(str == null || str.length() == 0) return false;
		int len = str.length();
		for(int i = len/2; i>=1; i--) {
			if(len%i == 0) {
			 int m = len /i;
			 String sub = str.substring(0, i);
			 StringBuilder sb = new StringBuilder();
			 for(int j=0; j<m; j++) {
				 sb.append(sub);
			 }
			 if(sb.toString().equals(str)) {
				 return true;
			 }
			}
		}
		
		return false;
	}
}
