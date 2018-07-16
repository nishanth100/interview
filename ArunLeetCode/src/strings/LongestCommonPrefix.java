package strings;

public class LongestCommonPrefix {
	
	public static void main(String[] args) {
		
		
		String[] strs = {"flower", "floral", "floor"};
		System.out.println(lcs(strs));
	}

	private static String lcs(String[] strs) {
		if(strs == null || strs.length == 0) {
			return "";
		}
		if(strs.length == 1) {
			return strs[0];
		}
		
		String lcs = strs[0];
		
		for(int i =1; i<strs.length; i++) {
				int j =0;
				String currStr = strs[i];
				while(j<lcs.length() && j< currStr.length() && lcs.charAt(j) == currStr.charAt(j)) {
					j++;
				}
				if(j==0) {
					return "";
				}
				lcs = lcs.substring(0, j);
		}
		
		return lcs;
	}

}
