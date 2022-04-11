package ui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.fxml.Initializable;
import model.Enfant;
import javafx.scene.Node;

public class informationEnfantController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ToggleGroup gsexe;

    @FXML
    private TableView<Enfant> tableInfo;

    @FXML
    private TableColumn<Enfant, String> nomColonne;

    @FXML
    private TableColumn<Enfant, String> prenomColonne;

    @FXML
    private TableColumn<Enfant, String> sexeColonne;

    @FXML
    private RadioButton rbFilleInfo;

    @FXML
    private RadioButton rbGarconInfo;

    @FXML
    private TextField tfNomInfo;

    @FXML
    private TextField tfPrenomInfo;

    @FXML
    private TextField tfQuotient;

    @FXML
    private String sexe;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nomColonne.setCellValueFactory(new PropertyValueFactory<Enfant, String>("nom"));
        prenomColonne.setCellValueFactory(new PropertyValueFactory<Enfant, String>("prenom"));
        sexeColonne.setCellValueFactory(new PropertyValueFactory<Enfant, String>("sexe"));
        
    }

    
    public String getSexe() {
  
        if(rbGarconInfo.isSelected()) {
            rbFilleInfo.setSelected(false); 
            //sexe = rbGarconInfo.getText();
            return rbGarconInfo.getText();

        
        }

        else if(rbFilleInfo.isSelected()) {
            rbGarconInfo.setSelected(false);
            //sexe = rbFilleInfo.getText();
            return rbFilleInfo.getText();
        }

        return null;
        
       }


    @FXML
    void AjouterEnfant(MouseEvent event) {
        Enfant enfant = new Enfant(tfNomInfo.getText(),(tfPrenomInfo.getText()), getSexe());
        ObservableList<Enfant> enfants = tableInfo.getItems();
        enfants.add(enfant);
        tableInfo.setItems(enfants);
        tfNomInfo.setText("");
        tfPrenomInfo.setText("");
    }

    @FXML
    void RetirerEnfant(MouseEvent event) {
        int selectedID = tableInfo.getSelectionModel().getSelectedIndex();
        tableInfo.getItems().remove(selectedID);
    }

    @FXML
    void BackMain(MouseEvent event) throws IOException {

        Parent back = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/main.fxml"));

        Scene Menu = new Scene(back);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(Menu);
        window.show();
    }

    @FXML
    void GoAccueil(MouseEvent event) throws IOException {

        Parent go = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/accueil.fxml"));

        Scene Menu = new Scene(go);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(Menu);
        window.show();
    }

    @FXML
    void initialize() {
        assert nomColonne != null : "fx:id=\"nomColonne\" was not injected: check your FXML file 'Page_Information.fxml'.";
        assert prenomColonne != null : "fx:id=\"prenomColonne\" was not injected: check your FXML file 'Page_Information.fxml'.";
        assert rbFilleInfo != null : "fx:id=\"rbFilleInfo\" was not injected: check your FXML file 'Page_Information.fxml'.";
        assert rbGarconInfo != null : "fx:id=\"rbGarconInfo\" was not injected: check your FXML file 'Page_Information.fxml'.";
        assert sexeColonne != null : "fx:id=\"sexeColonne\" was not injected: check your FXML file 'Page_Information.fxml'.";
        assert tableInfo != null : "fx:id=\"tableInfo\" was not injected: check your FXML file 'Page_Information.fxml'.";
        assert tfNomInfo != null : "fx:id=\"tfNomInfo\" was not injected: check your FXML file 'Page_Information.fxml'.";
        assert tfPrenomInfo != null : "fx:id=\"tfPrenomInfo\" was not injected: check your FXML file 'Page_Information.fxml'.";
        assert tfQuotient != null : "fx:id=\"tfQuotient\" was not injected: check your FXML file 'Page_Information.fxml'.";
    }

   

}