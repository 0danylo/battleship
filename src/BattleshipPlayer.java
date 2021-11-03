import java.util.Scanner;

public class BattleshipPlayer {
	private String playerName;
	private BattleshipGrid grid;
	
	BattleshipPlayer() {
		playerName = null;
	}
	public void startGame() {
		initializeGrid();
		if (playerName == null) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your name: ");
			playerName = input.nextLine();
			System.out.println("Welcome to Battleship, " + playerName + "!");
		}
	}
	public String getPlayerName () {
		return playerName;
	}
	public Position shoot() {
		Position pos = null;
		do {
			if (pos != null)
				System.out.println("Invalid position.");
			pos = new Position();
		} while(pos.rowIndex() == -1);
		return pos;
	}
	public void updateGrid(Position pos, boolean hit, char initial) {
		grid.shotAt(pos, hit, initial);
	}
	public BattleshipGrid getGrid() {
		return grid;
	}
	public void initializeGrid() {
		grid = new BattleshipGrid();
	}
	public void updatePlayer(Position shot, boolean hit, char boatInitial, String boatName, boolean sunk, boolean gameOver, boolean tooManyTurns, int turn) {
		updateGrid(shot, hit, boatInitial);
		System.out.println("  1 2 3 4 5 6 7 8 9 10");
		for(int i = 0; i < 10; i++) {
			char row = (char) (i + 65);
			String line = row + " ";
			for(int j = 0; j < 10; j++) {
				Position pos = new Position(i, j);
				if (grid.empty(pos))
					line += ". ";
				else if (grid.miss(pos))
					line += "* ";
				else if (grid.hit(pos))
					line += grid.boatInitial(pos) + " ";
			}
			System.out.println(line);
		}
		System.out.println("Turn " + turn + ":\n" + "Your shot on " + shot + (hit ? " hit the " + boatName : " missed") + ".");
		if (hit && sunk)
			System.out.println("The " + boatName + " is now sunken.");
		if (gameOver)
			System.out.println("The game has ended - All ships are sunken.");
		else if (tooManyTurns)
			System.out.println("The game has ended - it has gone on for too long.");
		System.out.println();
	}
}