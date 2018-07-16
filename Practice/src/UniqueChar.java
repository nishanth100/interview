
public class UniqueChar {

	public static void main(String[] args) {
		
		String str = "abcdea";
		
		System.out.println(uniqueString(str));
	}

	private static boolean uniqueString(String str) {

		if(str.length() > 128) return false;
		boolean[] letters = new boolean[128];
		
		for(int i=0; i < str.length(); i++) {
			int val = str.charAt(i);
			if(letters[val]) {
				return false;
			}else {
				letters[val] = true;
			}
		}
		
		return true;
	}
}
