package ui.controller;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class alertbox {

    public static void afficher(String title, String message)
 { 
     Stage window = new Stage();

     window.initModality(Modality.APPLICATION_MODAL);
     
     window.setWidth(250);
     window.setHeight(250);

     Label label = new Label(); 
     label.setText(message);
     Button fermer = new Button ("OK"); 
     fermer.setOnAction(e -> window.close()); 

     VBox layout = new VBox(10); 
     layout.getChildren().addAll(label, fermer);
     layout.setAlignment(Pos.CENTER);

     Scene scene = new Scene(layout);
     window.setScene(scene);
     window.showAndWait();
 }
     public static void afficherRecap(String title, String message)
     { 
         Stage window = new Stage();
    
         window.initModality(Modality.APPLICATION_MODAL);
         
         window.setWidth(750);
         window.setHeight(250);
    
         Label label = new Label(); 
         label.setText(message);
         Button fermer = new Button ("OK"); 
         fermer.setOnAction(e -> window.close()); 
    
         VBox layout = new VBox(10); 
         layout.getChildren().addAll(label, fermer);
         layout.setAlignment(Pos.CENTER);
    
         Scene scene = new Scene(layout);
         window.setScene(scene);
         window.showAndWait();
     } 
 }    

