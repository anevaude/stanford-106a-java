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
		/* For until we meet BRICKS_IN_BASE goal, loop through this */
		for (int i = 0; i < BRICKS_IN_BASE; i++) {
			
			// For each row, subtract X bricks
			int bricksPerRow = BRICKS_IN_BASE - i;	
			
			for (int j = 0; j < bricksPerRow; j++) {
				
				/* Measurements */
				int posCenterX = ( getWidth() / 2 );		
				int posBottomY = getHeight() - BRICK_HEIGHT * (j + 1) ;
				int halfWidth = BRICK_WIDTH / 2;
				int halfHeight = BRICK_HEIGHT / 2;		

				
				// Find Horizontal Pos
				int x = posCenterX - ( BRICK_WIDTH * bricksPerRow )  + (BRICK_WIDTH * j);
									
				// Find Vertical Pos
				int y = posBottomY;
				
				System.out.println(x);
						
				GRect Brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(Brick);					
			}
		}
	}
}

