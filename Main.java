import java.awt.*;
import java.swing.*;
import java.util.*;
import java.awt.geom.*;
import java.awt.event.*;

import src.Display.Canvas.java;

public class Main extends JFrame {
	
	public Main() { //initialize window
		Canvas canvas = new Canvas(); //initialize game screen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(canvas);
		setSize(1000, 800);
		setResizable(false);
		setFocusable(true);
		setFocusTraversalKeysEnabled(true);
		
		//add key listener here
		
		new Game(); //initialize game loop
	}
	
	public static void main(String[] args) {
		System.out.println("PlatformerGame initializing...");
		new Main(); //start game
		System.out.println("Game running...");
	}
}