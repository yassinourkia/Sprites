package javaFX;

import gui.Image;

public class FXImage implements Image
{	
	private Image imagefx;
	
	public FXImage(Image imagefx)
	{
		this.imagefx = imagefx;
	}
	public int getWidth() 
	{
		return this.imagefx.getWidth();
		
	};
	
	public int getHeigh()
	{
		return this.imagefx.getHeigh();
	}
	public String getName()
	{
		return this.imagefx.getName();
	}
	
	

}
