

package ui.controller;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.mysql.cj.xdevapi.PreparableStatement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
    static TextField Tfnom;
    @FXML
    static private TextField Tfprenom;
    @FXML
    static private TextField Tfnum;
    @FXML
    static private TextField Tfadresse;
    @FXML
    static private TextField Tfmail;
    @FXML
    static private TextField Tfmdp;
    @FXML
    static private Label LBLerreurnum;

    String nom;
    int num;
    static String url = "jdbe:mysql://localhost:3306/macantine";
    static String user = "root";
    static String password = "projetjaval3";
    static String sql1 = "SELECT * FROM compte where email= ? ";
    static int parameterIndex;
    static String email;


    @FXML
     void inscription(MouseEvent event) throws IOException, SQLException {
        Connection connexion = null ; 
        PreparedStatement psInsert = null; 
        PreparedStatement psCheckExcistance = null;
        ResultSet resultat =null;


        
        /*
        if(Math.floor(Math.log10(Long.parseLong(Tfnum.getText())) + 1) != 11){
            LBLerreurnum.setText("Numéro de téléphone incorrecte");
          
        }else{} */
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
        

    try { 
        connexion = DriverManager.getConnection(url, user, password);
         String sql2 = "INSERT INTO compte.macantine VALUES ( "+Tfnom.getText()+","+Tfprenom.getText()+ ","+ Tfnum.getText()+","+ Tfadresse.getText()+","+ Tfmail.getText()+","+ Tfmdp.getText()+")";

        psCheckExcistance= connexion.prepareStatement(sql1);
        
        psCheckExcistance.setString(parameterIndex = 1, email);
        resultat = psCheckExcistance.executeQuery();

        if (resultat.isBeforeFirst()) { 
            System.out.println("Utilisateur existe dejà ");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.show(); 
        }
        else { 
            psInsert = connexion.prepareStatement(sql2);
        }
    }
            
    

    finally {  if (resultat !=null) { 
        try { 
            resultat.close();
        } catch (SQLException e) { 
            e.printStackTrace();
        }
    }
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
