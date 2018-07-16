package strings;

import java.util.Arrays;

public class StringPermutation {

	public static void main(String[] args) {
	
		String[][] strArr = {{"dog", "god"},{"hello","apple"}};
		for(String[] arr : strArr) {
			System.out.println(checkPermutation(arr[0],arr[1]));
			System.out.println(checkPermuationSort(arr[0],arr[1]));
		}
	}

	private static boolean checkPermuationSort(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		return sort(s1).equals(sort(s2));
	}
	
	public static String sort(String str) {
		char[] content = str.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

	private static boolean checkPermutation(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		int[] letters = new int[128];
		for(int i=0; i<s1.length(); i++) {
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
