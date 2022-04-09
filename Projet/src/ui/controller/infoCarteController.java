package ui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

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
    void VerifInfoCarte(MouseEvent event) {

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
