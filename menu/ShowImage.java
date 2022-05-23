package menu;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ShowImage extends Application {
  public class start {

	}
  public int s,s1=0;
  private int a1=0;
  public int gg,ff,hj=0;
 public ComboBox<String> cbo = new ComboBox<>();
  public Pane pane = new VBox(10);
  private String[] flagTitles = {"Ö÷Ê³", "Ð¡³Ô", "ÒûÁÏ",
		    "ÌÀ","¹«¸æ"};
    Pane pan = new FlowPane();  Label f = new Label("¸É¹øÊÖËº²Ë");
  VBox rr=new VBox(f,pan);
  HBox root = new HBox(pane,pan);
  public  void start(Stage primaryStage) throws Exception{
	
  
    pane.setPadding(new Insets(5, 5, 2.5, 2.5));
    ImageView image = new ImageView("image/3.jpg");
    image.setFitHeight(100);
    image.setFitWidth(100);
    pane.getChildren().add(image);
    Image e1=new Image("image/3.jpg");
   
    primaryStage.getIcons().add(e1);
    ImageView imageView2 = new ImageView("image/2.jpg");
    imageView2.setFitHeight(100);
    imageView2.setFitWidth(100);
    pane.getChildren().add(imageView2);   

    ImageView imageView3 = new ImageView("image/4.jpg");
    imageView3.setFitHeight(100);
    imageView3.setFitWidth(100);
    pane.getChildren().add(imageView3);     
    ImageView imageView4 = new ImageView("image/5.jpg");
    imageView4.setFitHeight(100);
    imageView4.setFitWidth(100);
    pane.getChildren().add(imageView4);  
 
    Label font1 = new Label("2¼¶.¸É¹øÊÖËº²Ë----²ÄÁÏ£º´ó°×²Ë2·Ý\r\n"
    		+ "3¼¶.°åÀõÉÕ²ËÐÄ--²ÄÁÏ£º´ó°×²Ë1·Ý£¬Àõ×Ó1·Ý\r\n"
    		+ "4¼¶.¶ç½·³´¼¦µ°--²ÄÁÏ£º¼¦µ°1·Ý£¬À±½·2·Ý\r\n"
    		+ "5¼¶.ÓÍÕ¨³ô¶¹¸¯----²ÄÁÏ£º¶¹¸¯2·Ý\r\n"
    		+ "6¼¶.ºþÄÏ·ÛÕôÈâ--²ÄÁÏ£ºÍÁ¶¹1·Ý£¬ÏÊ");
    Font font = Font.font("Times New Roman", FontWeight.BOLD, 
     FontPosture.ITALIC, 12);
  
     Text label = new Text("0");
     Button b=new Button("+"); 	
     b.setOnAction((ActionEvent e) -> { 
     s++;
     label.setText(null);
     label.setText(label.getText() + s);
   });
     Button b1=new Button("-");
    b1.setOnAction((ActionEvent e) -> { 
    	  if(s>0) s--;
        label.setText(null);
        label.setText(label.getText() + s);
    	});
  
     pan.getChildren().addAll(font1,b1,label,b); 
     Pane p=new Pane(); 
   
  p.getChildren().add(f);
 
    
    
    Pane pane2 = new FlowPane();
    Text label1 = new Text("0");
    ImageView image11= new ImageView("image/3.jpg");
    image11.setFitHeight(10);
    image11.setFitWidth(10);
    Button b3=new Button("+",image11);
  b3.setStyle(
            "-fx-background-color:#FF0030;"+         //ÉèÖÃ±³¾°ÑÕÉ«
                    "-fx-background-radius:20;"+     //ÉèÖÃ±³¾°Ô²½Ç
                    "-fx-text-fill:#4d0092;"+        //ÉèÖÃ×ÖÌåÑÕÉ«
                    "-fx-border-radius:5;"      //ÉèÖÃ±ß¿òÔ²½Ç
                  
    );
    b3.setOnMouseEntered(e -> {       
    	
    	if(s1%2==0) 	{ b3.setStyle(
    			  "-fx-background-color:#6b19e6;"+         //ÉèÖÃ±³¾°ÑÕÉ«
  	                    "-fx-background-radius:20;"+     //ÉèÖÃ±³¾°Ô²½Ç
  	                    "-fx-text-fill:#ff0039;"+        //ÉèÖÃ×ÖÌåÑÕÉ«
  	                    "-fx-border-radius:5;"      //ÉèÖÃ±ß¿òÔ²½Ç
    	                     );}
    	if(s1%2!=0) {
    		b3.setStyle(
    	            "-fx-background-color:#FF0030;"+         //ÉèÖÃ±³¾°ÑÕÉ«
    	                    "-fx-background-radius:20;"+     //ÉèÖÃ±³¾°Ô²½Ç
    	                    "-fx-text-fill:#4d0092;"+        //ÉèÖÃ×ÖÌåÑÕÉ«
    	                    "-fx-border-radius:5;"      //ÉèÖÃ±ß¿òÔ²½Ç
    	                  
    	    );
    	}
    	  s1++;
      });
    b3.setOnAction((ActionEvent e) -> { 
    	
    	  a1++;
    	     label1.setText(null);
    	     label1.setText(label1.getText() + a1);
    	});
    Button b2=new Button("-");
    	  b2.setOnMouseEntered(e -> {       
    	    	
    	    	{ b2.setStyle(
    	    			  "-fx-background-color:#FF0030;"+         //ÉèÖÃ±³¾°ÑÕÉ«
    	    	                    "-fx-background-radius:20;"+     //ÉèÖÃ±³¾°Ô²½Ç
    	    	                    "-fx-text-fill:#4d0092;"+        //ÉèÖÃ×ÖÌåÑÕÉ«
    	    	                    "-fx-border-radius:5;"      //ÉèÖÃ±ß¿òÔ²½Ç
    	    	                     );}});
    	pane2.setOnMouseEntered(e -> {   b2.setStyle(
    	            "-fx-background-color:#6b19e6;"+         //ÉèÖÃ±³¾°ÑÕÉ«
    	                    "-fx-background-radius:20;"+     //ÉèÖÃ±³¾°Ô²½Ç
    	                    "-fx-text-fill:#ff0039;"+        //ÉèÖÃ×ÖÌåÑÕÉ«
    	                    "-fx-border-radius:5;"      //ÉèÖÃ±ß¿òÔ²½Ç
    	                  
    	    );});
    b2.setOnAction((ActionEvent e) -> { 
    	 if(a1>0) a1--;
         label1.setText(null);
         label1.setText(label1.getText() + a1);
    	});
    
    Label font21 = new Label("\n\n2¼¶.¸É¹øÊÖËº²Ë----²ÄÁÏ£º´ó°×²Ë2·Ý\r\n"
    		+ "3¼¶.°åÀõÉÕ²ËÐÄ--²ÄÁÏ£º´ó°×²Ë1·Ý£¬Àõ×Ó1·Ý\r\n"
    		+ "4¼¶.¶ç½·³´¼¦µ°--²ÄÁÏ£º¼¦µ°1·Ý£¬À±½·2·Ý\r\n"
    		+ "5¼¶.ÓÍÕ¨³ô¶¹¸¯----²ÄÁÏ£º¶¹¸¯2·Ý\r\n"
    		+ "6¼¶.ºþÄÏ·ÛÕôÈâ--²ÄÁÏ£ºÍÁ¶¹1·Ý£¬ÏÊ");
   
    pane2.getChildren().addAll(font21,b2,label1,b3); 
    
    
    Pane pane5 = new FlowPane();
    Text label2 = new Text("0");
    Button b5=new Button("-");
    b5.setOnAction((ActionEvent e) -> { 
    	 if(gg>0) gg--;
         label2.setText(null);
         label2.setText(label2.getText() + gg);
    	});
    
    Button b4=new Button("+");
    b4.setOnAction((ActionEvent e) -> { 
    	  gg++;
 	     label2.setText(null);
 	     label2.setText(label2.getText() + gg);
    	});
    
    Label font211 = new Label("\n\n2¼¶.¸É¹øÊÖËº²Ë----²ÄÁÏ£º´ó°×²Ë2·Ý\r\n"
    		+ "3¼¶.°åÀõÉÕ²ËÐÄ--²ÄÁÏ£º´ó°×²Ë1·Ý£¬Àõ×Ó1·Ý\r\n"
    		+ "4¼¶.¶ç½·³´¼¦µ°--²ÄÁÏ£º¼¦µ°1·Ý£¬À±½·2·Ý\r\n"
    		+ "5¼¶.ÓÍÕ¨³ô¶¹¸¯----²ÄÁÏ£º¶¹¸¯2·Ý\r\n"
    		+ "6¼¶.ºþÄÏ·ÛÕôÈâ--²ÄÁÏ£ºÍÁ¶¹1·Ý£¬ÏÊ");
  
    pane5.getChildren().addAll(font211,b5,label2,b4); 
    
    
    Pane pane6 = new FlowPane();
    Text label3 = new Text("0");
    Button b8=new Button("-");
    b8.setOnAction((ActionEvent e) -> { 
    	 if(ff>0) ff--;
         label3.setText(null);
         label3.setText(label3.getText() + ff);
    	});
    
    Button b7=new Button("+");
    b7.setOnAction((ActionEvent e) -> { 
    	 ff++;
 	     label3.setText(null);
 	     label3.setText(label3.getText() + ff);
    	});
   
    Label font2111 = new Label("\n2¼¶.¸É¹øÊÖËº²Ë----²ÄÁÏ£º´ó°×²Ë2·Ý\r\n"
    		+ "3¼¶.°åÀõÉÕ²ËÐÄ--²ÄÁÏ£º´ó°×²Ë1·Ý£¬Àõ×Ó1·Ý\r\n"
    		+ "4¼¶.¶ç½·³´¼¦µ°--²ÄÁÏ£º¼¦µ°1·Ý£¬À±½·2·Ý\r\n"
    		+ "5¼¶.ÓÍÕ¨³ô¶¹¸¯----²ÄÁÏ£º¶¹¸¯2·Ý\r\n"
    		+ "6¼¶.ºþÄÏ·ÛÕôÈâ--²ÄÁÏ£ºÍÁ¶¹1·Ý£¬ÏÊ");
  
    pane6.getChildren().addAll(font2111,b8,label3,b7);

    Button a=new Button("ºÏ¼Æ"); 
    a.setOnAction((ActionEvent e) -> { 
    	hj=s*85+gg*34+ff*23+a1*12;
    	Pane pane1 =new HBox(10);
        pane1.setPadding(new Insets(1, 1, 1, 1));
        Label fonnn = new Label("ÒÑµã");
        fonnn.setFont(Font.font("Times New Roman",
          		 FontWeight.BOLD, FontPosture.ITALIC, 40));
        Label fon = new Label("\n    Ò»¹²: "+hj+" $      ");
        fon.setFont(Font.font("Times New Roman",
       		 FontWeight.BOLD, FontPosture.ITALIC, 75));
        ImageView image3 = new ImageView("image/666.jpg");
        image3.setFitHeight(300);
        image3.setFitWidth(300);
        pane1.getChildren().addAll(image3,fonnn,fon); 
        	 Scene scene = new Scene(pane1);
        	    primaryStage.setTitle("Ö§¸¶½çÃæ"); // Set the stage title
        	    primaryStage.setScene(scene);
        	primaryStage.show();
        	
    });
    Pane pane1111 =new HBox(10);
    Label font21111 = new Label("\t\t\t\t\t\t\t                 \r\n\n"
    		);
    pane1111.getChildren().addAll(font21111,a);
    
    Pane root1 = new VBox(rr,pane2,pane5,pane6,pane1111);
    
     Pane pane0 = new Pane();
     Text text = new Text("JavaFX Programming");
     
     ScrollBar sbHorizontal = new ScrollBar();
     ScrollBar sbVertical = new ScrollBar();
     sbVertical.setOrientation(Orientation.VERTICAL);
     
     // Create a text in a pane
     Pane paneForText = new Pane();
     paneForText.getChildren().add(text);
     
     // Create a border pane to hold text and scroll bars
     BorderPane pane22 = new BorderPane();
     pane22.setCenter(root1);
     pane22.setBottom(sbHorizontal);
     pane22.setRight(sbVertical);

     // Listener for horizontal scroll bar value change
     sbHorizontal.valueProperty().addListener(ov -> 
       text.setX(sbHorizontal.getValue() * paneForText.getWidth() /
         sbHorizontal.getMax()));
     
     // Listener for vertical scroll bar value change
     sbVertical.valueProperty().addListener(ov -> 
       text.setY(sbVertical.getValue() * paneForText.getHeight() /
         sbVertical.getMax()));
     
  
  
     pane0.getChildren().addAll(paneForText,sbVertical,sbHorizontal);
     ListView<String> lv = new ListView<>   (FXCollections.observableArrayList(flagTitles));
   lv.setPrefSize(200, 200);
    Pane root9 = new HBox(root,root1);
    root9.setPadding(new Insets(100,100,100,100));
    BorderPane paneee = new BorderPane();
    paneee.setLeft(new ScrollPane(root9));   

	paneee.setAlignment(root9, Pos.CENTER);
      
    Scene scene = new Scene(new ScrollPane(root9));
    primaryStage.setTitle("order"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
 primaryStage.show(); 
  }
  public static void main(String[] args) throws Exception{
    launch(args);
  }
}
