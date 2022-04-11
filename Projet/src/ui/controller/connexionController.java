

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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.Compte;
import model.Enfant;

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
    @FXML
    private Label LBLerreurnum;
    @FXML
    public static Compte newCompte;

    @FXML
    //public connexionController connexion;

    private Button btnInscription;

    public connexionController(){
    }

    @FXML
    public void inscription(MouseEvent event) throws IOException {

        if(Math.floor(Math.log10(Long.parseLong(Tfnum.getText())) + 1) != 11){
            LBLerreurnum.setText("Numéro de téléphone incorrecte");
          
        }else{
            Parent accueilS = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/Page_information.fxml"));
            Scene accueilScene = new Scene(accueilS);
            Compte compte = new Compte(Tfnom.getText(),Tfprenom.getText(),Long.parseLong(Tfnum.getText()),Tfadresse.getText(),Tfmail.getText(),Tfmdp.getText());
            //System.out.println(compte);
            //connexion = new connexionController();
            connexionController.setNewCompte(compte);
        
            //informationEnfantController iec  = new informationEnfantController(compte);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(accueilScene);
            window.show(); 
        }

        
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
    public void initialize() {

    }

    @FXML
    public static Compte getNewCompte(){// retourne le compte qui vient d'etre cree
        return newCompte;
    }

    @FXML
    public static void setNewCompte(Compte Compte){
        newCompte = Compte ;
    }

   /* public connexionController getconnexionController(){
        return connexion;
    }*/

    public Button getbtnInscription() {
		return btnInscription;
	}
    
}
