import java.util.Scanner;

public class TTT {

	private static char[][] board = new char[3][3];
	private static int col;
	private static int row;
	private static char turn = 'X';
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				board[i][j] = '_';
			}
		}
		play();
	}


	private static void play() {
		printBoard();
		boolean playing = true;
		int count =0;
		while(playing) {
			System.out.println("Please enter the row and column ");
			row = scanner.nextInt() -1;
			col = scanner.nextInt() -1;
			
			board[row][col] = turn;
			count++;
			if(gameOver(row, col)) {
				playing = false;
				System.out.println("Game Over ! Player " + turn + " Wins.");
			}else if(count == 9 && playing) {
					playing = false;
					System.out.println("Game Draw between X and O ");
			}
			printBoard();
			if(turn == 'X') {
				turn = 'O';
			}else {
				turn = 'X';
			}
		}
	}


	private static boolean gameOver(int rMove, int cMove) {

		if(board[0][cMove] == board[1][cMove] && board[0][cMove] == board[2][cMove]) {
			return true;	
		}
		if(board[rMove][0] == board[rMove][1] && board[rMove][0] == board[rMove][2]) {
			return true;
		}
		
		if(board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[1][1] != '_') {
			return true;
		}
		if(board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[1][1] != '_') {
			return true;
		}
		return false;
	}


	private static void printBoard() {
		for(int i=0; i<3; i++) {
			System.out.println();
			for(int j=0; j<3; j++) {
				if(j==0) {
					System.out.print(" | ");
				}
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
		}
	}
}
