package strings;

public class StringtoInteger {

	public static void main(String[] args) {
		String str = "-423";
		System.out.println(stringtoInt(str));
	}

	private static int stringtoInt(String str) {
		int index = 0;
		int sign = 1;
		Long total = 0l;
		str = str.trim();
		if(str == null || str.length() == 0) {
			return 0;
		}
		
		if(str.charAt(index)=='-'||str.charAt(index)=='+'){
        	sign = str.charAt(index)=='+' ? 1 : -1;
        	index++;
        }
	
		// convert number and avoid overflow
		while(index < str.length() && Character.isDigit(str.charAt(index))) {
			int digit = Character.getNumericValue(str.charAt(index));
			total = total*10 +digit;
			index++;
			if(total > Integer.MAX_VALUE) {
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
		}
		
		return total.intValue()*sign;
	}
}
