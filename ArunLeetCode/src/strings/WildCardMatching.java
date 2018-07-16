package strings;

public class WildCardMatching {

	public static void main(String[] args) {
		
		/*
		 * '*' - represents 0 or more characters
		 * '?' - represents any one character
		 */
		String pattern = "x*y?z";
		String str = "xaay?z";
		System.out.println(wildCardMatching(str,pattern));
	}

	private static boolean wildCardMatching(String str, String pattern) {

		if(str.length() == 0 || pattern.length() == 0) {
			return false;
		}
		char[] chr = str.toCharArray();
		char[] pat = pattern.toCharArray();
		
		// if pattern has a***b***C - convert as a*b*c
		boolean isFirst = true;
		int index =0;
		for(int i=0; i<pat.length; i++) {
			if(pat[i] == '*') {
				if(isFirst) {
					pat[index++] = pat[i];
					isFirst = false;
				}
			}else {
				pat[index++] = pat[i];
				isFirst = true;
			}
		}
		
		boolean[][] T = new boolean[chr.length+1][index+1];
		if(index >0 && pat[0] == '*') {
			T[0][1] = true;
		}
		T[0][0] = true;
		
		for(int i=1; i<T.length; i++) {
			for(int j=1; j<T[0].length; j++) {
				if(pat[j-1] == '?' || chr[i-1] == pat[j-1]) {
				 T[i][j] = T[i-1][j-1];	
				}else if(pat[j-1] == '*') {
					T[i][j] = T[i-1][j] || T[i][j-1];
				}
			}
		}
		
		return T[chr.length][index];
	}
}
