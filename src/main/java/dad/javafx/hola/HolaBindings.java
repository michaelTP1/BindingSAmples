package dad.javafx.hola;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HolaBindings extends Application{

	private Label saludoLabel;
	private TextField nombreText;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		saludoLabel=new Label("-");
		
		nombreText=new TextField();
		nombreText.setPromptText("introduce ti nombre");
		nombreText.setMaxWidth(150);
		
		VBox root=new VBox(5, nombreText, saludoLabel);
		root.setAlignment(Pos.CENTER);
		root.setFillWidth(false);
		
		
		
		//establezco los bindeos
		
		
		
		saludoLabel.textProperty().bind(
				Bindings
					.when(nombreText.textProperty().isEmpty())
					.then("No hay nadie a quien saludar")
					.otherwise(Bindings.concat("¡Hola ", nombreText.textProperty(), "!"))
				
				);
		

		
		
		
		
		Scene scene = new Scene(root, 320, 200);
		primaryStage.setTitle("HolaBindings");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

}
