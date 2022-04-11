package ui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.DisplayCalendar;

public class reservationRepasController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblMenus;

    @FXML
    private Button removeDate;

    @FXML
    private TableView<String> tableDate;

    @FXML
    private TableColumn<DisplayCalendar, String> dateColonne;

    @FXML
    private Button addDate;

    @FXML
    private DatePicker dpDate;
/*
    @FXML
    private ChoiceBox <String> ChoixEnfant;
    private String[] enfants = {"test1", "test2", "test3"};
*/
    @FXML
    private ChoiceBox <String> ChoixMenus;
    private String[] menus = {"Menus viande","Menus poisson", "Menus végétarien"}; 


    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
        //dateColonne.setCellValueFactory(new PropertyValueFactory<DisplayCalendar, String>("date"));

        ChoixMenus.setValue("Sélectionner le menus");
		ChoixMenus.getItems().addAll(menus);
		ChoixMenus.setOnAction(this::getMenus);
    
        /*
        ChoixEnfant.setValue("Sélectionner l'enfant");
		ChoixEnfant.getItems().addAll(enfants);
        */


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
    void GoInfoPaiement(MouseEvent event) throws IOException{

        Parent reserv = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/Page_Info_Paiement.fxml"));

        Scene paiement = new Scene(reserv);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(paiement);
        window.show();
    
    }

    @FXML
    void ajoutDate(MouseEvent event) {
        /*
        DisplayCalendar date = new DisplayCalendar(dpDate.getValue());
        ObservableList<DisplayCalendar> dates = tableDate.getItems();
        dates.add(date);
        */
    }

    @FXML
    void supprDate(MouseEvent event) {
        /*
        int selectedID = tableDate.getSelectionModel().getSelectedIndex();
        tableDate.getItems().remove(selectedID);
        */
    }


    @FXML
    void initialize() {
       // assert ChoixEnfant != null : "fx:id=\"ChoixEnfant\" was not injected: check your FXML file 'Page_reservation_repas.fxml'.";
        assert ChoixMenus != null : "fx:id=\"ChoixMenus\" was not injected: check your FXML file 'Page_reservation_repas.fxml'.";
        assert lblMenus != null : "fx:id=\"lblMenus\" was not injected: check your FXML file 'Page_reservation_repas.fxml'.";

    }

}
