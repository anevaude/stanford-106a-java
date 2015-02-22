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
		buildPyramid();
	}
	
	public void buildPyramid() {
		
		/* Set Bricks */
		/* For until we meet BRICKS_IN_BASE goal, loop through this */
		for (int i = 0; i < BRICKS_IN_BASE; i++) {
			
			// For each row, subtract a brick
			int bricksPerRow = BRICKS_IN_BASE - i;	
			
			for (int j = 0; j < bricksPerRow; j++) {
				
				/* Measurements */
				int posCenterX = getWidth() / 2;							
				
				// Find Horizontal Pos				
				int x = posCenterX - (BRICK_WIDTH * bricksPerRow) / 2 + (j * BRICK_WIDTH);
									
				// Find Vertical Pos
				int y = getHeight() - BRICK_HEIGHT * (i + 1);
				
				System.out.println(x);
					
				// Create and Post Brick
				GRect Brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(Brick);					
			}
		}
	}
}

