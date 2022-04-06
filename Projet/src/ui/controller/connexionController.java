

package ui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class connexionController {

        private Stage stage; 
        private Scene scene ; 
        private Parent root;
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void Inscrire(ActionEvent event) {

    }

    @FXML
    public void seConnecter(ActionEvent event) throws IOException{

        Parent accueilS = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/accueil.fxml"));

        Scene accueilScene = new Scene(accueilS);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(accueilScene);
        window.show();
    
    }

    @FXML
    void initialize() {

    }
}
