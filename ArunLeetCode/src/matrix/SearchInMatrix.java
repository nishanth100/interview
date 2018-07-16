package matrix;

public class SearchInMatrix {
	/*
	 * This algorithm takes O(Mlog(N)) since there are M rows and N columns
	 */

	public static void main(String[] args) {
		/*
		int[][] matrix = {{10,11,12,13,14},
						  {20,21,22,23,24},
						  {30,41,42,43,44},
						  {40,51,52,53,54}};*/
		
		int[][] matrix = {{3},
				          {5}};
		System.out.println(searchInMatrix(matrix,10));
	}

	private static boolean searchInMatrix(int[][] matrix, int target) {
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}
		int i =0;
		int len = matrix.length;
		int j = matrix[0].length -1;
		
		while(i<len && j >= i) {
			if(matrix[i][j] == target) {
				return true;
			}else if(target < matrix[i][j]) {
				j--;
			}else {
				i++;
			}
		}
		return false;
	}
}
