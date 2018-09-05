package common;

public class FXImage implements ImageLoader
{	
	private ImageLoader imagefx;
	
	public FXImage(ImageLoader imagefx)
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
