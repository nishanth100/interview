
public class CompressString {

	public static void main(String[] args) {
		
		String str = "aaabbbccdd";
		
		System.out.println("Bad " + stringCompressBad(str));
		System.out.println("Builder " +stringCompressBuilder(str));
	}

	private static String stringCompressBuilder(String str) { // O(p +k)
		StringBuilder sbr = new StringBuilder();
		int count = 0;
		for(int i=0; i< str.length(); i++) {
			count++;
			if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
				sbr.append(str.charAt(i));
				sbr.append(count);
				count =0;
			}
		}
		String newString = sbr.toString();
		return newString.length() < str.length() ? newString : str;
	}

	private static String stringCompressBad(String str) {  // O(p + k^2)
		
		String newStr = new String();
		int count = 0;
		for(int i=0; i< str.length(); i++ ) {
			count++;
			if(i+1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				newStr += "" + str.charAt(i) + count;
				count =0;
			}
		}
		
		return newStr.length() < str.length() ? newStr : str;
				
	}
}
 