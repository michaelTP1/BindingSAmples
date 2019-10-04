package dad.javafx.bindings.area;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StageAreaApp extends Application{
	
	private TextField widthText, heightText, areaText;

	@Override
	public void start(Stage primaryStage) throws Exception {

		widthText=new TextField();
		widthText.setEditable(false);
		widthText.setMaxWidth(150);
		
		heightText=new TextField();
		heightText.setEditable(false);
		heightText.setMaxWidth(150);
		
		areaText=new TextField();
		areaText.setEditable(false);
		areaText.setMaxWidth(150);
		
		
		
		widthText.textProperty().bind(Bindings.concat("Ancho: ", primaryStage.widthProperty(),"p"));
		heightText.textProperty().bind(Bindings.concat("Alto: ", primaryStage.heightProperty(), "p"));
		
		areaText.textProperty().bind(Bindings.concat("Area: ", Bindings.multiply(primaryStage.widthProperty(), primaryStage.heightProperty()), " p^2"));
	
		VBox root=new VBox(5, widthText, heightText, areaText);
		root.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(root, 320, 200);
		
		primaryStage.setTitle("StageArea");
		primaryStage.setScene(scene);
		primaryStage.show();
	
	
	
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

}
