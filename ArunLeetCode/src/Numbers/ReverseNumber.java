package Numbers;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num = -123;
		
		System.out.println(reverseNumber(num));
	}

	private static int reverseNumber(int num) {
		
		int rev = 0;
		
		while(num != 0) {
			int temp = rev*10 + num%10;
			if(temp/10 != rev) {
				return 0;
			}
			rev = temp;
			num = num/10;
		}
		
		return rev;
	}
}
