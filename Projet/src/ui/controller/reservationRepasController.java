package ui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class reservationRepasController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void BackReservation(MouseEvent event) throws IOException{

        Parent reservation = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/page_Reservation.fxml"));

        Scene accueilScene = new Scene(reservation);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(accueilScene);
        window.show();
    
    }


    

    @FXML
    void initialize() {

    }

}
