package ui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.Compte;
import model.Facture;
import javafx.scene.Node;

public class FactureController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ChoiceBox<Facture> ChoixFacture;

    @FXML
    private Facture facture = recapRerservationController.getReservation().getFactureReservation();
    private static Compte compte = infoCarteController.getCompte();
    private ArrayList<Facture> factureList = compte.getListFacture();
    private static Facture factureSelect;


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
    void afficherFacture(MouseEvent event) throws IOException {
        
        
        factureSelect = ChoixFacture.getValue(); // enrengistrement de la facture selectionne
        
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
        //ChoixFacture.setValue(menus.get(0));
		ChoixFacture.getItems().addAll(factureList);
		
        //ChoixFacture.setOnAction(this::getMenus);
    }

    public static Facture getFactureSelect(){
        return factureSelect;
    }

    public static Compte getCompte(){
        return compte;
    }
}
