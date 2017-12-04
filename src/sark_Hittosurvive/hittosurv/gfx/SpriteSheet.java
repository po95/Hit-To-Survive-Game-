package sark_Hittosurvive.hittosurv.gfx;

import java.awt.image.BufferedImage;

import org.omg.CORBA.PUBLIC_MEMBER;

public class SpriteSheet{
	
	private BufferedImage sheet;
	
	public SpriteSheet(BufferedImage sheet){
		this.sheet = sheet;	
	}
	
	public BufferedImage crop(int x, int y , int width, int height){
		return sheet.getSubimage(x, y, width, height);
	}
	
	
}
