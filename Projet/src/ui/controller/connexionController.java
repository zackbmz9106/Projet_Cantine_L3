

package ui.controller;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
//import com.mysql.cj.xdevapi.PreparableStatement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.Compte;
import model.Enfant;

public class connexionController {

       
        


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
     private Label erreurVide;

    String nom;
    int num;
    private Button btnInscription;

    static String url = "jdbc:mysql://127.0.0.1:3306/macantine";
    static String user = "root";
    static String password = "projetjaval3";
    static String sql1 = "SELECT * FROM compte where nom = ? ";
    static int parameterIndex;
    static String email;
    private static Compte newCompte;

    
    @FXML
     void inscription(MouseEvent event) throws IOException, SQLException, ClassNotFoundException {
        Connection connexion  ; 
        PreparedStatement psInsert = null; 
        PreparedStatement psCheckExcistance = null;
        ResultSet resultat =null;


        if  (Tfnom.getText().isEmpty() || Tfprenom.getText().isEmpty() || Tfnum.getText().isEmpty() ||  Tfadresse.getText().isEmpty() || Tfadresse.getText().isEmpty() || Tfmail.getText().isEmpty()  || Tfmdp.getText().isEmpty() ) { 
            erreurVide.setText("Entrez vos données svp");
        }
        
       else if(Math.floor(Math.log10(Long.parseLong(Tfnum.getText())) + 1) != 11){
            LBLerreurnum.setText("Numéro de téléphone incorrecte");
        } 
        
        else{
            alertbox.afficher("Titre de la fenetre", " Inscription réussie !");
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
            
            connexion = DriverManager.getConnection(url, user, password);
        

   try { 
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("DRIVER MYSQL OK ! ");
        
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
            System.out.println("compte ajouté");
            psInsert = connexion.prepareStatement(sql2);
        }
    }
    
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            connexion.close(); 
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


}
