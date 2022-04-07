package ui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

public class accueilController {

   /* private Stage stage; 
    private Scene scene ; 
    private Parent root;*/

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void Facture(ActionEvent event) throws IOException{

       /* Parent Facture = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/Page_Facture.fxml"));

        Scene FactureScene = new Scene(Facture);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(FactureScene);
        window.show();*/
    }

    @FXML
    void initialize() {

    }

}
