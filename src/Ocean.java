public class Ocean {
	private final int[][] grid = new int[10][10];
	private final Boat[] myBoats = new Boat[5];
	private int boatsPlaced = 0;
	
	Ocean() {
		for(int pos = 0; pos < 10; pos++) {
			for(int pos2 = 0; pos2 < 10; pos2++) {
				grid[pos][pos2] = -1;
			}
		}
	}
	
	public void placeAllBoats () {
		int placed = 0;
		String[] allBoats = {"Aircraft Carrier", "Battleship", "Cruiser", "Destroyer", "Submarine"};
		do {
			try {
				int row = (int) (Math.random() * 10), col = (int) (Math.random() * 10);
				String orien = Math.random() > .5 ? "vertical" : "horizontal";
				String name = allBoats[placed];
				placeBoat(name, orien, new Position(row, col));
				placed++;
			} catch (Exception e){}
		} while (placed < 5);
	}
	
	public void placeBoat(String boatName, String direction, Position pos) throws Exception {
		Boat myBoat = new Boat(boatName, pos, direction);
		if (pos.rowIndex() >= 0 && pos.columnIndex() >= 0) {
			int pos1;
			if (direction.equalsIgnoreCase("vertical")) {
				if (myBoat.getSize() + pos.rowIndex() > 10)
					throw new Exception("out of grid");
				
				for(pos1 = pos.rowIndex(); pos1 < myBoat.getSize() + pos.rowIndex(); pos1++)
					if (grid[pos1][pos.columnIndex()] != -1)
						throw new Exception("overlapping");
				
				for(pos1 = pos.rowIndex(); pos1 < myBoat.getSize() + pos.rowIndex(); pos1++)
					grid[pos1][pos.columnIndex()] = boatsPlaced;
				
			} else {
				if (myBoat.getSize() + pos.columnIndex() > 10)
					throw new Exception("out of grid");
				
				for(pos1 = pos.columnIndex(); pos1 < myBoat.getSize() + pos.columnIndex(); pos1++)
					if (grid[pos.rowIndex()][pos1] != -1)
						throw new Exception("overlapping");
				
				for(pos1 = pos.columnIndex(); pos1 < myBoat.getSize() + pos.columnIndex(); pos1++)
					grid[pos.rowIndex()][pos1] = boatsPlaced;
				
			}
			myBoats[boatsPlaced] = myBoat;
			boatsPlaced++;
			
		} else {
			throw new Exception("out of grid");
		}
	}
	
	public void shootAt(Position pos) {
		if (grid[pos.rowIndex()][pos.columnIndex()] != -1)
			myBoats[grid[pos.rowIndex()][pos.columnIndex()]].hit(pos);
	}
	
	public char boatInitial(Position pos) {
		return grid[pos.rowIndex()][pos.columnIndex()] != -1 ? myBoats[grid[pos.rowIndex()][pos.columnIndex()]].getAbbrev() : ' ';
	}
	public String boatName(Position pos) {
		return grid[pos.rowIndex()][pos.columnIndex()] != -1 ? myBoats[grid[pos.rowIndex()][pos.columnIndex()]].getName() : "";
	}
	public boolean hit(Position pos) {
		return grid[pos.rowIndex()][pos.columnIndex()] != -1 && myBoats[grid[pos.rowIndex()][pos.columnIndex()]].isHit(pos);
	}
	public boolean sunk(Position pos) {
		return grid[pos.rowIndex()][pos.columnIndex()] != -1 && myBoats[grid[pos.rowIndex()][pos.columnIndex()]].sunk();
	}
	
	public boolean allSunk() {
		for(int pos = 0; pos < boatsPlaced; pos++) {
			if (!myBoats[pos].sunk()) {
				return false;
			}
		}
		return true;
	}
	public void printBoatLocations() {
		char[] letters = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
		System.out.println("  1 2 3 4 5 6 7 8 9 10");
		
		for (int i = 0; i < 10; ++i) {
			for (int j = 0; j < 11; ++j) {
				if (j == 0)
					System.out.print(letters[i]);
				
				if (j < 10) {
					if (this.grid[i][j] == -1)
						System.out.print(" .");
					else
						System.out.print(" " + this.boatInitial(new Position(i, j)));
				}
			}
			System.out.println();
		}
	}
}