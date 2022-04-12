package ui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
import model.Compte;
import model.Enfant;
import model.Menu;
import model.Moyendepaiement;




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
    private Enfant enfantSelect = reservationRepasController.getEnfantSelect(); // recuperation de l'enfant de la reservation 
    private ArrayList<Menu> MenuSelect = reservationRepasController.getMenuSelect(); // recuperation de la liste des menus selectionne
    private Compte compte = reservationRepasController.getCompte(); // recuperation du compte 

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

        /*if((Math.floor(Math.log10(Long.parseLong(tfCryptPaiement.getText())) + 1) != 3 )&&( Math.floor(Math.log10(Long.parseLong(tfNumCartePaiement.getText())) + 1) != 16 ) ){ 
        }
        else {*/
            Moyendepaiement mp = new Moyendepaiement(compte.getNom(),compte.getPrenom(),compte.getAdresse(),Long.parseLong(tfNumCartePaiement.getText()),tfDateExpPaiement.getText(), Integer.parseInt(tfCryptPaiement.getText()));
            
            if(mp.payerParCarte() == 0){ // si paiement valide

            for(Menu menu : MenuSelect){
                menu.setPrix(compte.calculPrix()); // Determine le prix du menu en fonction du quotient de la famille
                compte.PrendreUneReservation(menu.getDateMenu(), menu, enfantSelect, mp); 
            }
            Parent carte = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/Page_recap_reservation.fxml"));
            Scene recap = new Scene(carte);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(recap);
            window.show(); 
    

            }
            
            else{
                if(mp.payerParCarte()==1){
                    lblErreurCarte.setText("Numéro de carte incorrecte");
                }else{
                    lblErreurCarte.setText("");
                }
                if(mp.payerParCarte()==2){
                    lblErreurDateExp.setText("Date non valide ");
                }
                if(mp.payerParCarte()==3){
                    lblErreurCrypt.setText("Cryptogramme incorrecte");
                }

            }
    
    
    
    }
        


    
    //}



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
