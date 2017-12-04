package sark_Hittosurvive.hittosurv;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.nio.Buffer;

import sark_Hittosurvive.hittosurv.display.Display;
import sark_Hittosurvive.hittosurv.gfx.ImageLoader;
import sark_Hittosurvive.hittosurv.states.GameState;
import sark_Hittosurvive.hittosurv.states.MenuSate;
import sark_Hittosurvive.hittosurv.states.State;

public class Game implements Runnable{
	
	private Display display;
	
	public int width, height;
	public String title;
	
	private boolean running= false;
	private Thread thread;
	
	private BufferedImage testImage;
	
	private BufferStrategy bs;    
	private Graphics g;
	
	
	//states
	private State gameState;
	private State MenuState;
	
	public Game(String title, int width, int height){
		this.width = width;
		this.height = height;
		this.title = title;
	}
	
	private void init(){
		display = new Display(title, width, height);
		
		
		gameState = new GameState();
		MenuState = new MenuSate();
		State.setState(gameState);
		//testImage = ImageLoader.loadImage("/textures/test.png");
	}
	
	public void tick(){
		
		if(State.getState() != null){
			State.getState().tick();
		}
	}
	
	public void render(){
		 
		bs  = display.getCanvas().getBufferStrategy();
		if(bs == null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		// magical paintbrush
		
		g= bs.getDrawGraphics();
		
		// clear screen  
		
		g.clearRect(0, 0, width, height);
		
		// draw here
		g.setColor(Color.lightGray);
		g.fillRect(-1, -1, 610, 710);
		g.setColor(Color.red);
		g.fillRect(0, -10, 40, 800);
		g.fillRect(560, -10, 40, 800);
		g.setColor(Color.BLACK);
		g.fillRect(40, 650, 520, 60);
		
		
		
		
		
		// end drawing
		
		bs.show();
		g.dispose();
	}
	
	public void run(){
		
		init();
		
		while(running){
			tick();
			render();
		}
		
		stop();
	}
	
	public synchronized void start(){
		if(running){
			return;
		}
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop(){
		if(running){
			return;
		}
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
