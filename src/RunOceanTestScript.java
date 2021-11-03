public class RunOceanTestScript {
	public static void main (String[] args) {
		// Testing all vertical ships and placing vertical ships side by side
		Ocean o1 = new Ocean();
		try {
			o1.placeBoat("Aircraft Carrier", "vertical", new Position(0,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o1.placeBoat("Battleship","vertical", new Position(0,1));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o1.placeBoat("Cruiser", "vertical", new Position(0,2));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o1.placeBoat("Destroyer", "vertical", new Position(0,3));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o1.placeBoat("Submarine", "vertical", new Position(0,4));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		}
		// Testing all horizontal ships and placing horizontal ships side by side
		Ocean o2 = new Ocean();
		try {
			o2.placeBoat("Aircraft Carrier", "horizontal", new Position(0,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o2.placeBoat("Battleship", "horizontal", new Position(1,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o2.placeBoat("Cruiser", "horizontal", new Position(2,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o2.placeBoat("Destroyer", "horizontal", new Position(3,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o2.placeBoat("Submarine", "horizontal", new Position(4,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		}
		//Testing vertical and horizontal boats that overlaps the edge of the ocean
		try {
			o1.placeBoat("Aircraft Carrier", "vertical", new Position(8,8));
			System.out.println("FAIL");
		} catch (Exception exception) {
		} try {
			o1.placeBoat("Aircraft Carrier", "horizontal", new Position(0,7));
			System.out.println("FAIL");
		} catch (Exception exception) {
		}
		//Testing vertical boats overlapping each other (throws exception)
		try {
			o1.placeBoat("Aircraft Carrier", "vertical", new Position(0,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		} try {
			o1.placeBoat("Battleship","vertical", new Position(0,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		} try {
			o1.placeBoat("Cruiser", "vertical", new Position(0,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		} try {
			o1.placeBoat("Destroyer", "vertical", new Position(0,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		} try {
			o1.placeBoat("Submarine", "vertical", new Position(0,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		}
		//Testing horizontal boats overlapping each other (throws exception)
		try {
			o2.placeBoat("Aircraft Carrier", "horizontal", new Position(0,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		} try {
			o2.placeBoat("Battleship", "horizontal", new Position(0,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		} try {
			o2.placeBoat("Cruiser", "horizontal", new Position(0,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		} try {
			o2.placeBoat("Destroyer", "horizontal", new Position(0,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		} try {
			o2.placeBoat("Submarine", "horizontal", new Position(0,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		}
		// Testing horizontal boats overlapping multiple boats (throws exception)
		try {
			o1.placeBoat("Aircraft Carrier", "horizontal", new Position(0,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		} try {
			o1.placeBoat("Battleship","horizontal", new Position(0,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		} try {
			o1.placeBoat("Cruiser", "horizontal", new Position(0,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		} try {
			o1.placeBoat("Destroyer", "horizontal", new Position(0,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		} try {
			o1.placeBoat("Submarine", "horizontal", new Position(0,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		}
		// Testing vertical boats overlapping multiple boats (throws exception)
		try {
			o2.placeBoat("Aircraft Carrier", "vertical", new Position(0,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		} try {
			o2.placeBoat("Battleship","vertical", new Position(0,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		}
		try {
			o2.placeBoat("Cruiser", "vertical", new Position(0,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		} try {
			o2.placeBoat("Destroyer", "vertical", new Position(0,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		} try {
			o2.placeBoat("Submarine", "vertical", new Position(0,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		}
		// Testing vertical boats of the same type completely overlapping each other
		try {
			o1.placeBoat("Aircraft Carrier", "vertical", new Position(0,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		} try {
			o1.placeBoat("Battleship","vertical", new Position(0,1));
			System.out.println("FAIL");
		} catch (Exception exception) {
		} try {
			o1.placeBoat("Cruiser", "vertical", new Position(0,2));
			System.out.println("FAIL");
		} catch (Exception exception) {
		} try {
			o1.placeBoat("Destroyer", "vertical", new Position(0,3));
			System.out.println("FAIL");
		} catch (Exception exception) {
		} try {
			o1.placeBoat("Submarine", "vertical", new Position(0,4));
			System.out.println("FAIL");
		} catch (Exception exception) {
		}
		// Testing horizontal boats of the same type completely overlapping each other
		try {
			o2.placeBoat("Aircraft Carrier", "horizontal", new Position(0,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		} try {
			o2.placeBoat("Battleship", "horizontal", new Position(1,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		} try {
			o2.placeBoat("Cruiser", "horizontal", new Position(2,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		} try {
			o2.placeBoat("Destroyer", "horizontal", new Position(3,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		} try {
			o2.placeBoat("Submarine", "horizontal", new Position(4,0));
			System.out.println("FAIL");
		} catch (Exception exception) {
		}
		//Testing overlapping top and right side of the ocean
		System.out.println();
		try {
			o1.placeBoat("Aircraft Carrier", "vertical", new Position(-1,4));
			System.out.println("FAIL");
		} catch (Exception exception) {
		} try {
			o1.placeBoat("Battleship","horizontal", new Position(4,-1));
			System.out.println("FAIL");
		} catch (Exception exception) {

		}
		
		//B.     shootAt method
		Ocean o3 = new Ocean();
		try {
			o3.placeBoat("Aircraft Carrier", "vertical", new Position(0,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o3.placeBoat("Battleship","vertical", new Position(0,1));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o3.placeBoat("Cruiser","vertical", new Position(0,2));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o3.placeBoat("Destroyer","vertical", new Position(0,3));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o3.placeBoat("Submarine","vertical", new Position(0,4));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		}
		o3.shootAt(new Position(0,0));   //position without a boat
		o3.shootAt(new Position(0,0));   //already shot position without boat
		o3.shootAt(new Position(0,3));
		o3.shootAt(new Position(0,3));   //already shot position on boat
		try {
			o3.shootAt(new Position(10,10)); //position not on board
			System.out.println("FAIL");
		} catch (Exception e) {
		
		}
		//Shooting vertical boats
		o3.shootAt(new Position(1,0));
		o3.shootAt(new Position(2,1));
		o3.shootAt(new Position(1,2));
		o3.shootAt(new Position(1,3));
		o3.shootAt(new Position(1,4));
		//Shooting Horizontal Boats
		Ocean o31 = new Ocean();
		try {
			o31.placeBoat("Aircraft Carrier","horizontal", new Position(1,1));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o31.placeBoat("Battleship","horizontal", new Position(2,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o31.placeBoat("Cruiser","horizontal", new Position(3,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o31.placeBoat("Destroyer","horizontal", new Position(4,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o31.placeBoat("Submarine","horizontal", new Position(5,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		}
		o31.shootAt(new Position(1,0));
		o31.shootAt(new Position(2,1));
		o31.shootAt(new Position(3,2));
		o31.shootAt(new Position(4,1));
		o31.shootAt(new Position(5,1));
		o31.shootAt(new Position(0,0)); //shoot at position above boat
		o31.shootAt(new Position(1,0)); //shoot at position left of boat
		o31.shootAt(new Position(1,6)); //shoot at position right of boat
		o31.shootAt(new Position(6,0)); //shoot at position below a boat
		
		//C.   hit method
		Ocean o4 = new Ocean();
		try {
			o4.placeBoat("Aircraft Carrier", "horizontal", new Position(0,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o4.placeBoat("Battleship", "horizontal", new Position(1,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o4.placeBoat("Cruiser", "horizontal", new Position(2,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o4.placeBoat("Destroyer", "horizontal", new Position(3,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o4.placeBoat("Submarine", "horizontal", new Position(4,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o4.placeBoat("Aircraft Carrier", "vertical", new Position(0,5)); //INDEX OOB 5
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o4.placeBoat("Battleship", "vertical", new Position(0,6)); //INDEX OOB 5
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o4.placeBoat("Cruiser", "vertical", new Position(0,7)); //INDEX OOB 5
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o4.placeBoat("Destroyer", "vertical", new Position(0,8)); //INDEX OOB 5
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o4.placeBoat("Submarine", "vertical", new Position(0,9)); //INDEX OOB 5
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		}
		//outside board
		try {
			o4.hit(new Position(0,10));
			System.out.println("FAIL");
		} catch (Exception e) {
		
		}
		//off boat
		o4.hit(new Position(9,0));
		//on boat not shot
		o4.hit(new Position(0,0));
		//off boat shot
		o4.shootAt(new Position(9,0));
		o4.hit(new Position(9,0));
		//on boat shot
		o4.shootAt(new Position(0,0));
		o4.hit(new Position(0,0));
		//horizontal battleship
		o4.shootAt(new Position(1,0));
		o4.hit(new Position(1,0));
		//horizontal cruiser
		o4.shootAt(new Position(2,0));
		o4.hit(new Position(2,0));
		//horizontal destroyer
		o4.shootAt(new Position(3,0));
		o4.hit(new Position(3,0));
		//horizontal submarine
		o4.shootAt(new Position(4,0));
		o4.hit(new Position(4,0));
		//vertical aircraft carrier
//		o4.shootAt(new Position(0,5)); //INDEX OUT OF BOUNDS (5)
//		o4.hit(new Position(0,5));
//		//vertical battleship
//		o4.shootAt(new Position(0,6));
//		o4.hit(new Position(0,6));
//		//vertical cruiser
//		o4.shootAt(new Position(0,7));
//		o4.hit(new Position(0,7));
//		//vertical destroyer
//		o4.shootAt(new Position(0,8));
//		o4.hit(new Position(0,8));
//		//vertical submarine
//		o4.shootAt(new Position(0,9));
//		o4.hit(new Position(0,9));
//		//on boat next to shot
//		o4.hit(new Position(0,1));
//		//off boat next to shot on boat
//		o4.hit(new Position(5,0));
//		//off boat shot next to shot on boat
//		o4.shootAt(new Position(5,0));
//		o4.hit(new Position(5,0));
		
		//D.   boatInitial method
		System.out.println(o4.boatInitial(new Position(0,0))+": expected A"); //’A’
		System.out.println(o4.boatInitial(new Position(1,0))+": expected B"); //’B’
		System.out.println(o4.boatInitial(new Position(2,0))+": expected C"); //’C’
		System.out.println(o4.boatInitial(new Position(3,0))+": expected D"); //’D’
		System.out.println(o4.boatInitial(new Position(4,0))+": expected S"); //’S’
//		o4.boatInitial(new Position(0,5)); //’A’ //INDEX OUT OF BOUNDS (5)
//		System.out.print(o4.boatInitial(new Position(0,6))+”: expected B”); //’B’
//		System.out.print(o4.boatInitial(new Position(0,7))+”: expected C”); //’C’
//		System.out.print(o4.boatInitial(new Position(0,8))+”: expected D”); //’D’
//		System.out.print(o4.boatInitial(new Position(0,9))+”: expected S”); //’S’
		
		//E.   boatName method
		System.out.println(o4.boatName(new Position(0,0))+": expected Aircraft Carrier"); //”Aircraft Carrier”
		System.out.println(o4.boatName(new Position(1,0))+": expected Battleship"); //”Battleship”
		System.out.println(o4.boatName(new Position(2,0))+": expected Cruiser"); //”Cruiser”
		System.out.println(o4.boatName(new Position(3,0))+": expected Destroyer"); //”Destroyer”
		System.out.println(o4.boatName(new Position(4,0))+": expected Submarine"); //”Submarine”
		try {
			o4.boatName(new Position(0,5));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		}
//		System.out.print(o4.boatName(new Position(0,6))+”: expected Battleship”); //”Battleship”
//		System.out.print(o4.boatName(new Position(0,7))+”: expected Cruiser”); //”Cruiser”
//		System.out.print(o4.boatName(new Position(0,8))+”: expected Destroyer”); //”Destroyer”
//		System.out.print(o4.boatName(new Position(0,9))+”: expected Submarine”); //”Submarine”
		
		//F.      sunk method
		Ocean o5 = new Ocean();
		try {
			o5.placeBoat("Aircraft Carrier", "horizontal", new Position(0,1));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o5.placeBoat("Battleship", "horizontal", new Position(1,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o5.placeBoat("Cruiser", "horizontal", new Position(2,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o5.placeBoat("Destroyer", "horizontal", new Position(3,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o5.placeBoat("Submarine", "horizontal", new Position(5,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		}
		Ocean o51 = new Ocean();
		try {
			o51.placeBoat("Aircraft Carrier", "vertical", new Position(0,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o51.placeBoat("Battleship", "vertical", new Position(0,1));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o51.placeBoat("Cruiser", "vertical", new Position(0,2));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o51.placeBoat("Destroyer", "vertical", new Position(0,3));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o51.placeBoat("Submarine", "vertical", new Position(0,4));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		}
		System.out.println(o5.sunk(new Position(0,1))+": expected false"); //boat that hasn't been hit
		try {
			System.out.println(o5.sunk(new Position(10,10))); //position not on board
			System.out.println("FAIL");
		} catch (Exception e) {
		}
		o5.shootAt(new Position(0,0));
		System.out.println(o5.sunk(new Position(0,0))+": expected false"); //hit but not sunk
		System.out.println(o5.sunk(new Position(0,0))+": expected false");  //position below boat
		System.out.println(o5.sunk(new Position(0,6))+": expected false");  //position right of boat
		System.out.println(o5.sunk(new Position(0,0))+": expected false");  //position left of boat
		System.out.println(o5.sunk(new Position(4,0))+": expected false");  //position above of boat
		o5.shootAt(new Position(3,0));
		o5.shootAt(new Position(3,0));
		System.out.println(o5.sunk(new Position(3,0))+": expected false");  //destroyer hit twice in same spot
		o5.shootAt(new Position(0,1));
		o5.shootAt(new Position(0,2));
		o5.shootAt(new Position(0,3));
		o5.shootAt(new Position(0,4));
		o5.shootAt(new Position(0,5));
		System.out.println(o5.sunk(new Position(0,1))+": expected true");  //Aircraft horizontal sunk
		o5.shootAt(new Position(1,0));
		o5.shootAt(new Position(1,1));
		o5.shootAt(new Position(1,2));
		o5.shootAt(new Position(1,3));
		System.out.println(o5.sunk(new Position(1,1))+": expected true");  //Battleship horizontal sunk
		o5.shootAt(new Position(2,0));
		o5.shootAt(new Position(2,1));
		o5.shootAt(new Position(2,2));
		System.out.println(o5.sunk(new Position(2,1))+": expected true"); //Cruiser horizontal sunk
		o5.shootAt(new Position(3,1));
		System.out.println(o5.sunk(new Position(3,1))+": expected true"); //Destroyer horizontal sunk
		o5.shootAt(new Position(5,0));
		o5.shootAt(new Position(5,1));
		o5.shootAt(new Position(5,2));
		System.out.println(o5.sunk(new Position(5,2))+": expected true"); //Submarine horizontal sunk
		o5.shootAt(new Position(0,0));
		o5.shootAt(new Position(1,0));
		o5.shootAt(new Position(2,0));
		o5.shootAt(new Position(3,0));
		o5.shootAt(new Position(4,0));
		System.out.println(o5.sunk(new Position(3,0))+": expected true"); //Aircraft vertical sunk
		o5.shootAt(new Position(0,1));
		o5.shootAt(new Position(1,1));
		o5.shootAt(new Position(2,1));
		o5.shootAt(new Position(3,1));
		System.out.println(o5.sunk(new Position(3,1))+": expected true"); //Battleship vertical sunk
		o5.shootAt(new Position(0,2));
		o5.shootAt(new Position(1,2));
		o5.shootAt(new Position(2,2));
		System.out.println(o5.sunk(new Position(2,2))+": expected true"); //Cruiser vertical sunk
		o5.shootAt(new Position(0,3));
		o5.shootAt(new Position(1,3));
		System.out.println(o5.sunk(new Position(1,3))+": expected true"); //Destroyer vertical sunk
		o5.shootAt(new Position(0,4));
		o5.shootAt(new Position(1,4));
		o5.shootAt(new Position(2,4));
		//System.out.println(o5.sunk(new Position(1,4))+": expected true"); //Submarine vertical sunk
		Ocean o7 = new Ocean();
		Ocean o6 = new Ocean();
		try {
			o7.placeBoat("Aircraft Carrier", "horizontal", new Position(0,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o7.placeBoat("Battleship","horizontal", new Position(1,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o7.placeBoat("Cruiser","horizontal", new Position(2,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		}
//		System.out.println(o6.allSunk() + ": expected false"); //no boats sunk
//		o6.shootAt(new Position(0,0));
//		o6.shootAt(new Position(0,1));
//		o6.shootAt(new Position(0,2));
//		o6.shootAt(new Position(0,3));
//		o6.shootAt(new Position(0,4));
//		System.out. println(o6.allSunk()+": expected false"); // each hit, but none sunk
//		o6.shootAt(new Position(1,0));
//		o6.shootAt(new Position(2,0));
//		o6.shootAt(new Position(3,0));
//		o6.shootAt(new Position(4,0));
//		System.out. println(o6.allSunk()+": expected false"); // one boat sunk
//		o6.shootAt(new Position(1,1));
//		o6.shootAt(new Position(2,1));
//		o6.shootAt(new Position(3,1));
//		System.out. println(o6.allSunk()+": expected false"); //two boat sunk
//		o6.shootAt(new Position(1,2));
//		o6.shootAt(new Position(2,2));
//		System.out. println(o6.allSunk()+": expected false"); //three boat sunk
//		o6.shootAt(new Position(1,3));
//		System.out. println(o6.allSunk()+": expected false"); //four boat sunk
//		o6.shootAt(new Position(1,4));
//		o6.shootAt(new Position(2,4));
		System.out. println(o6.allSunk()+": expected true"); //five boat sunk
		//Ocean o7 = new Ocean();
		System.out. println(o7.allSunk()+": expected false"); //no boats placed
		try {
			o7.placeBoat("Aircraft Carrier", "horizontal", new Position(0,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o7.placeBoat("Battleship","horizontal", new Position(1,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		} try {
			o7.placeBoat("Cruiser","horizontal", new Position(2,0));
		} catch (Exception exception) {
			System.out.println("FAIL: " + exception.getMessage());
		}
		System.out. println(o7.allSunk()+": expected false"); //some boats placed, but none sunk
		o7.shootAt(new Position(0,0));
		o7.shootAt(new Position(0,1));
		o7.shootAt(new Position(0,2));
		o7.shootAt(new Position(0,3));
		o7.shootAt(new Position(0,4));
		o7.shootAt(new Position(1,0));
		o7.shootAt(new Position(1,1));
		o7.shootAt(new Position(1,2));
		o7.shootAt(new Position(1,3));
		System.out. println(o7.allSunk()+": expected false"); //some boats placed, and some sunk
		o7.shootAt(new Position(2,0));
		o7.shootAt(new Position(2,1));
		o7.shootAt(new Position(2,2));
		System.out. println(o7.allSunk()+": expected true"); //some boats placed, and all sunk
	}
}