public class BattleshipGrid {
	private final char[][] grid = new char[10][10];
	public void shotAt (Position pos, boolean hit, char initial) {
		grid[pos.rowIndex()][pos.columnIndex()] = hit ? initial : ' ';
	}
	public boolean hit (Position pos) {
		return grid[pos.rowIndex()][pos.columnIndex()] >= 'A';
	}
	public boolean miss (Position pos) {
		return grid[pos.rowIndex()][pos.columnIndex()] == ' ';
	}
	public boolean empty (Position pos) {
		return grid[pos.rowIndex()][pos.columnIndex()] == 0;
	}
	public char boatInitial (Position pos) {
		return grid[pos.rowIndex()][pos.columnIndex()];
	}
}