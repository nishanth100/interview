package strings;

public class ReverseStringWordByWord {

	public static void main(String[] args) {
		
		String str = "  a  b ";
		
		System.out.println(reverseWordByWord(str.trim()));
	}

	private static String reverseWordByWord(String str) {

		if(str == null || str.length() == 0) return "";
		
		String[] strArr = str.split(" ");
		StringBuilder sbr = new StringBuilder();
		for(int i = strArr.length-1; i>=0; i--) {
			if(!strArr[i].equals("")) {
			sbr.append(strArr[i]);
			sbr.append(" ");
			}
		}
		return sbr.toString().trim();
	}
}
