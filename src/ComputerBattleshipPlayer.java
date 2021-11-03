public class ComputerBattleshipPlayer extends BattleshipPlayer {
	public void startGame () {
		initializeGrid();
	}
	public void updatePlayer (Position shot, boolean hit, char boatInitial, String boatName, boolean sunk, boolean gameOver, boolean tooManyTurns, int turn) {
		updateGrid(shot, hit, boatInitial);
	}
	public Position shoot () {
		Position pos;
		do {
			pos = new Position((int) (Math.random()*10), (int) (Math.random()*10));
		} while(!this.getGrid().empty(pos));
		return pos;
	}
	public String getPlayerName () {
		return "Computer Player";
	}
}