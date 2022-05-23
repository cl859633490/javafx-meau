package menu;

import java.io.IOException;
import java.util.Arrays;

import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;
/**
 * @author Lenovo
 *
 */
public class Launch extends Application{

	/**
	 * @param args
	 */
	private static Label infoLb;
	public static void showInfo(String info) {
		Platform.runLater(()->infoLb.setText(info));
	}
	private void initSystem() {
		try {
			showInfo("初始化目录...");
			Thread.sleep(500);
			showInfo("初始化页面...");
			Thread.sleep(500);
			showInfo("版本检测...");
			Thread.sleep(600);
		}catch(Throwable e) {
			e.printStackTrace();
		}
	}
	public class Home extends Stage{
		public Home() throws IOException {
		
		}
	}
	@Override
	public void start(Stage primaryStage) {
	
			Image image = new Image("image/222.gif");
			ImageView view = new ImageView(image);
			view.setFitWidth(400);
			view.setFitHeight(250);
			infoLb = new Label();
			infoLb.setTextFill(Color.BLACK);
			AnchorPane.setRightAnchor(infoLb, 10.0);
			AnchorPane.setBottomAnchor(infoLb, 10.0);
			AnchorPane page = new AnchorPane();
			page.getChildren().addAll(view,infoLb);
			primaryStage.setTitle("Launching....");
			primaryStage.setScene(new Scene(page));
			primaryStage.setWidth(400);
			primaryStage.setHeight(250);
			primaryStage.initStyle(StageStyle.UNDECORATED);
			
			primaryStage.show();
			new Thread(()->{
				initSystem();//1
				Platform.runLater(()->{//2
					try {
						Home home = new Home();
					
						home.addEventHandler(WindowEvent.WINDOW_SHOWN, event->{
							primaryStage.hide();
						});
						home.show();
					}catch(Throwable e) {
						e.printStackTrace();//3
					}
			});
			}).start();
		}
			
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			launch(args);
	}

}
