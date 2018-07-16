package Numbers;

public class PrimeNumbersRange {
	
	public static void main(String[] args) {
		printPrimeRange(100);
	}

	private static void printPrimeRange(int k) {

		int i = 1;
		int j = k;
		int flag = 0;
		for(i = 1; i<= 100; i++) {
			for(j = 2; j<i; j++) {
				if(i %j == 0) {
					flag = 0;
					break;
				}else {
					flag = 1;
				}
			}
			if(flag == 1) {
				System.out.print(i + ", ");
			}
			
		}
	}

}

