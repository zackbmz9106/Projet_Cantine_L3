package ui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.Compte;
import model.Facture;
import model.Reservation;
import javafx.scene.Node;

public class popUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblNumFacture;
    
    @FXML
    private Label lblMontant; 

    @FXML
    private Label lblDate;

    @FXML
    private Label lblNom;

    @FXML
    private Label lblPrenom;

    @FXML
    private Facture factureSelect = FactureController.getFactureSelect(); 
    private Reservation reservation = infoCarteController.getReservation();
    private Compte compte = FactureController.getCompte();

    @FXML
    void backFacture(MouseEvent event) throws IOException {
        
        

        
        System.out.println(" ");
        Parent menu = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/Page_Facture.fxml"));
        
        Scene retour = new Scene(menu);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(retour);
        window.show();
    
    } 

    @FXML
    void initialize() {
        lblNumFacture.setText(""+factureSelect);
        lblDate.setText(""+factureSelect.getDateF());
        lblMontant.setText(factureSelect.getMontant()+"");
        lblNom.setText(compte.getNom());
        lblPrenom.setText(compte.getPrenom());

    }
}
