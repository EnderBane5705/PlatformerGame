package src;

import java.util.*;

public class Game {
	
	public static ArrayList<Entity> actors = new ArrayList<Entity>(); //other classes can add actors to the list
	Canvas canvas;
	boolean paused = false;
	
	public Game(canvas) {
		this.canvas = canvas;
	}
	
	void runAnimation(int FPS) { //globalUpdate
		long timestepMs = (long) 1000/FPS;
        float timestepSec = (float) 1/FPS;
		
		Thread t = new Thread(new Runnable() { //actor update
			public void run() {
				while (!paused) {
					
					update(timestepSec);
					
					try {
                        Thread.sleep(timestepMs);
                    }
                    catch (InterruptedException e) { System.out.pringln("InterruptionError: update thread in Game interrupted");}
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() { //render actors
			public void run() {
				while (!paused) {
					
					render();
					
					try {
                        Thread.sleep(timestepMs);
                    }
                    catch (InterruptedException e) {System.out.pringln("InterruptionError: render thread in Game interrupted");}
				}
			}
		});
	}
	
	public void update(float timestepSec) { //update all actors in Game.actors
		int actorSize = actors.size();
					
		for (int i = 0; i < actorSize; i++) {
			Entity actor = actors.get(i);
			actor.update(timestepSec);
		}
	}
	
	public void render() { //render all actors in Game.actors and render background
		for (int i = 0; i < Game.actors.size(); i++) {
			Game.actors.get(i).draw(canvas);
		}
	}
}