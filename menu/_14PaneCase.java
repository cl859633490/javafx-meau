package menu;

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class _14PaneCase extends Application{
	 ShowImage a111 = new ShowImage();
	 main eee =new main();
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Scene scene = new Scene(a111.pane);
		primaryStage.setTitle("ShowPaneCase");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}


