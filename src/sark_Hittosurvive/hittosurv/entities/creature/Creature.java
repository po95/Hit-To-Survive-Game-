package sark_Hittosurvive.hittosurv.entities.creature;

import sark_Hittosurvive.hittosurv.entities.Entity;

public abstract class Creature extends Entity{
	
	protected int health;

	public Creature(float x, float y) {
		super(x, y);
		health = 10;
		
	}

}
