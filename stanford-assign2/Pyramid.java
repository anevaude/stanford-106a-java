/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {	
		
		/* Set Bricks */
		for (int i = 0; i < 100; i++) {
			
			/* Measurements */
			int posCenterX = ( getWidth() ) / 2;		
			int posBottomY = ( getHeight() ) - (BRICK_HEIGHT + 1);
			int halfWidth = BRICK_WIDTH / 2;
			int halfHeight = BRICK_HEIGHT / 2;			
			
			int x = posCenterX - halfWidth - (BRICK_WIDTH * i);
			int y = posBottomY - halfHeight - (BRICK_HEIGHT * i);
					
			GRect Brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
			add(Brick);				
		
		}
	}
}

