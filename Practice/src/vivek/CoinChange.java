package vivek;

public class CoinChange {

	public static void main(String[] args) {
		Implement iObj = new Implement();
		System.out.println(iObj.recurcive(8, 4));
		// 7 (n) is sum and 4(K) means it uses 1,2,3,4 coins //

	}

}

class Implement {
	int ways = 0;

	public int recurcive(int n, int k) {
		if (n == 0 || k == 1) {
			return 1;
		} else if (n > 0) {
			ways = recurcive(n, k - 1) + recurcive(n - k, k);
			return ways;
		}

		return 0;

	}

}