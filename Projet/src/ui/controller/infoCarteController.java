package ui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;


public class infoCarteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnValiderInfoCarte;

    @FXML
    private Label lblErreurCarte;

    @FXML
    private Label lblErreurCrypt;

    @FXML
    private Label lblErreurDateExp;

    @FXML
    private TextField tfAdressePaiement;

    @FXML
    private TextField tfCryptPaiement;

    @FXML
    private TextField tfDateExpPaiement;

    @FXML
    private TextField tfNomPaiement;

    @FXML
    private TextField tfNumCartePaiement;

    @FXML
    private TextField tfPrenomPaiement;

    @FXML
    void BackReservationRepas(MouseEvent event) throws IOException{

        Parent carte = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/Page_reservation_repas.fxml"));

        Scene reservation = new Scene(carte);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(reservation);
        window.show();
    
    }

    @FXML
    void VerifInfoCarte(MouseEvent event) throws IOException{

        Parent carte = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/Page_recap_reservation.fxml"));

        Scene recap = new Scene(carte);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(recap);
        window.show();
    
    }



    @FXML
    void initialize() {
        assert btnValiderInfoCarte != null : "fx:id=\"btnValiderInfoCarte\" was not injected: check your FXML file 'Page_Info_Paiement.fxml'.";
        assert lblErreurCarte != null : "fx:id=\"lblErreurCarte\" was not injected: check your FXML file 'Page_Info_Paiement.fxml'.";
        assert lblErreurCrypt != null : "fx:id=\"lblErreurCrypt\" was not injected: check your FXML file 'Page_Info_Paiement.fxml'.";
        assert lblErreurDateExp != null : "fx:id=\"lblErreurDateExp\" was not injected: check your FXML file 'Page_Info_Paiement.fxml'.";
        assert tfAdressePaiement != null : "fx:id=\"tfAdressePaiement\" was not injected: check your FXML file 'Page_Info_Paiement.fxml'.";
        assert tfCryptPaiement != null : "fx:id=\"tfCryptPaiement\" was not injected: check your FXML file 'Page_Info_Paiement.fxml'.";
        assert tfDateExpPaiement != null : "fx:id=\"tfDateExpPaiement\" was not injected: check your FXML file 'Page_Info_Paiement.fxml'.";
        assert tfNomPaiement != null : "fx:id=\"tfNomPaiement\" was not injected: check your FXML file 'Page_Info_Paiement.fxml'.";
        assert tfNumCartePaiement != null : "fx:id=\"tfNumCartePaiement\" was not injected: check your FXML file 'Page_Info_Paiement.fxml'.";
        assert tfPrenomPaiement != null : "fx:id=\"tfPrenomPaiement\" was not injected: check your FXML file 'Page_Info_Paiement.fxml'.";

    }

}
