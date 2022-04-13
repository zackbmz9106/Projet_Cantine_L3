package ui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class reservationController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label Label_Nbr_Reservation;

    @FXML
    void GoReservationRepas(MouseEvent event)  throws IOException{

        Parent accueilS = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/Page_reservation_repas.fxml"));

        Scene accueilScene = new Scene(accueilS);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(accueilScene);
        window.setResizable(false);
        window.show();
    
    }
    

    @FXML
    void retourMenu(MouseEvent event) throws IOException {

            System.out.println("Retour accueil");
            Parent menu = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/Accueil.fxml"));

            Scene retour = new Scene(menu);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(retour);
            window.setResizable(false);
            window.show();

        }

    @FXML
    void initialize() {
        assert Label_Nbr_Reservation != null : "fx:id=\"Label_Nbr_Reservation\" was not injected: check your FXML file 'page_Reservation.fxml'.";

    }

}
