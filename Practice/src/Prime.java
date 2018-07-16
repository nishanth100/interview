
public class Prime {

	public static void main(String[] args) {
		
		int[] arr = {3,5,7,8,10};
		for(int num: arr) {
			System.out.println(isPrime(num) ? "Prime" : "Not prime");
		}
	}

	private static boolean isPrime(int n) {
		
		if(n < 2)return false;
		else if(n==2) return true;
		else if(n%2 == 0) return false;
		
		int sqrt = (int) Math.sqrt(n);
		for(int i = 2; i <= sqrt; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
