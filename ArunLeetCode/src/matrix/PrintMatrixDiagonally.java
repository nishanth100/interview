package matrix;

public class PrintMatrixDiagonally {

	public static void main(String[] args) {
		
		int[][] matrix = {{10,11,12,13,14},
				  		  {20,21,22,23,24},
				  		  {30,41,42,43,44},
				  		  {40,51,52,53,54}};
		
		printMatrix(matrix);
	}

	private static void printMatrix(int[][] matrix) {

		if(matrix.length == 0 || matrix[0].length == 0) {
			return;
		}
		
		int m = matrix.length; 
		int n = matrix[0].length; 
		
		for(int k =0; k<=m-1; k++) {
			int i = k;
			int j =0;
			while(i >= 0) {
				System.out.print(matrix[i][j] + ", ");
				i = i-1;
				j = j+1;
			}
			System.out.println();
		}
		for(int k=1; k<=n-1; k++) {
			int i = m-1;
			int j = k;
			while(j <= n-1) {
				System.out.print(matrix[i][j] + ", ");
				i = i-1;
				j = j+1;
			}
			System.out.println();
		}
	
	}
}
