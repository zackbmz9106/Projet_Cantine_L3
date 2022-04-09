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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class reservationRepasController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblMenus;

    @FXML
    private ChoiceBox <String> ChoixMenus;
    private String[] menus = {"Menus viande","Menus poisson", "Menus végétarien"}; 


    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		ChoixMenus.getItems().addAll(menus);
		ChoixMenus.setOnAction(this::getMenus);

	}

	
	public void getMenus(ActionEvent event) {

		String monMenus = ChoixMenus.getValue();
		lblMenus.setText("Vous avez choisis le " + monMenus);

	}

   
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
        assert ChoixMenus != null : "fx:id=\"ChoixMenus\" was not injected: check your FXML file 'Page_reservation_repas.fxml'.";
        assert lblMenus != null : "fx:id=\"lblMenus\" was not injected: check your FXML file 'Page_reservation_repas.fxml'.";

    }

}
