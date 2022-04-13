package ui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;

public class FactureController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void retourMenuF(MouseEvent event) throws IOException {
        
        

        
        System.out.println("Retour accueil");
        Parent menu = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/accueil.fxml"));
        
        Scene retour = new Scene(menu);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(retour);
        window.setResizable(false);
        window.show();
    
    } 


    @FXML
    void goFacture(MouseEvent event) throws IOException {

        
        System.out.println("Visualisaiton de la dernière facture");
        Parent menu = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/PopUp_Facture.fxml"));
        
        Scene retour = new Scene(menu);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(retour);
        window.setResizable(false);
        window.show();
    
    } 
    

    @FXML
    void initialize() {

    }
}
