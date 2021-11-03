import java.util.Scanner;

public class Position {
	private final char row;
	private final int col;
	Position (char posRow, int posCol) {
		row = posRow;
		col = posCol;
	}
	Position (int rowIndex, int columnIndex) {
		row = (char) (rowIndex + 65);
		col = columnIndex + 1;
	}
	Position() {
		PositionChecker checker = new PositionChecker();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Position: ");
		Position newPos = checker.checkPosition(input.nextLine());
		row = newPos.getRow();
		col = newPos.getCol();
	}
	public char getRow () {
		return row;
	}
	public int getCol () {
		return col;
	}
	public int rowIndex () {
		return row-65;
	}
	public int columnIndex () {
		return col-1;
	}
	public String toString () {
		return row + "-" + col;
	}
}