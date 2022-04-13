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

public class popUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

  

    @FXML
    void backFacture(MouseEvent event) throws IOException {
        
        
        System.out.println(" ");
        Parent menu = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/Page_Facture.fxml"));
        
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
