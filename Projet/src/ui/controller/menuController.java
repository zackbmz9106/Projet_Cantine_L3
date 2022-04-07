package ui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;

public class menuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void backAccueil(MouseEvent event)throws IOException {
        
        

        
        System.out.println("Retour Accueil");
        Parent menu = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/accueil.fxml"));
        
        Scene retour = new Scene(menu);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(retour);
        window.show();
    
    } 

    @FXML
    void initialize() {

    }
}