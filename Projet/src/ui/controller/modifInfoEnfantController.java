package ui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
//import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import model.Enfant;
import model.Compte;


public class modifInfoEnfantController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAjouter;

    @FXML
    private ToggleGroup gsexe;

    @FXML
    private TableColumn<Enfant, String> nomColonne;

    @FXML
    private TableColumn<Enfant, String> prenomColonne;

    @FXML
    private RadioButton rbFilleModifInfo;

    @FXML
    private RadioButton rbGarconModifInfo;

    @FXML
    private TableColumn<Enfant, String> sexeColonne;

    @FXML
    private TableView<Enfant> tableModifInfo;

    @FXML
    private TextField tfNomModifInfo;

    @FXML
    private TextField tfPrenomModifInfo;

    @FXML
    private Enfant enfantajt;

    private static Compte newCompte;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nomColonne.setCellValueFactory(new PropertyValueFactory<Enfant, String>("nom"));
        prenomColonne.setCellValueFactory(new PropertyValueFactory<Enfant, String>("prenom"));
        sexeColonne.setCellValueFactory(new PropertyValueFactory<Enfant, String>("sexe"));
        
    }

    public String getSexe(){
        if(rbGarconModifInfo.isSelected()) {
            rbFilleModifInfo.setSelected(false); 
            return rbGarconModifInfo.getText();

        }else if(rbFilleModifInfo.isSelected()) {
            rbGarconModifInfo.setSelected(false);
            return rbFilleModifInfo.getText();
        }
        return null; 
    }

    @FXML
    void Back(MouseEvent event) throws IOException {
        Parent retour = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/accueil.fxml"));

        Scene Menu = new Scene(retour);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(Menu);
        window.show();
    }

    @FXML
    void AjouterEnfant(MouseEvent event) {
      Enfant enfant = new Enfant(tfNomModifInfo.getText(),(tfPrenomModifInfo.getText()), getSexe());
        enfantajt = enfant;
        ObservableList<Enfant> enfants = tableModifInfo.getItems();
        enfants.add(enfant);
        tableModifInfo.setItems(enfants);
        tfNomModifInfo.setText("");
        tfPrenomModifInfo.setText("");
   
        informationEnfantController.setCompte(connexionController.getNewCompte());
        newCompte.setEnfantCompte(enfant);
        System.out.println(newCompte);
  
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
    void RetirerEnfant(MouseEvent event) {
        int selectedID = tableModifInfo.getSelectionModel().getSelectedIndex();
        tableModifInfo.getItems().remove(selectedID);
        newCompte.suppEnfantCompte(enfantajt);
        System.out.println(newCompte);
    }

    public static void setCompte(Compte compte){
        newCompte = compte;
    }

    public static Compte getCompte(){
        return newCompte;
    }

    public Button getbtnAjouter(){
        return btnAjouter;
    }
    @FXML
    void initialize() {
        assert btnAjouter != null : "fx:id=\"btnAjouter\" was not injected: check your FXML file 'Page_ModifEnfantInfo.fxml'.";
        assert gsexe != null : "fx:id=\"gsexe\" was not injected: check your FXML file 'Page_ModifEnfantInfo.fxml'.";
        assert nomColonne != null : "fx:id=\"nomColonne\" was not injected: check your FXML file 'Page_ModifEnfantInfo.fxml'.";
        assert prenomColonne != null : "fx:id=\"prenomColonne\" was not injected: check your FXML file 'Page_ModifEnfantInfo.fxml'.";
        assert rbFilleModifInfo != null : "fx:id=\"rbFilleModifInfo\" was not injected: check your FXML file 'Page_ModifEnfantInfo.fxml'.";
        assert rbGarconModifInfo != null : "fx:id=\"rbGarconModifInfo\" was not injected: check your FXML file 'Page_ModifEnfantInfo.fxml'.";
        assert sexeColonne != null : "fx:id=\"sexeColonne\" was not injected: check your FXML file 'Page_ModifEnfantInfo.fxml'.";
        assert tableModifInfo != null : "fx:id=\"tableModifInfo\" was not injected: check your FXML file 'Page_ModifEnfantInfo.fxml'.";
        assert tfNomModifInfo != null : "fx:id=\"tfNomModifInfo\" was not injected: check your FXML file 'Page_ModifEnfantInfo.fxml'.";
        assert tfPrenomModifInfo != null : "fx:id=\"tfPrenomModifInfo\" was not injected: check your FXML file 'Page_ModifEnfantInfo.fxml'.";

    }



}
