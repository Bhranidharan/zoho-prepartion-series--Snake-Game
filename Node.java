package snake_game;

public class Node {
	
	private int row;
	private int col;
	
	
	 Node(int row, int col) {
		//super();
		this.row = row;
		this.col = col;
	}

	@Override
	public String toString() {
		return "Node [row=" + row + ", col=" + col + "]";
	}
	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	
	

}
