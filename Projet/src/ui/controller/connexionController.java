

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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.Compte;

public class connexionController {

        private Stage stage; 
        private Scene scene ; 
        private Parent root;
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private TextField Tfnom;
    @FXML
    private TextField Tfprenom;
    @FXML
    private TextField Tfnum;
    @FXML
    private TextField Tfadresse;
    @FXML
    private TextField Tfmail;
    @FXML
    private TextField Tfmdp;

    String nom;


    @FXML
    void inscription(MouseEvent event) throws IOException {
        Parent accueilS = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/accueil.fxml"));

        Scene accueilScene = new Scene(accueilS);
        
    
        System.out.println(Tfnom.getText());
        System.out.println(Tfadresse.getText());

        Compte compte = new Compte(Tfnom.getText(),Tfprenom.getText(),Integer.parseInt(Tfnum.getText()),Tfadresse.getText(),Tfmail.getText(),Tfmdp.getText());
        System.out.println(compte);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(accueilScene);
        window.show();
    }

    @FXML
    public void seConnecter(ActionEvent event) throws IOException{

        Parent accueilS = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/accueil.fxml"));

        Scene accueilScene = new Scene(accueilS);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(accueilScene);
        window.show();
    
    }

    @FXML
    void initialize() {

    }
}
