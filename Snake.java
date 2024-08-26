package snake_game;

import java.util.*;

public class Snake {
	
	Scanner an = new Scanner(System.in);
	
	private char[][] snakeBoard = null;
	private Queue<Node> snake = new LinkedList<>();
	
	Snake(int row, int col){
		this.snakeBoard = new char[row][col];
		  for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                this.snakeBoard[i][j] = '0';
	            }
	        }
		this.snake.add(new Node(0, 0));
		this.snakeBoard[1][0] = 'X';
		this.snakeBoard[2][2] = 'X';
		this.snakeBoard[3][4] = 'X';
		this.snakeBoard[5][2] = 'X';
	}
	
	public void snakeMove(int row, int col) {
		
		if(row >= 0 && row < snakeBoard.length && row >= 0 && row < snakeBoard.length) {
			if(snakeBoard[row][col] == '.') {
				System.out.println("GAME OVER!!!");
				System.exit(0);
			}
			
			snake.add(new Node(row, col));
			
			if(snakeBoard[row][col] != 'X') {
				Node node = snake.poll();
				int tailRow = node.getRow();
				int tailCol = node.getCol();
				snakeBoard[tailRow][tailCol] = '0';
			}
			
			snakeBoard[row][col] = '.';
			
			while(!snake.isEmpty()) {
				printGame();
				System.out.print("Enter Move : ");
				char move = an.next().charAt(0);
				
				if(move == 'U'){
					snakeMove(--row, col);
				}else if(move == 'D') {
					snakeMove(++row, col);
				}else if(move == 'L') {
					snakeMove(row, --col);
				}else if(move == 'R') {
					snakeMove(row, ++col);
				}else {
					System.out.println("Invalid Move");
					System.exit(0);
				}
				
			}
		}else {
			System.out.println("Invalid Move");
		}
	}
	
	public void printGame() {
		
		for(char[] game: snakeBoard) {
			for(int i=0; i<snakeBoard[0].length; i++) {
				System.out.print(game[i]+ " ");
			}
			System.out.println();
		}
		
	}

}
