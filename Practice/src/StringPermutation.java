
public class StringPermutation {
	
	public static void main(String[] args) {
		
		String[][] str = {{"apple","pplea"},{"boys","ysoa"},{"nish","shin"}};
		for(String[] word : str) {
			String s1 = word[0];
			String s2 = word[1];
			System.out.println(s1 + " and " + s2 + " " + checkPermutation(s1,s2));
		}
	}

	private static boolean checkPermutation(String s1, String s2) {

		if(s1.length() != s2.length()) return false;
		int[] letters = new int[128];
		
		for(int i=0; i <s1.length(); i++) {
			letters[s1.charAt(i)]++;
		}
		for(int j=0; j<s2.length(); j++) {
			letters[s2.charAt(j)]--;
			if(letters[s2.charAt(j)] < 0) {
				return false;
			}
		}
		return true;
	}

}
