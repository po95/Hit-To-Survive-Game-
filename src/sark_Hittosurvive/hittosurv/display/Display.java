package sark_Hittosurvive.hittosurv.display;

import java.awt.Canvas;
import java.awt.Dimension;
import java.io.ObjectInputStream.GetField;

import javax.swing.JFrame;

public class Display {
	
	private JFrame frame;
	private Canvas canvas;
	
	private int width, height;
	private String title;
	
	public Display(String title, int width, int height){
		this.title = title;
		this.width = width;
		this.height = height;
		
		createDisplay();
	}
	
	private void createDisplay(){
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		// canvas
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setPreferredSize(new Dimension(width, height));
		
		frame.add(canvas);
		frame.pack();
		
		
	}
	
	public Canvas getCanvas(){
		return canvas;
	}

}
