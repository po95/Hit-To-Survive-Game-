package sark_Hittosurvive.hittosurv.states;

import java.awt.Graphics;

import sark_Hittosurvive.hittosurv.entities.creature.Player;

public class GameState extends State{
	
	private Player player;
	
	
	
    public GameState() {
		player = new Player(100, 100);
	}

	@Override
	public void tick() {
		
		player.tick();
	}

	@Override
	public void render(Graphics g) {
		
		player.render(g);
	}

}
