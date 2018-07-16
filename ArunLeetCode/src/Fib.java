public class Fib {
	
	
	public static void main(String[] args) {
		
		System.out.println( fibo(48));
	}

	private static long fibo(long num) {

		if(num == 0L) {
			return 0L;
		}
		if(num == 1L) {
			return 1L;
		}
		
		return fibo(num-1) + fibo(num-2);
	}
}
