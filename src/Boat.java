public class Boat {
	private final int[] allSizes = {5, 4, 3, 2, 3};
	private final String[] allNames = {"Aircraft Carrier", "Battleship", "Cruiser", "Destroyer", "Submarine"};

	private int size;
	private final String name;
	private final Position pos;
	private final String orientation;
	private boolean[] hits;

	public Boat(String name, Position lowPos, String orientation) {
		this.name = name;
		pos = lowPos;
		this.orientation = orientation.toLowerCase();

		for(int i = 0; i < allNames.length; i++)
			if (allNames[i].equals(name)) {
				size = allSizes[i];
				hits = new boolean[size];
			}
	}
	public int getSize() {
		return size;
	}
	public String getName() {
		return name;
	}
	public Position getPos() {
		return pos;
	}
	public String getOrien() {
		return orientation;
	}
	public char getAbbrev() {
		return name.charAt(0);
	}
	public void hit(Position checkPos) {
		if (onBoat(checkPos))
			if (orientation.equals("vertical"))
				hits[checkPos.rowIndex() - pos.rowIndex()] = true;
			else
				hits[checkPos.columnIndex() - pos.columnIndex()] = true;
	}
	public boolean onBoat(Position checkPos) {
		if (orientation.equals("vertical"))
			return pos.getCol() == checkPos.getCol() && pos.getRow() <= checkPos.getRow() && pos.getRow() + size > checkPos.getRow();
		else
			return pos.getRow() == checkPos.getRow() && pos.getCol() <= checkPos.getCol() && pos.getCol() + size > checkPos.getCol();
	}
	public boolean isHit(Position checkPos) {
		if (onBoat(checkPos))
			if (orientation.equals("vertical"))
				return hits[checkPos.rowIndex() - pos.rowIndex()];
			else
				return hits[checkPos.columnIndex() - pos.columnIndex()];
		return false;
	}
	public boolean sunk() {
		for (boolean hit : hits)
			if (!hit)
				return false;
		return true;
	}
}