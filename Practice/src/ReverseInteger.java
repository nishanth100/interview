
public class ReverseInteger {

	public static void main(String[] args) {
		
		int reverse = 123;
		System.out.println(revInt(reverse));
	}

	private static int revInt(int x) {
		if(x <0 || x%10 == 0) {
			return 0;
		}
		
		int reverse = 0;
		while(x != 0) {
			int temp = reverse * 10 + x % 10;
			if(temp/10 != reverse){
				return 0;
			}
			reverse = temp;
			x = x/10;
		}
		return reverse;
	}
}
