package javaFX;

import gui.Graphic;
import gui.Image;
import javafx.scene.image.ImageView;

public class FXGraphic implements Graphic{

	public Image image ;
	
	public FXGraphic(Image image) {
		// TODO Auto-generated constructor stub
		this.image = image;
	}
	
	@Override
	public ImageView DisplayImage() {
		
		return null;
		
	}
	

}
