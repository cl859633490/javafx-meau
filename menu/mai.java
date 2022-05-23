package menu;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class mai extends Application {
  // Declare an array of Strings for flag titles
	 private int s,s1=0;
	  private int a1=0; 
	  private int gg,ff,hj=0;
	  ShowImage a = new ShowImage();
	  private ComboBox<String> cbo = new ComboBox<>();
  private String[] flagTitles = {"÷˜ ≥", "–°≥‘", "“˚¡œ",
    "Ã¿","π´∏Ê"};Pane pane1 =new HBox(10);
  ShowImage a111 = new ShowImage();
  Pane pane1111 =new HBox(10); Pane pane6 = new FlowPane();   
  Pane pane5 = new FlowPane(); Pane pane2 = new FlowPane();
  Pane pan = new FlowPane();  Pane pane = new VBox(1); HBox root = new HBox(pane,pan); VBox root1 = new VBox(pan,pane2,pane5,pane6,pane1111);
  HBox root9 = new HBox(root,root1);
 
  Node[] I = {
		root9,
    a111.pane
    
  };
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) throws Exception{

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
	 
	    Label font1 = new Label("2º∂.∏…π¯ ÷À∫≤À----≤ƒ¡œ£∫¥Û∞◊≤À2∑›\r\n"
	    		+ "3º∂.∞Â¿ı…’≤À–ƒ--≤ƒ¡œ£∫¥Û∞◊≤À1∑›£¨¿ı◊”1∑›\r\n"
	    		+ "4º∂.∂ÁΩ∑≥¥º¶µ∞--≤ƒ¡œ£∫º¶µ∞1∑›£¨¿±Ω∑2∑›\r\n"
	    		+ "5º∂.”Õ’®≥Ù∂π∏Ø----≤ƒ¡œ£∫∂π∏Ø2∑›\r\n"
	    		+ "6º∂.∫˛ƒœ∑€’Ù»‚--≤ƒ¡œ£∫Õ¡∂π1∑›£¨œ ");
	  
	  
	     Text label = new Text("0");
	     Button b=new Button("+"); 	
	     b.setStyle(
		            "-fx-background-color:orange;"+         //…Ë÷√±≥æ∞—’…´
		                    "-fx-background-radius:20;"+     //…Ë÷√±≥æ∞‘≤Ω«
		                    "-fx-text-fill:#4d0092;"+        //…Ë÷√◊÷ÃÂ—’…´
		                    "-fx-border-radius:5;"      //…Ë÷√±ﬂøÚ‘≤Ω«
		                  
		    );
	     b.setOnAction((ActionEvent e) -> { 
	     s++;
	     label.setText(null);
	     label.setText(label.getText() + s);
	   });
	     Button b1=new Button("-");
	     b1.setStyle(
		            "-fx-background-color:orange;"+         //…Ë÷√±≥æ∞—’…´
		                    "-fx-background-radius:20;"+     //…Ë÷√±≥æ∞‘≤Ω«
		                    "-fx-text-fill:#4d0092;"+        //…Ë÷√◊÷ÃÂ—’…´
		                    "-fx-border-radius:5;"      //…Ë÷√±ﬂøÚ‘≤Ω«
		                  
		    );
	    b1.setOnAction((ActionEvent e) -> { 
	    	  if(s>0) s--;
	        label.setText(null);
	        label.setText(label.getText() + s);
	    	});
	  
	     pan.getChildren().addAll(font1,b1,label,b); 
	   
	    
	    
	   
	    Text label1 = new Text("0");
	    Button b3=new Button("+");
	    b3.setOnAction((ActionEvent e) -> { 
	    	  a1++;
	    	     label1.setText(null);
	    	     label1.setText(label1.getText() + a1);
	    	}); Button b31=new Button("-");
	    	 b31.setStyle(
	    	            "-fx-background-color:#FF0030;"+         //…Ë÷√±≥æ∞—’…´
	    	                    "-fx-background-radius:20;"+     //…Ë÷√±≥æ∞‘≤Ω«
	    	                    "-fx-text-fill:#4d0092;"+        //…Ë÷√◊÷ÃÂ—’…´
	    	                    "-fx-border-radius:5;"      //…Ë÷√±ﬂøÚ‘≤Ω«
	    	                  
	    	    );
	    	    b31.setOnMouseEntered(e -> {       
	    	    	
	    	    	if(s1%2==0) 	{ b31.setStyle(
	    	    			  "-fx-background-color:#6b19e6;"+         //…Ë÷√±≥æ∞—’…´
	    	  	                    "-fx-background-radius:20;"+     //…Ë÷√±≥æ∞‘≤Ω«
	    	  	                    "-fx-text-fill:#ff0039;"+        //…Ë÷√◊÷ÃÂ—’…´
	    	  	                    "-fx-border-radius:5;"      //…Ë÷√±ﬂøÚ‘≤Ω«
	    	    	                     );}
	    	    	if(s1%2!=0) {
	    	    		b31.setStyle(
	    	    	            "-fx-background-color:#FF0030;"+         //…Ë÷√±≥æ∞—’…´
	    	    	                    "-fx-background-radius:20;"+     //…Ë÷√±≥æ∞‘≤Ω«
	    	    	                    "-fx-text-fill:#4d0092;"+        //…Ë÷√◊÷ÃÂ—’…´
	    	    	                    "-fx-border-radius:5;"      //…Ë÷√±ﬂøÚ‘≤Ω«
	    	    	                  
	    	    	    );
	    	    	}
	    	    	  s1++;
	    	      });
	    	    b31.setOnAction((ActionEvent e) -> { 
	    	    	
	    	    	  a1++;
	    	    	     label1.setText(null);
	    	    	     label1.setText(label1.getText() + a1);
	    	    	});
	    	    Button b21=new Button("-");
	    	    	  b21.setOnMouseEntered(e -> {       
	    	    	    	
	    	    	    	{ b21.setStyle(
	    	    	    			  "-fx-background-color:#FF0030;"+         //…Ë÷√±≥æ∞—’…´
	    	    	    	                    "-fx-background-radius:20;"+     //…Ë÷√±≥æ∞‘≤Ω«
	    	    	    	                    "-fx-text-fill:#4d0092;"+        //…Ë÷√◊÷ÃÂ—’…´
	    	    	    	                    "-fx-border-radius:5;"      //…Ë÷√±ﬂøÚ‘≤Ω«
	    	    	    	                     );}});
	    	    	pane2.setOnMouseEntered(e -> {   b21.setStyle(
	    	    	            "-fx-background-color:#6b19e6;"+         //…Ë÷√±≥æ∞—’…´
	    	    	                    "-fx-background-radius:20;"+     //…Ë÷√±≥æ∞‘≤Ω«
	    	    	                    "-fx-text-fill:#ff0039;"+        //…Ë÷√◊÷ÃÂ—’…´
	    	    	                    "-fx-border-radius:5;"      //…Ë÷√±ﬂøÚ‘≤Ω«
	    	    	                  
	    	    	    );});
	    b21.setOnAction((ActionEvent e) -> { 
	    	 if(a1>0) a1--;
	         label1.setText(null);
	         label1.setText(label1.getText() + a1);
	    	});
	    
	    Label font21 = new Label("\n\n2º∂.∏…π¯ ÷À∫≤À----≤ƒ¡œ£∫¥Û∞◊≤À2∑›\r\n"
	    		+ "3º∂.∞Â¿ı…’≤À–ƒ--≤ƒ¡œ£∫¥Û∞◊≤À1∑›£¨¿ı◊”1∑›\r\n"
	    		+ "4º∂.∂ÁΩ∑≥¥º¶µ∞--≤ƒ¡œ£∫º¶µ∞1∑›£¨¿±Ω∑2∑›\r\n"
	    		+ "5º∂.”Õ’®≥Ù∂π∏Ø----≤ƒ¡œ£∫∂π∏Ø2∑›\r\n"
	    		+ "6º∂.∫˛ƒœ∑€’Ù»‚--≤ƒ¡œ£∫Õ¡∂π1∑›£¨œ ");
	  
	    pane2.getChildren().addAll(font21,b21,label1,b31); 
	    
	 
	    Text label2 = new Text("0");
	    Button b5=new Button("-");
	    b5.setStyle(
	            "-fx-background-color:orange;"+         //…Ë÷√±≥æ∞—’…´
	                    "-fx-background-radius:20;"+     //…Ë÷√±≥æ∞‘≤Ω«
	                    "-fx-text-fill:#4d0092;"+        //…Ë÷√◊÷ÃÂ—’…´
	                    "-fx-border-radius:5;"      //…Ë÷√±ﬂøÚ‘≤Ω«
	                  
	    );
	    b5.setOnAction((ActionEvent e) -> { 
	    	 if(gg>0) gg--;
	         label2.setText(null);
	         label2.setText(label2.getText() + gg);
	    	});
	    
	    Button b4=new Button("+");
	    b4.setStyle(
	            "-fx-background-color:orange;"+         //…Ë÷√±≥æ∞—’…´
	                    "-fx-background-radius:20;"+     //…Ë÷√±≥æ∞‘≤Ω«
	                    "-fx-text-fill:#4d0092;"+        //…Ë÷√◊÷ÃÂ—’…´
	                    "-fx-border-radius:5;"      //…Ë÷√±ﬂøÚ‘≤Ω«
	                  
	    );
	    b4.setOnAction((ActionEvent e) -> { 
	    	  gg++;
	 	     label2.setText(null);
	 	     label2.setText(label2.getText() + gg);
	    	});
	    
	    Label font211 = new Label("\n\n2º∂.∏…π¯ ÷À∫≤À----≤ƒ¡œ£∫¥Û∞◊≤À2∑›\r\n"
	    		+ "3º∂.∞Â¿ı…’≤À–ƒ--≤ƒ¡œ£∫¥Û∞◊≤À1∑›£¨¿ı◊”1∑›\r\n"
	    		+ "4º∂.∂ÁΩ∑≥¥º¶µ∞--≤ƒ¡œ£∫º¶µ∞1∑›£¨¿±Ω∑2∑›\r\n"
	    		+ "5º∂.”Õ’®≥Ù∂π∏Ø----≤ƒ¡œ£∫∂π∏Ø2∑›\r\n"
	    		+ "6º∂.∫˛ƒœ∑€’Ù»‚--≤ƒ¡œ£∫Õ¡∂π1∑›£¨œ ");
	  
	    pane5.getChildren().addAll(font211,b5,label2,b4); 
	    
	    
	   
	    Text label3 = new Text("0");
	    Button b8=new Button("-");
	    b8.setStyle(
	            "-fx-background-color:orange;"+         //…Ë÷√±≥æ∞—’…´
	                    "-fx-background-radius:20;"+     //…Ë÷√±≥æ∞‘≤Ω«
	                    "-fx-text-fill:#4d0092;"+        //…Ë÷√◊÷ÃÂ—’…´
	                    "-fx-border-radius:5;"      //…Ë÷√±ﬂøÚ‘≤Ω«
	                  
	    );
	    b8.setOnAction((ActionEvent e) -> { 
	    	 if(ff>0) ff--;
	         label3.setText(null);
	         label3.setText(label3.getText() + ff);
	    	});
	    
	    Button b7=new Button("+");
	    b7.setStyle(
	            "-fx-background-color:orange;"+         //…Ë÷√±≥æ∞—’…´
	                    "-fx-background-radius:20;"+     //…Ë÷√±≥æ∞‘≤Ω«
	                    "-fx-text-fill:#4d0092;"+        //…Ë÷√◊÷ÃÂ—’…´
	                    "-fx-border-radius:5;"      //…Ë÷√±ﬂøÚ‘≤Ω«
	                  
	    );
	    b7.setOnAction((ActionEvent e) -> { 
	    	 ff++;
	 	     label3.setText(null);
	 	     label3.setText(label3.getText() + ff);
	    	});
	    
	    Label font2111 = new Label("\n\n2º∂.∏…π¯ ÷À∫≤À----≤ƒ¡œ£∫¥Û∞◊≤À2∑›\r\n"
	    		+ "3º∂.∞Â¿ı…’≤À–ƒ--≤ƒ¡œ£∫¥Û∞◊≤À1∑›£¨¿ı◊”1∑›\r\n"
	    		+ "4º∂.∂ÁΩ∑≥¥º¶µ∞--≤ƒ¡œ£∫º¶µ∞1∑›£¨¿±Ω∑2∑›\r\n"
	    		+ "5º∂.”Õ’®≥Ù∂π∏Ø----≤ƒ¡œ£∫∂π∏Ø2∑›\r\n"
	    		+ "6º∂.∫˛ƒœ∑€’Ù»‚--≤ƒ¡œ£∫Õ¡∂π1∑›£¨œ ");
	  
	    pane6.getChildren().addAll(font2111,b8,label3,b7);

	    Button a=new Button("∫œº∆"); 
	    a.setStyle(
	            "-fx-background-color:yellow;"+         //…Ë÷√±≥æ∞—’…´
	                    "-fx-background-radius:20;"+     //…Ë÷√±≥æ∞‘≤Ω«
	                    "-fx-text-fill:#4d0092;"+        //…Ë÷√◊÷ÃÂ—’…´
	                    "-fx-border-radius:5;"      //…Ë÷√±ﬂøÚ‘≤Ω«
	                  
	    );
	    a.setOnAction((ActionEvent e) -> { 
	    	hj=s*85+gg*34+ff*23+a1*12;
	    	pane1.setPadding(new Insets(1, 1, 1, 2));
	        Label fonnn = new Label("“—µ„");
	        fonnn.setFont(Font.font("Times New Roman",
	          		 FontWeight.BOLD, FontPosture.ITALIC, 40));
	        Label fon = new Label("\n  “ªπ≤: "+hj+" $          ");
	        fon.setFont(Font.font("Times New Roman",
	       		 FontWeight.BOLD, FontPosture.ITALIC, 75));
	        ImageView image3 = new ImageView("image/666.jpg");
	        image3.setFitHeight(300);
	        image3.setFitWidth(300);
	        pane1.getChildren().addAll(image3,fonnn,fon); 
	        	 Scene scene = new Scene(pane1);
	        	    primaryStage.setTitle("÷ß∏∂ΩÁ√Ê"); // Set the stage title
	        	    primaryStage.setScene(scene);
	        	primaryStage.show();
	    });
	  
	    Label font21111 = new Label("2º∂.∏…π¯ ÷À∫≤À----≤ƒ¡œ£∫¥Û∞◊≤À2∑›                 \r\n\n"
	    		);
	    pane1111.getChildren().addAll(font21111,a);
	    Button bbb=new Button("                                                                               “—æ≠µ„¡À     " +hj+"                                                                 »•Ω·À„           ");
	    bbb.setStyle(
	            "-fx-background-color:yellow;"+         //…Ë÷√±≥æ∞—’…´
	                    "-fx-background-radius:20;"+     //…Ë÷√±≥æ∞‘≤Ω«
	                    "-fx-text-fill:#4d0092;"+        //…Ë÷√◊÷ÃÂ—’…´
	                    "-fx-border-radius:5;"      //…Ë÷√±ﬂøÚ‘≤Ω«
	                  
	    );
	    bbb.setOnAction((ActionEvent e) -> { 
	    	hj=s*85+gg*34+ff*23+a1*12;
	    	pane1.setPadding(new Insets(1, 1, 1, 2));
	        Label fonnn = new Label("“—µ„");
	        fonnn.setFont(Font.font("Times New Roman",
	          		 FontWeight.BOLD, FontPosture.ITALIC, 40));
	        Label fon = new Label("\n  “ªπ≤: "+hj+" $          ");
	        fon.setFont(Font.font("Times New Roman",
	       		 FontWeight.BOLD, FontPosture.ITALIC, 75));
	        ImageView image3 = new ImageView("image/666.jpg");
	        image3.setFitHeight(300);
	        image3.setFitWidth(300);
	        pane1.getChildren().addAll(image3,fonnn,fon); 
	        	 Scene scene = new Scene(pane1);
	        	    primaryStage.setTitle("÷ß∏∂ΩÁ√Ê"); // Set the stage title
	        	    primaryStage.setScene(scene);
	        	primaryStage.show();
    	});

    ListView<String> lv = new ListView<>
      (FXCollections.observableArrayList(flagTitles));
    lv.setPrefSize(200, 200);
    lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    Pane im = new Pane();
    im.setPadding(new Insets(10, 100, 10, 10));
    BorderPane panep = new BorderPane();
    panep.setPadding(new Insets(10, 100, 10, 10));
    panep.setLeft(new ScrollPane(lv));   
    panep.setBottom(bbb);
    panep.setCenter(new ScrollPane(im));
   
    lv.getSelectionModel().selectedItemProperty().addListener(
      ov -> {  
        im.getChildren().clear();
        
        for (Integer i: lv.getSelectionModel().getSelectedIndices()) {
          im.getChildren().addAll(I[i]);
        }
    });

    // Create a scene and place it in the stage
    Scene scene = new Scene(panep, 850, 170);
    primaryStage.setTitle("ListViewDemo");
    primaryStage.setWidth(800);
	primaryStage.setHeight(600);
	
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}

