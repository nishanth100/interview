package strings;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String[] strs = {"flower","flow","floor","flaw"};
		
		System.out.println(lcp(strs));
	}

	private static String lcp(String[] strs) {

		if(strs == null || strs.length == 0) {
			return "";
		}
		
		String lcp = strs[0];
		
		for(int i =1; i<strs.length; i++) {
			String curStr = strs[i];
			int j=0;
			while(j< lcp.length() && j< curStr.length() && lcp.charAt(j) == curStr.charAt(j)) {
				j++;
			}
			if(j== 0) {
				return "";
			}
			
			lcp = lcp.substring(0, j);
		}
		return lcp;
	}
}
