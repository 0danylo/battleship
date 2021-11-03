public class BattleshipGame {
	private final BattleshipPlayer player;
	private int turn;
	private final Ocean oc;
	BattleshipGame(BattleshipPlayer player) {
		this.player = player;
		oc = new Ocean();
		turn = 1;
		player.startGame();
	}
	public int play() {
		oc.placeAllBoats();
		do {
			Position shot = player.shoot();
			oc.shootAt(shot);
			player.updatePlayer(shot, oc.hit(shot), oc.boatInitial(shot), oc.boatName(shot), oc.sunk(shot), oc.allSunk(), turn>=100, turn);
			turn++;
		} while (turn <= 100 && !oc.allSunk());
		return turn - 1;
	}
}