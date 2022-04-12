
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.Compte;
import model.Enfant;
import model.Menu;
import model.Moyendepaiement;
import ui.controller.accueilController;
import ui.controller.connexionController;
import ui.controller.informationEnfantController;

public class man extends Application {
   

    @Override
    public void start(Stage primaryStage)  {
        try{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/main.fxml"));
        
        primaryStage.setScene(new Scene(root)); 
        primaryStage.show();
        } catch (Exception e) { 
            e.printStackTrace();
        }
    }

    
    public static void main(String [] args) throws Exception{

        System.out.println("Lancement de l'applicaiton...");

        launch(args);    
    
        /*Menu menuInit = new Menu();
        menuInit.menuInit();*/
        
        //connexionController connexionController = new connexionController();
        
        //connexionController.initialize();
        //informationEnfantController iec = new informationEnfantController(connexionController,connexionController.getNewCompte());
        //iec.AjouterEnfant(iec.getbtnInscription());
       
        //iec.AjouterEnfant(MouseEvent);
    
    
       
    

    
    
    }


}

   


