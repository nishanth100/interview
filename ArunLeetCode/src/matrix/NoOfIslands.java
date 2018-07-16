package matrix;

public class NoOfIslands {

	public static void main(String[] args) {
		
		
		int[][] arr =  {{1,1,0,0,0},
				        {0,0,1,0,1},
				        {1,1,0,0,0},
				        {1,1,1,0,0},
				        {0,1,0,1,1}};
		
		System.out.println(findNoOfOIsLands(arr));
	}

	private static int findNoOfOIsLands(int[][] grid) {

		if(grid == null || grid.length == 0 || grid[0].length == 0) return 0;
		
		
		int row = grid.length;
		int col = grid[0].length;
		int noOfIslands = 0;
		
		for(int r=0; r<row; r++) {
			for(int c=0; c <col; c++) {
				if(grid[r][c] == 1) {
					++noOfIslands;
					dfs(grid,r,c);
				}
			}
		}
		return noOfIslands;
	}

	private static void dfs(int[][] grid, int r, int c) {

		int nr = grid.length;
		int nc = grid[0].length;
		
		if(r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == 0) {
			return;
		}
		grid[r][c] = 0;
		dfs(grid,r-1,c);
		dfs(grid,r+1,c);
		dfs(grid,r,c-1);
		dfs(grid,r,c+1);
	}
}
