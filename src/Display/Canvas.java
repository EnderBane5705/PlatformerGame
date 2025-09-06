package src.Display;

import java.swing.*;
import java.util.*;


public class Canvas extends JPanel{
	private int scale = 20;
	private sizeX;
	private sizeY;
	public Canvas(sizeX, sizeY) {
		this.sizeX = sizeX;
		this.sizeY = sizeY;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
	public static width() {
		return sizeX / scale;
	}
	
	public static height() {
		return sizeY / scale;
	}
}