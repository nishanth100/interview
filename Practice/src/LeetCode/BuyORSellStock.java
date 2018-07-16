package LeetCode;

public class BuyORSellStock {
	
	public static void main(String[] args) {
		
		int[] prices = {74,32,45,21,50};
		
		System.out.println(findMaxProfit(prices));
	}

	private static int findMaxProfit(int[] prices) {
		
		int maxProfit = 0;
		int minPrice = Integer.MAX_VALUE;
		
		for(int i=0; i<prices.length; i++) {
			minPrice = Math.min(minPrice, prices[i]);
			maxProfit = Math.max(maxProfit, prices[i] - minPrice);
		}
		return maxProfit;
	}

	
	
	
}
