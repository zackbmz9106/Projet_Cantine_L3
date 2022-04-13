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

    @FXML
    private Enfant enfantajt;
    
    @FXML
    private Button btnAjouter;

    private static Compte newCompte;
    
    //@FXML
    //private connexionController cc;


    /*public informationEnfantController(connexionController cc, Compte compte) {
        this.cc = cc;
        this.newCompte = compte;
    }*/

    /*public informationEnfantController(Compte compte) {
        this.newCompte = compte;
    }*/

    
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nomColonne.setCellValueFactory(new PropertyValueFactory<Enfant, String>("nom"));
        prenomColonne.setCellValueFactory(new PropertyValueFactory<Enfant, String>("prenom"));
        sexeColonne.setCellValueFactory(new PropertyValueFactory<Enfant, String>("sexe"));
        
    }

    
    public String getSexe(){
        if(rbGarconInfo.isSelected()) {
            rbFilleInfo.setSelected(false); 
            return rbGarconInfo.getText();
        
        }else if(rbFilleInfo.isSelected()) {
            rbGarconInfo.setSelected(false);
            return rbFilleInfo.getText();
        }
        return null; 
    }

    /*connexionController cc = new connexionController();
    Compte newCompte = cc.getNewCompte();*/

    @FXML
    public void AjouterEnfant(MouseEvent event) {
        Enfant enfant = new Enfant(tfNomInfo.getText(),(tfPrenomInfo.getText()), getSexe());
        enfantajt = enfant;
        ObservableList<Enfant> enfants = tableInfo.getItems();
        enfants.add(enfant);
        tableInfo.setItems(enfants);
        tfNomInfo.setText("");
        tfPrenomInfo.setText("");
        //newCompte = connexionController.getNewCompte();
        informationEnfantController.setCompte(connexionController.getNewCompte());
        newCompte.setEnfantCompte(enfant);
        System.out.println(newCompte);
        //System.out.println(newCompte.getEnfantCompte());

        //System.out.println(enfant);
        //System.out.println(enfants);
    }

    @FXML
    public void RetirerEnfant(MouseEvent event) {
        int selectedID = tableInfo.getSelectionModel().getSelectedIndex();
        tableInfo.getItems().remove(selectedID);
        newCompte.suppEnfantCompte(enfantajt);
        System.out.println(newCompte);
        //System.out.println(enfantajt);
        //enfantajt = null;
        
       
    }

    @FXML
    void GoAccueil(MouseEvent event) throws IOException {


        Parent go = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/accueil.fxml"));

        Scene Menu = new Scene(go);
        newCompte.setQuotientF(Integer.parseInt(tfQuotient.getText()));
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(Menu);
        window.setResizable(false);
        window.show();
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
