package ui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;

public class parametreController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField tfModifAdresse;

    @FXML
    private TextField tfModifMail;

    @FXML
    private TextField tfModifMdp;

    @FXML
    private TextField tfModifTel;

    @FXML
    private TextField tfModifQuotient;

    @FXML
    void Valider(MouseEvent event) {


        

    }

    
    @FXML
    void BackAccueil(MouseEvent event) throws IOException {

        Parent Back = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/accueil.fxml"));

        Scene Para = new Scene(Back);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(Para);
        window.setResizable(false);
        window.show();
    }

    @FXML
    void initialize() {
        assert tfModifAdresse != null : "fx:id=\"tfModifAdresse\" was not injected: check your FXML file 'Page_parametre.fxml'.";
        assert tfModifMail != null : "fx:id=\"tfModifMail\" was not injected: check your FXML file 'Page_parametre.fxml'.";
        assert tfModifMdp != null : "fx:id=\"tfModifMdp\" was not injected: check your FXML file 'Page_parametre.fxml'.";
        assert tfModifTel != null : "fx:id=\"tfModifTel\" was not injected: check your FXML file 'Page_parametre.fxml'.";

    }

}
