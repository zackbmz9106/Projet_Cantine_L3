package ui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.Date;
import model.Enfant;
import model.Menu;
import javafx.scene.Node;

public class syntheseReservController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Date, String> DateSynthColonne;

    @FXML
    private TableColumn<Enfant, ?> EnfantSynthColonne;

    @FXML
    private TableColumn<Menu, String> MenuSynthColonne;

    @FXML
    private TableView<String> TableSytnthese;

   @FXML
    void BackAccueil(MouseEvent event)throws IOException {
       Parent accueil = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/accueil.fxml"));

        Scene accueilScene = new Scene(accueil);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(accueilScene);
        window.setResizable(false);
        window.show();
    }

    @FXML
    void initialize() {
        assert DateSynthColonne != null : "fx:id=\"DateSynthColonne\" was not injected: check your FXML file 'Page_SyntheseReservation.fxml'.";
        assert EnfantSynthColonne != null : "fx:id=\"EnfantSynthColonne\" was not injected: check your FXML file 'Page_SyntheseReservation.fxml'.";
        assert MenuSynthColonne != null : "fx:id=\"MenuSynthColonne\" was not injected: check your FXML file 'Page_SyntheseReservation.fxml'.";
        assert TableSytnthese != null : "fx:id=\"TableSytnthese\" was not injected: check your FXML file 'Page_SyntheseReservation.fxml'.";

    }

}
