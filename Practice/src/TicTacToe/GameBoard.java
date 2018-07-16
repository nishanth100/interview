package TicTacToe;

import java.util.Scanner;

public class GameBoard {

	public static int row, col;
	public static Scanner scanner = new Scanner(System.in);
	public static char board[][]  = new char[3][3];
	public static char turn = 'X';
	
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				board[i][j] = '_';
			}
		}
		play();
	}
	
	public static void play() {
		boolean playing = true;
		printBoard();
		while(playing) {
			System.out.println("Please enter a row and column: ");
			row = scanner.nextInt() -1;
			col = scanner.nextInt() -1;
			board[row][col] = turn;
			
			if(gameOver(row, col)) {
				playing = false;
				System.out.println("Game Over player " + turn + " Wins");
			}
			printBoard();
			if(turn == 'X')
				turn = 'O';
			else
				turn = 'X';
		}
		
	}
	
	public static void printBoard() {
		
		for(int i=0; i<3; i++) {
			System.out.println();
			for(int j=0; j<3; j++) {
				if(j==0)
					System.out.print("| ");
				System.out.print(board[i][j] + " | ");
			}
		}
		System.out.println();
	}
	
	public static boolean gameOver(int rMove, int cMove) {
		
		// check perpendicular vicroty
		if(board[0][cMove] == board[1][cMove] && board[0][cMove] == board[2][cMove])
			return true;
		if(board[rMove][0] == board[rMove][1] && board[rMove][0] == board[rMove][2])
			return true;
		
		// Check Diagonal victory
		if(board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[1][1] != '_')
			return true;
		if(board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[1][1] != '_')
			return true;
		
		return false;
	}
}
