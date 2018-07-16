
public class NumberNeededAnagram {

	public static void main(String[] args) {
		
		String s1 = "cde";
		String s2 = "abc";
		int res = numberNeeded(s1,s2);
		System.out.println("RESLUT " + res);
	}

	private static int numberNeeded(String s1, String s2) {

		int[] letters = new int[26];
		for(char c : s1.toCharArray()) {
			letters[c-'a']++;
		}
		for(char c : s2.toCharArray()) {
			letters[c-'a']--;
		}
		int count = 0;
		for(int k : letters) {
			count += Math.abs(k);
		}
		return count;
	}
}
