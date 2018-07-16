
public class PalindromeString {

	public static void main(String[] args) {
		
		String s1 = "amanaplanacanalpanama";

//		String s2 = polindromeString(s1);
		String s2 = polindromeStrFor(s1);
		
		if(s1.equals(s2)) {
		System.out.println("POLINDROME");
		}else {
			System.out.println("NOT");
		}
	}

	private static String polindromeStrFor(String s1) {
		System.out.println(s1.length());
		String newStr = "";
		for(int i = s1.length()-1; i >= 0; i-- ) {
			newStr = newStr + s1.charAt(i);
		}
		return newStr;
	}

	private static String polindromeString(String s1) {
		
		System.out.println(s1.length());
		if(s1.length() == 1) return s1;
		String newStr = "";
		
		newStr = newStr + s1.charAt(s1.length()-1) + polindromeString(s1.substring(0, s1.length()-1));
		return newStr;
	}
}
