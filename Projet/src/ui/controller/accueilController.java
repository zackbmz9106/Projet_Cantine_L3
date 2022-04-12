package ui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent; 
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;

public class accueilController {

    private Stage stage; 
    private Scene reserve ; 
    private Parent reservation;
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    public void handleButtonAction(MouseEvent event) {
        System.out.println("You clicked me!");
    }


    @FXML
    public void reserver(MouseEvent event) throws IOException {
        
        
        System.out.println("ESS");
        Parent reservation = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/page_Reservation.fxml"));
        
        Scene reserve = new Scene(reservation);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(reserve);
        window.show();
    
    } 

    @FXML
    void voirFacture(MouseEvent event) throws IOException {


        Parent Facture = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/Page_Facture.fxml"));

        Scene FactureScene = new Scene(Facture);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(FactureScene);
        window.show();
    }

    @FXML
    void goMenu(MouseEvent event) throws IOException {

        

        Parent goMenu = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/Page_menus.fxml"));

        Scene Menu = new Scene(goMenu);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(Menu);
        window.show();
    }

    @FXML
    public void initialize() {

    }

}
