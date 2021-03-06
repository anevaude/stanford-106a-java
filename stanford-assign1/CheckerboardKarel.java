/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

/*
 * ALGORITHM
 * While front is clear, move Karel.
 * If no beeper is present, put one down and move forward twice.
 * While front is NOT clear, and there's NOT a beeper, turn around.
 * Go back to start.
 * Turn around.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run() {
		
		while (frontIsClear()) {
			moveAndPlantBeepers();
			moveUpFromRight();
			moveAndPlantBeepers();
			moveUpFromLeft();			
		}
		
	}
	
	private void moveAndPlantBeepers() {
		while (frontIsClear()) {
			if (noBeepersPresent() && frontIsClear()) {
				putBeeper();
				move();
				if(frontIsClear()){
					move();					
				}
			}
		}		
	}	
	
	private void moveUpFromRight() {
		while ( !frontIsClear() ) {
			turnLeft();
			if(frontIsClear()){
				move();
				turnLeft();

			}			
		}		
	}	
	
	private void moveUpFromLeft() {
		while (! frontIsClear() ) {
			turnRight();
			if(frontIsClear()){
				move();
				turnRight();
			}	
		}		
	}		

}
