package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(0,0,128);
		StdDraw.filledRectangle(.5,.5,.4,.25);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledRectangle(.5,.5,.04,.15);
		StdDraw.filledRectangle(.5,.5,.15,.04);
	}
}