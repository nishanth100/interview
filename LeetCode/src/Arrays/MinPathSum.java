package Arrays;

public class MinPathSum {

	public static void main(String[] args) {
		
		int[][] matrix = {{1,2,5},
				          {3,2,1},
				          {3,1,3}};
		
		System.out.println(minPathSum(matrix,2,2));
	}

	private static int minPathSum(int[][] cost, int m, int n) {
		
	        int temp[][] = new int[m+1][n+1];
	        int sum = 0;
	        for(int i=0; i <= n; i++){
	            temp[0][i] = sum + cost[0][i];
	            sum = temp[0][i];
	        }
	        sum = 0;
	        for(int i=0; i <= m; i++){
	            temp[i][0] = sum + cost[i][0];
	            sum = temp[i][0];
	        }
	        
	        for(int i=1; i <= m; i++){
	            for(int j=1; j <= n; j++){
	                temp[i][j] = cost[i][j] + Math.min(temp[i-1][j],temp[i][j-1]);
	            }
	        }
	        return temp[m][n];
	    }
}
