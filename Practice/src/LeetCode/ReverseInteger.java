package LeetCode;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int x = 123;
		
		System.out.println(reverseInt(x));
	}

	private static int reverseInt(int x) {
		
		int reversed = 0;
		
		while(x != 0) {
			int temp = reversed * 10 + x % 10;
			if(temp / 10 != reversed) {
				return 0; 
			}
			reversed = temp;
			x = x / 10;
		}
		return reversed;
	}
}
