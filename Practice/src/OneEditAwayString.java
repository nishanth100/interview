
public class OneEditAwayString {

	public static void main(String[] args) {
		
		String[][] str = {{"appzzle","aple"}};
		for(String[] arr : str) {
			String s1 = arr[0];
			String s2 = arr[1];
			System.out.println("ONE EDIT AWAY " + isOneEditAway(s1,s2));
		}
	}
	private static boolean isOneEditAway(String s1, String s2) {
		if(s1.length() == s2.length()) {
		 return oneEditReplace(s1,s2);
		}else if(s1.length() <= s2.length()) {
			return oneEditInsert(s1,s2);
		}else if(s2.length() >= s1.length()) {
			return oneEditInsert(s1,s2);
		}
		return true;
	}
	private static boolean oneEditInsert(String s1, String s2) {
		int index1 = 0;
		int index2 = 0;
		while(index2 < s2.length() && index1 < s1.length()) {
			if(s1.charAt(index1) != s2.charAt(index2)) {
				if(index1 != index2) {
					return false;
				}
				index2++;
			}else {
				index1++;
				index2++;
			}
		}
		return true;
	}
	private static boolean oneEditReplace(String s1, String s2) {
		boolean foundDiff = false;
		System.out.println("FROM ONE EDIT REPLACE");
		
		for(int i=0; i< s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				if(foundDiff) {
					return false;
				}
			}else {
				foundDiff = true;
			}
		}
		return true;
	}
}
