package strings;

public class ImplementStrStr {

	public static void main(String[] args) {
		
		
		String s1 = "goodtecher";
		String s2 = "techer";
		
		System.out.println(findStrStr(s1,s2));
	}

	private static int findStrStr(String s1, String s2) {

		if(s1 == null || s2 == null) return -1;
		
		for(int i=0; i<s1.length()-s2.length()+1; i++) {
			int j;
			for(j=0; j<s2.length(); j++) {
				if(s1.charAt(i+j) != s2.charAt(j)) {
					break;
				}
			}
			if(j==s2.length()) {
				return i;
			}
		}
		
		return -1;
	}
}
