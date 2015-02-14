/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

/*
 * ALGORITHM
 * -------------------------------
 * put down beeper for each step til Karel hits a wall
 * turn around
 * take total beepers dropped and divide by two
 * store this answer
 * move this many spaces back, picking up beepers along the way
 * drop a beeper there
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	public void run() {
		int i = 1;
		int stepsToMiddle = 0;
		
		while(frontIsClear()){
			move();
			i++;
		}
		
		turnAround();
		
		stepsToMiddle = i / 2;
		
		for (int j = 0; j < stepsToMiddle; j++) {
			move();
		}
		
		putBeeper();
		
	}
	
}