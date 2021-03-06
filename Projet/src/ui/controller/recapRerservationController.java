package ui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Enfant;
import model.Reservation;

public class recapRerservationController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnPaiementRecap;

    @FXML
    private Label lblDateRecap;

    @FXML
    private Label lblEnfantRecap;

    @FXML
    private Label lblMenusRecap;

    @FXML
    private Label lblPrixRecap;

    @FXML
    private Label lblnumR;

    @FXML
    private Enfant enfant = infoCarteController.getEnfant();
    private static Reservation reservation = infoCarteController.getReservation();

    
    @FXML
    void BackInfoPaiement(MouseEvent event) throws IOException{

        Parent recap = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/Page_Info_Paiement.fxml"));

        Scene paiement = new Scene(recap);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(paiement);
        window.setResizable(false);
        window.show();
    
    }

    @FXML
    void Paiement(MouseEvent event) throws IOException {

        alertbox.afficherRecap("Confirmation", " Votre reservation N° "+ reservation.getnumReservation() + " a bien été prise en compte !");

        Parent recap = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/accueil.fxml"));

        Scene paiement = new Scene(recap);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(paiement);
        window.setResizable(false);
        window.show();

    }

    @FXML
    void initialize() {
        
        lblEnfantRecap.setText(enfant.getNom()+" "+enfant.getPrenom());
        lblDateRecap.setText(reservation.getDateReservation().getDateString());
        lblMenusRecap.setText(reservation.getNomMenus().toString());
        lblPrixRecap.setText((""+reservation.getPrixReservation())+" Euros");
        lblnumR.setText(reservation.getnumReservation()+"");
        
        
        assert btnPaiementRecap != null : "fx:id=\"btnPaiementRecap\" was not injected: check your FXML file 'Page_recap_reservation.fxml'.";
        assert lblDateRecap != null : "fx:id=\"lblDateRecap\" was not injected: check your FXML file 'Page_recap_reservation.fxml'.";
        assert lblEnfantRecap != null : "fx:id=\"lblEnfantRecap\" was not injected: check your FXML file 'Page_recap_reservation.fxml'.";
        assert lblMenusRecap != null : "fx:id=\"lblMenusRecap\" was not injected: check your FXML file 'Page_recap_reservation.fxml'.";
        assert lblPrixRecap != null : "fx:id=\"lblPrixRecap\" was not injected: check your FXML file 'Page_recap_reservation.fxml'.";

    }

    public static Reservation getReservation(){
        return reservation;
    }


}
