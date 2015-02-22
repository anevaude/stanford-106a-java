/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class Target extends GraphicsProgram {	
	public void run() {
		drawTarget();
	}
	
	public void drawTarget() {
		
		// Find Centers
		int x = (getWidth() / 2);
		int y = (getHeight() / 2);
		
		// Prep Circles
		GOval circleRedA = new GOval(x, y, 72, 72);
		GOval circleWhiteB = new GOval(x, y, 48, 48);		
		GOval circleRedC = new GOval(x, y, 22, 22);
		
		circleRedA.setFilled(true);
		circleRedA.setColor(Color.RED);
		
		circleWhiteB.setFilled(true);
		circleWhiteB.setColor(Color.WHITE);
		
		circleRedC.setFilled(true);
		circleRedC.setColor(Color.RED);
		
		// Post Circles
		add(circleRedA);
		add(circleWhiteB);
		add(circleRedC);
		
		// Center Circles
		double center_x_A = ( x ) - ( circleRedA.getWidth() / 2 );
		double center_y_A = ( y ) - ( circleRedA.getHeight() / 2 );		
		circleRedA.setLocation(center_x_A, center_y_A);
		
		double center_x_B = ( x ) - ( circleWhiteB.getWidth() / 2 );
		double center_y_B = ( y ) - ( circleWhiteB.getHeight() / 2 );		
		circleWhiteB.setLocation(center_x_B, center_y_B);
		
		double center_x_C = ( x ) - ( circleRedC.getWidth() / 2 );
		double center_y_C = ( y ) - ( circleRedC.getHeight() / 2 );		
		circleRedC.setLocation(center_x_C, center_y_C);		
		
	};
}