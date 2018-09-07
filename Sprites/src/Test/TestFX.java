package Test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TestFX extends Application{

	@Override
	public void start(Stage pS) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new HBox(15);
		pane.getChildren().add(new ImageView(TestFX.getImage()));
		Scene scene = new Scene(pane,300,300);
		
		pS.setTitle("Sprites");
		pS.setScene(scene);
		pS.show();
		System.out.print("d,fnf,");
	}
	public static void main(String[] args) {
		launch(args);
	}
	public static Image getImage()
	{
		String URL = "http://www-ensibs.univ-ubs.fr/skins/ENSIBS/resources/img/logo.png";
		return new javafx.scene.image.Image(URL);
	}

}
