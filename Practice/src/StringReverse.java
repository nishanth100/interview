
public class StringReverse {

	public static void main(String[] args) {
		
		String str = "shruthi";
		System.out.println(reverseString(str));
		System.out.println(reverseWORecusrive(str));
	}

	private static String reverseWORecusrive(String str) {
		
		StringBuffer sbr = new StringBuffer();
		sbr.append(str);
		sbr.reverse();
		return sbr.toString();
	}

	private static String reverseString(String str) {
		int length = str.length();
		if(str.length() == 1) return str;
		String newStr = "";
		newStr  += str.charAt(length-1) + reverseString(str.substring(0, str.length() -1));
		return newStr;
	}
}
