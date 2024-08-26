package snake_game;

public class Main {
	public static void main(String args[]) {
		System.out.println("~~~~~~~~~~~Snake Game~~~~~~~~~~~~");
		Snake snake = new Snake(6, 6);
		snake.snakeMove(0, 0);
	}

}
