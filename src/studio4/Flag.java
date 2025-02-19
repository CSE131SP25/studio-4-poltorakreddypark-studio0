package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setCanvasSize(700, 700);
		StdDraw.setXscale(0, 700);
		StdDraw.setYscale(0, 700);
    		
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.rectangle(350, 350, 300, 200);
		
		StdDraw.setPenColor(StdDraw.BLUE);
		
		StdDraw.filledRectangle(225, 200, 175, 50);
		StdDraw.filledRectangle(150, 300, 100, 50);
		StdDraw.filledRectangle(225, 400, 175, 50);
		StdDraw.filledRectangle(150, 500, 100, 50);
		
		
	}
}