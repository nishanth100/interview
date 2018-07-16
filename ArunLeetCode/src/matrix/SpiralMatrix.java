package matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		
		int[][] matrix = {{10,11,12,13,14},
				  		 {20,21,22,23,24},
				  		 {30,41,42,43,44},
				  		 {40,51,52,53,54}};
		
		List<Integer> list = printMatrixSpirally(matrix);
		System.out.println();
		System.out.println(list);
	}

	private static List<Integer> printMatrixSpirally(int[][] matrix) {
		List<Integer> list = new ArrayList<>();
		
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return list;
		}
		int last_row = matrix.length-1;
		int last_col = matrix[0].length-1;
		int l = 0;
		int k = 0;
		int i = 0;
		
		while(k<= last_row && l <= last_col) {
			for(i=k; i<=last_col; i++) {
				list.add(matrix[k][i]);
				System.out.print(matrix[k][i] + ", ");
			}
			k++;
			for(i = k; i<=last_row; i++) {
				list.add(matrix[i][last_col]);
				System.out.print(matrix[i][last_col] + ", ");
			}
			last_col--;
			if(k <= last_row) {
				for(i = last_col; i>=l; i-- ) {
					list.add(matrix[last_row][i]);
					System.out.print(matrix[last_row][i] + ", ");
				}
			}
			last_row--;
			if(l <= last_col) {
				for(i = last_row; i>=k; i--) {
					list.add(matrix[i][l]);
					System.out.print(matrix[i][l] + ", ");
				}
			}
			l++;
		}
		return list;

		
	}
}
