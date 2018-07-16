package matrix;

public class RotateMatrix {

	/*
	 * This problem takes O(n^2) time
	 */
	public static void main(String[] args) {
		int[][] matrix = randomMatrix(4,4,15);
		printMatrix(matrix);
		rotateMatrixBy90(matrix);
		System.out.println("AFTER ROTATION");
		printMatrix(matrix);
	}

	private static int[][] randomMatrix(int m, int n, int k) {
		int matrix[][] = new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				matrix[i][j] = randomInt(k);
			}
		}
		return matrix;
	}

	private static int randomInt(int val) {
		return (int) (Math.random() * val);
	}

	private static void printMatrix(int[][] matrix) {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix.length; j++) {
				if(matrix[i][j] < 10 && matrix[i][j] > -10) {
					System.out.print(" ");
				}if(matrix[i][j] < 100 && matrix[i][j] > -100) {
					System.out.print(" ");
				}
				System.out.print(" " + matrix[i][j]);
			}
			System.out.println();
		}
	}

	private static void rotateMatrixBy90(int[][] matrix) {

		if(matrix.length != matrix[0].length) {
			return;
		}
		int n = matrix.length;
		for(int layer =0; layer < n/2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i<last; i++) {
				int offset = i - first;
				// top
				int top = matrix[first][i];
				// left to top
				matrix[first][i] = matrix[last-offset][first];
				//bottom to left
				matrix[last-offset][first] = matrix[last][last-offset];
				//right to bottom
				matrix[last][last-offset] = matrix[i][last];
				// top to right
				matrix[i][last] = top; 
			}
		}
	}
}
