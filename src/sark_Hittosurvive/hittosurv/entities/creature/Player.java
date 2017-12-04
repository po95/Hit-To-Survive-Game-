package sark_Hittosurvive.hittosurv.entities.creature;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends Creature{

	public Player(float x, float y) {
		super(x, y);
		
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.cyan);
		g.fillOval(285, 600, 50, 50);
		
	}

}
