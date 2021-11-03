public class PlayerEvaluator {
	private int min = 101, max = -1;
	private float avg = 0;
	
	private final int[] distr = new int[84];
	
	PlayerEvaluator(ComputerBattleshipPlayer player, int runs) {
		int turns;
		BattleshipGame game;
		for (int i = 0; i < runs; i++) {
			game = new BattleshipGame(player);
			turns = game.play();
			if (turns < min) min = turns;
			if (turns > max) max = turns;
			avg += turns;
			
			distr[turns-17] += 1;
		}
		avg /= runs;
	}
	public int maxTurns () {
		return max;
	}
	public int minTurns () {
		return min;
	}
	public float avgTurns () {
		return avg;
	}
	public int[] dist () {
		return distr;
	}
}