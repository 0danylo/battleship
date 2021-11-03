import java.util.Arrays;

public class DanyloVoloshynStrategy extends ComputerBattleshipPlayer {
	private String playerName;
	private String author;
	private int turn;
	private Position[] shots, adjs;
	private boolean hitFound, boatVert;
	private Position hitPos, pos1;
	private int adjIndex, length, adjsLength, boatIndex;
	private int[] boatHits;
	private boolean[] boatsSunk;
	
	public void updatePlayer (Position shot, boolean hit, char boatInitial, String boatName, boolean sunk, boolean gameOver, boolean tooManyTurns, int turn) {
		super.updatePlayer(shot, hit, boatInitial, boatName, sunk, gameOver, tooManyTurns, turn);
		updateGrid(shot, hit, boatInitial);
	}
	public String playerName () {
		return playerName;
	}
	public String author () {
		return author;
	}
	public void startGame () {
		super.startGame();
		playerName = "Danylo Voloshyn's Strategy";
		author = "Danylo Voloshyn";
		
		turn = 0;
		shots = new Position[100];
		hitFound = false;
		boatVert = false;
		hitPos = null;
		pos1 = null;
		boatHits = new int[5];
		boatsSunk = new boolean[5];
		adjIndex = 0;
		length = 0;
		adjsLength = 0;
	}
	public Position shoot () {
		BattleshipGrid grid = this.getGrid();
		Position pos;
		pos1 = null;
		
		do {
			pos = new Position((int) (Math.random()*10), (int) (Math.random()*10));
		} while(!grid.empty(pos));
		
		if (turn>0 && grid.hit(shots[turn-1]) && !hitFound) {
			hitFound = true;
			hitPos = shots[turn-1];
			char c = grid.boatInitial(hitPos);
			if (c == 'A') {
				length = 5;
				boatIndex = 0;
			} else if (c == 'B') {
				length = 4;
				boatIndex = 1;
			} else if (c == 'C') {
				length = 3;
				boatIndex = 2;
			} else if (c == 'D') {
				length = 2;
				boatIndex = 3;
			} else if (c == 'S') {
				length = 3;
				boatIndex = 4;
			}
			adjsLength = 4 * (length - 1);
			adjs = new Position[adjsLength];
		}
		
		if (hitFound && Arrays.equals(adjs, new Position[adjsLength])) {
			for (int i = 0; i < length-1; i++) {
				pos1 = new Position(hitPos.rowIndex() - (i+1), hitPos.columnIndex());
				if (hitPos.rowIndex() - (i+1) >= 0 && grid.empty(pos1))
					adjs[4 * i] = pos1;
				pos1 = new Position(hitPos.rowIndex() + (i+1), hitPos.columnIndex());
				if (hitPos.rowIndex() + (i+1) < 10 && grid.empty(pos1))
					adjs[4*i + 1] = pos1;
				pos1 = new Position(hitPos.rowIndex(), hitPos.columnIndex() - (i+1));
				if (hitPos.columnIndex() - (i+1) >= 0 && grid.empty(pos1))
					adjs[4*i + 2] = pos1;
				pos1 = new Position(hitPos.rowIndex(), hitPos.columnIndex() + (i+1));
				if (hitPos.columnIndex() + (i+1) < 10 && grid.empty(pos1))
					adjs[4*i + 3] = pos1;
			}
		}
		
		if (hitFound && !Arrays.equals(adjs, new Position[adjsLength])) {
			int posIndex = -1;
			boatHits = new int[5];
			boatsSunk = new boolean[5];
			for (int i = 0; i < turn; i++) {
				Position shot = shots[i];
				if (grid.hit(shot)) {
					if (grid.boatInitial(shot) == 'A') boatHits[0] += 1;
					if (grid.boatInitial(shot) == 'B') boatHits[1] += 1;
					if (grid.boatInitial(shot) == 'C') boatHits[2] += 1;
					if (grid.boatInitial(shot) == 'D') boatHits[3] += 1;
					if (grid.boatInitial(shot) == 'S') boatHits[4] += 1;
				}
			}
			if (boatHits[0] == 5) boatsSunk[0] = true;
			if (boatHits[1] == 4) boatsSunk[1] = true;
			if (boatHits[2] == 3) boatsSunk[2] = true;
			if (boatHits[3] == 2) boatsSunk[3] = true;
			if (boatHits[4] == 3) boatsSunk[4] = true;

			if (adjIndex < adjsLength && !boatsSunk[boatIndex]) {
				if (grid.hit(shots[turn-1]) && !shots[turn-1].equals(hitPos) && grid.boatInitial(hitPos) != 'D') {
					boatVert = hitPos.rowIndex() - shots[turn-1].rowIndex() != 0;
					if (boatVert) {
						for (int i = 0; i < adjsLength; i++)
							if (i % 4 > 1)
								adjs[i] = null;
					} else {
						for (int i = 0; i < adjsLength; i++)
							if (i % 4 < 2)
								adjs[i] = null;
					}
				}
				if (adjs[adjIndex] != null) {
					pos = adjs[adjIndex];
					adjs[adjIndex] = null;
				} else {
					for (int i = adjsLength - 1; i >= 0; i--) {
						if (adjs[i] != null) {
							pos = adjs[i];
							posIndex = i;
						}
					}
					if (posIndex > -1)
						adjs[posIndex] = null;
				}
				adjIndex += 1;
				if (Arrays.equals(adjs, new Position[adjsLength])) {
					adjIndex = 0;
					hitFound = false;
				}
			} else if (boatsSunk[boatIndex]) {
				adjs = new Position[adjsLength];
				adjIndex = 0;
				hitFound = false;
			}
		}
		shots[turn] = pos;
		turn += 1;
		return pos;
	}
}
