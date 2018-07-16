package strings;

public class StringCompress {

	public static void main(String[] args) {
		
		String str = "helllo world";
		
		System.out.println(compressString(str));
	}

	private static String compressString(String str) {

		if(str == null || str.length() == 0 || str == "") {
			return "";
		}
		int count = 0;
		StringBuilder sbr = new StringBuilder();
		for(int i=0; i<=str.length()-1; i++) {
			count++;
			if(i+1 >= str.length() && str.charAt(i) != str.charAt(i+1)) {
			//	newStr = newStr + str.charAt(i) + count;
				sbr.append(str.charAt(i));
				sbr.append(count);
				count =0;
			}
		}
		return str.length() >= sbr.toString().length() ? sbr.toString() : str;
	}
}
