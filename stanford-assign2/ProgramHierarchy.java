/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	
	private static final int RECT_WIDTH = 120;
	private static final int RECT_HEIGHT = 60;
	private static final int MAX_RECT = 3;	
	
	public void run() {
		makeBoxProgram();		
		makeBoxGraphics();
		makeBoxConsole();
		makeBoxDialog();
		
		makeLineGraphics();
		makeLineConsole();
		makeLineDialog();
	}
	
	public void makeBoxProgram(){
		double boxPosX = getWidth() / 2 - (RECT_WIDTH / 2);
		double boxPosY = getHeight() / 2 - (RECT_HEIGHT * 2);
		GRect boxProgram = new GRect(boxPosX, boxPosY, RECT_WIDTH, RECT_HEIGHT);
		add(boxProgram);
	}
	
	public void makeBoxGraphics(){
		double boxPosX = (getWidth() / 2) - (RECT_WIDTH * 2);
		double boxPosY = ( getHeight() / 2 ) + (RECT_HEIGHT);
		GRect boxGraphics = new GRect(boxPosX, boxPosY, RECT_WIDTH, RECT_HEIGHT);
		boxGraphics.setColor(Color.RED);		
		add(boxGraphics);
	}	
	
	public void makeBoxConsole(){
		double boxPosX = (getWidth() / 2) - (RECT_WIDTH / 2);
		double boxPosY = ( getHeight() / 2 ) + (RECT_HEIGHT);
		GRect boxConsole = new GRect(boxPosX, boxPosY, RECT_WIDTH, RECT_HEIGHT);
		boxConsole.setColor(Color.GREEN);		
		add(boxConsole);
	}	
	
	public void makeBoxDialog(){
		double boxPosX = (getWidth() / 2) + (RECT_WIDTH);
		double boxPosY = ( getHeight() / 2 ) + (RECT_HEIGHT);
		GRect boxDialog = new GRect(boxPosX, boxPosY, RECT_WIDTH, RECT_HEIGHT);
		boxDialog.setColor(Color.BLUE);		
		add(boxDialog);
	}	
	
	public void makeLineGraphics() {
		double x1 = (getWidth() / 2) - (RECT_WIDTH * 2) + (RECT_WIDTH / 2);
		double y1 = ( getHeight() / 2 ) + (RECT_HEIGHT);
		double x2 = (getWidth() / 2);
		double y2 = getHeight() / 2 - RECT_HEIGHT;
		GLine lineGraphics = new GLine (x1, y1, x2, y2);
		add(lineGraphics);
	}
	
	public void makeLineConsole() {
		double x1 = (getWidth() / 2);
		double y1 = (getHeight() / 2) + RECT_HEIGHT;
		double x2 = (getWidth() / 2);
		double y2 = (getHeight() / 2) - RECT_HEIGHT;
		GLine lineGraphics = new GLine (x1, y1, x2, y2);
		add(lineGraphics);
	}
	
	public void makeLineDialog() {
		double x1 = (getWidth() / 2) + (RECT_WIDTH * 2) - (RECT_WIDTH / 2); 
		double y1 = ( getHeight() / 2 ) + (RECT_HEIGHT);
		double x2 = (getWidth() / 2);
		double y2 = getHeight() / 2 - RECT_HEIGHT;
		GLine lineDialog = new GLine (x1, y1, x2, y2);
		add(lineDialog);
	}	
	
}

