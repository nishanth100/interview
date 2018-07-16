package LeetCode;

public class PalindromeNumWOSpace {

	public static void main(String[] args) {
		
		int pal = 121;
		System.out.println(isPalindrome(pal));
	}

	private static boolean isPalindrome(int x) {
		
		if(x < 0 ||  x%10 == 0 ) {
			return false;
		}
		int reverse = 0;
		int original = x;
		
		while(x != 0) {
			reverse = reverse * 10 + x %10;
			x = x/10;
		}
		
		return reverse == original;
	}
}
