
public class Fibonacci {

	public static void main(String[] args) {
		
		int num = fibSum(6);
		System.out.println(num);
	}

	private static int fibSum(int n) {

		int[] fib = new int[2];
		fib[0] = 0; fib[1] = 1;
		
		for(int i =2; i<= n; i++) {
			fib[i % 2] = fib[0] + fib[1];
		}
		int res = fib[n % 2];
		return res;
	}
}
