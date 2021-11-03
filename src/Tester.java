public class Tester {
	public static void main (String[] args) {
		//Battleship 1
//		Position pos1 = new Position('B', 3);
//		System.out.println(pos1.getRow());
//		System.out.println(pos1.getCol());
//		System.out.println(pos1 + "\n");
//
//		Position pos2 = new Position('G', 5);
//		System.out.println(pos2.getRow());
//		System.out.println(pos2.getCol());
//		System.out.println(pos2);
//		System.out.println((char) 0);
//
//		//Battleship 2 + PositionChecker
//		Position pos3 = new Position(3, 2);
//		System.out.println(pos3);
//		System.out.println(pos3.getRow());
//		System.out.println(pos3.getCol());
//		System.out.println(pos3.rowIndex());
//		System.out.println(pos3.columnIndex() + "\n");
//
//		Position pos4 = new Position('D', 5);
//		System.out.println(pos4);
//		System.out.println(pos4.getRow());
//		System.out.println(pos4.getCol());
//		System.out.println(pos4.rowIndex());
//		System.out.println(pos4.columnIndex() + "\n");
//
//		for (int i = 0; i < 8; i++) {
//			Position pos5 = new Position();
//			System.out.println(pos5);
//			System.out.println(pos5.getRow());
//			System.out.println(pos5.getCol());
//			System.out.println(pos5.rowIndex());
//			System.out.println(pos5.columnIndex() + "\n");
//		}
		
		//Battleship 3 | Boat
//		String t = "true", f = "false";
//		String vl = "vertical", hl = "horizontal";
//		String AC = "Aircraft Carrier", B = "Battleship", C = "Cruiser", D = "Destroyer", S = "Submarine";
//
//		String[] expectedVals = {"5", "4", "3", "2", "3", vl, hl, "A-5", "J-5", "E-1", "E-10", "E-5",
//		/*name*/				AC, B, C, D, S,
//		/*abbrev*/			"A", "B", "C", "D", "S",
//		/*size*/				"5", "4", "3", "2", "3",
//		/*onBoat*/			t, f, f, f, f, f, f, f, f, f,
//		/*isHit*/				t, f, f, f, f, f, f, f, f, f, f,
//		/*hit*/				t, t, f, f, f, f, f, f, f, f, f,
//		/*sunk*/				f, f, t,
//		/*pos*/				"A-5", "J-5", "E-1", "E-10", "E-5",
//		/*orien*/				vl, hl};
//		String[] actualVals = new String[expectedVals.length];
//
//		//Constructor
//		Boat a5ac1 = new Boat(AC, new Position('A', 5), vl);
//		Boat j5b2 = new Boat(B, new Position('J', 5), hl);
//		Boat e1c3 = new Boat(C, new Position('E', 1), vl);
//		Boat e10d4 = new Boat(D, new Position('E', 10), vl);
//		Boat e5s5 = new Boat(S, new Position('E', 5), vl);
//		actualVals[0] = Integer.toString(a5ac1.getSize());
//		actualVals[1] = Integer.toString(j5b2.getSize());
//		actualVals[2] = Integer.toString(e1c3.getSize());
//		actualVals[3] = Integer.toString(e10d4.getSize());
//		actualVals[4] = Integer.toString(e5s5.getSize());
//		actualVals[5] = a5ac1.getOrien();
//		actualVals[6] = j5b2.getOrien();
//		actualVals[7] = a5ac1.getPos().toString();
//		actualVals[8] = j5b2.getPos().toString();
//		actualVals[9] = e1c3.getPos().toString();
//		actualVals[10] = e10d4.getPos().toString();
//		actualVals[11] = e5s5.getPos().toString();
//
//		//name
//		actualVals[12] = a5ac1.getName();
//		actualVals[13] = j5b2.getName();
//		actualVals[14] = e1c3.getName();
//		actualVals[15] = e10d4.getName();
//		actualVals[16] = e5s5.getName();
//
//		//abbrev
//		actualVals[17] = Character.toString(a5ac1.getAbbrev());
//		actualVals[18] = Character.toString(j5b2.getAbbrev());
//		actualVals[19] = Character.toString(e1c3.getAbbrev());
//		actualVals[20] = Character.toString(e10d4.getAbbrev());
//		actualVals[21] = Character.toString(e5s5.getAbbrev());
//
//		//size
//		actualVals[22] = Integer.toString(a5ac1.getSize());
//		actualVals[23] = Integer.toString(j5b2.getSize());
//		actualVals[24] = Integer.toString(e1c3.getSize());
//		actualVals[25] = Integer.toString(e10d4.getSize());
//		actualVals[26] = Integer.toString(e5s5.getSize());
//
//		//onBoat
//		actualVals[27] = Boolean.toString(e5s5.onBoat(new Position('E', 5)));
//		actualVals[28] = Boolean.toString(e5s5.onBoat(new Position('B', 5)));
//		actualVals[29] = Boolean.toString(e5s5.onBoat(new Position('D', 5)));
//		actualVals[30] = Boolean.toString(e5s5.onBoat(new Position('E', 4)));
//		actualVals[31] = Boolean.toString(e5s5.onBoat(new Position('E', 6)));
//		actualVals[32] = Boolean.toString(j5b2.onBoat(new Position('K', 8)));
//		actualVals[33] = Boolean.toString(j5b2.onBoat(new Position('J', 4)));
//		actualVals[34] = Boolean.toString(j5b2.onBoat(new Position('I', 5)));
//		actualVals[35] = Boolean.toString(j5b2.onBoat(new Position('K', 5)));
//		actualVals[36] = Boolean.toString(e5s5.onBoat(new Position('A', 1)));
//
//		//isHit
//		e5s5.hit(new Position('E', 5));
//		actualVals[37] = Boolean.toString(e5s5.isHit(new Position('E', 5)));
//		actualVals[38] = Boolean.toString(e5s5.isHit(new Position('G', 5)));
//		actualVals[39] = Boolean.toString(e5s5.isHit(new Position('B', 5)));
//		actualVals[40] = Boolean.toString(e5s5.isHit(new Position('D', 5)));
//		actualVals[41] = Boolean.toString(e5s5.isHit(new Position('E', 4)));
//		actualVals[42] = Boolean.toString(e5s5.isHit(new Position('E', 6)));
//		actualVals[43] = Boolean.toString(j5b2.isHit(new Position('K', 8)));
//		actualVals[44] = Boolean.toString(j5b2.isHit(new Position('J', 4)));
//		actualVals[45] = Boolean.toString(j5b2.isHit(new Position('I', 5)));
//		actualVals[46] = Boolean.toString(j5b2.isHit(new Position('K', 5)));
//		actualVals[47] = Boolean.toString(e5s5.isHit(new Position('A', 1)));
//
//		//hit
//		e5s5.hit(new Position('E', 5));
//		e5s5.hit(new Position('E', 5));
//		actualVals[48] = Boolean.toString(e5s5.isHit(new Position('E', 5)));
//		e5s5.hit(new Position('G', 5));
//		actualVals[49] = Boolean.toString(e5s5.isHit(new Position('G', 5)));
//		e5s5.hit(new Position('B', 5));
//		actualVals[50] = Boolean.toString(e5s5.isHit(new Position('B', 5)));
//		e5s5.hit(new Position('D', 5));
//		actualVals[51] = Boolean.toString(e5s5.isHit(new Position('D', 5)));
//		e5s5.hit(new Position('E', 4));
//		actualVals[52] = Boolean.toString(e5s5.isHit(new Position('E', 4)));
//		e5s5.hit(new Position('E', 6));
//		actualVals[53] = Boolean.toString(e5s5.isHit(new Position('E', 6)));
//		j5b2.hit(new Position('K', 8));
//		actualVals[54] = Boolean.toString(j5b2.isHit(new Position('K', 8)));
//		j5b2.hit(new Position('J', 4));
//		actualVals[55] = Boolean.toString(j5b2.isHit(new Position('J', 4)));
//		j5b2.hit(new Position('I', 5));
//		actualVals[56] = Boolean.toString(j5b2.isHit(new Position('I', 5)));
//		j5b2.hit(new Position('K', 5));
//		actualVals[57] = Boolean.toString(j5b2.isHit(new Position('K', 5)));
//		j5b2.hit(new Position('A', 1));
//		actualVals[58] = Boolean.toString(e5s5.isHit(new Position('A', 1)));
//
//		//sunk
//		actualVals[59] = Boolean.toString(e10d4.sunk());
//		e10d4.hit(new Position('E', 10));
//		actualVals[60] = Boolean.toString(e10d4.sunk());
//		e10d4.hit(new Position('F', 10));
//		actualVals[61] = Boolean.toString(e10d4.sunk());
//
//		//pos
//		actualVals[62] = a5ac1.getPos().toString();
//		actualVals[63] = j5b2.getPos().toString();
//		actualVals[64] = e1c3.getPos().toString();
//		actualVals[65] = e10d4.getPos().toString();
//		actualVals[66] = e5s5.getPos().toString();
//
//		//orien
//		actualVals[67] = a5ac1.getOrien();
//		actualVals[68] = j5b2.getOrien();

//		System.out.println();
//		int failCount = 0;
//		System.out.println("    RESULT  EXPECTED | ACTUAL");
//		for (int i = 0; i < actualVals.length; i++) {
//			boolean pass = expectedVals[i].equals(actualVals[i]);
//			System.out.println(i+": "+(i<10?" ":"")+(pass?"-PASS-":" FAIL ")+"  "+expectedVals[i]+" | "+actualVals[i]);
//			failCount += (pass ? 0 : 1);
//		}
//		System.out.println("\n"+"FAILS: "+failCount+" out of "+actualVals.length+", "+(int)(100-((double)failCount/actualVals.length)*100)+"% working");
	
		//Battleship 4 | Ocean
		
		//Battleship 5 | BattleshipGrid
//		BattleshipGrid grid1 = new BattleshipGrid();
//		char[][] grid = new char[10][10];
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				Position pos = new Position(i, j);
//				double chance = Math.random();
//				if (chance>.55) {
//					grid1.shotAt(pos, true, (char) (65 + (int) (Math.random() * 10)));
//					grid[pos.rowIndex()][pos.columnIndex()] = (char) (65 + (int) (Math.random() * 10));
//				} else if (chance<.45) {
//					grid1.shotAt(pos, false, (char) (65 + (int) (Math.random() * 10)));
//					grid[pos.rowIndex()][pos.columnIndex()] = ' ';
//				}
//				System.out.println((int)grid[i][j] + " " + (grid1.hit(pos) ? grid1.boatInitial(pos) : grid1.miss(pos) ? ' ' : "0"));
//			}
//			System.out.println();
//		}
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				Position pos = new Position(i, j);
//				System.out.print((grid1.hit(pos) ? grid1.boatInitial(pos) : grid1.miss(pos) ? '~' : '~') + " ");
//			}
//			System.out.println();
//		}
		
		//Battleship 6 | placeAllBoats
//		Ocean ocean1;
//		for (int i = 0; i < 10; i++) {
//			ocean1 = new Ocean();
//			ocean1.placeAllBoats();
//			ocean1.printBoatLocations();
//			System.out.println();
//		}
		
		//Battleship 7 | BattleshipPlayer
//		BattleshipGame game = new BattleshipGame(new BattleshipPlayer());
//		System.out.println(game.play());
		
		//Battleship 8 | ComputerBattleshipPlayer & PlayerEvaluator
//		int runs = 1000000;
//		ComputerBattleshipPlayer player = new ComputerBattleshipPlayer();
//		long initialT = System.currentTimeMillis();
//		PlayerEvaluator eval = new PlayerEvaluator(player, runs);
//		long finalT = System.currentTimeMillis();
//		System.out.println("After " + runs + " runs and " + (double)(finalT-initialT) / 1000 + " seconds: ");
//		System.out.println("Maximum: " + eval.maxTurns());
//		System.out.println("Minimum: " + eval.minTurns());
//		System.out.println("Average: " + eval.avgTurns());
		
		//DanyloVoloshynStrategy
		int runs = 100000;
		DanyloVoloshynStrategy player = new DanyloVoloshynStrategy();
		long initialT = System.currentTimeMillis();
		PlayerEvaluator eval = new PlayerEvaluator(player, runs);
		long finalT = System.currentTimeMillis();
		System.out.println("After " + runs + " runs and " + (double) (finalT-initialT) / 1000 + " seconds:");
		System.out.println("Maximum: " + eval.maxTurns());
		System.out.println("Minimum: " + eval.minTurns());
		System.out.println("Average: " + eval.avgTurns());
		for (int i = 0; i < eval.dist().length; i++) {
			System.out.println(i+17 + " turns: " + eval.dist()[i]);
		}
	}
}