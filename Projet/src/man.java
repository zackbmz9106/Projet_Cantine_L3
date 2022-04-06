
//import java.util.Date;
//import java.text.SimpleDateFormat;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Compte;
import model.Enfant;
import model.Menu;
import model.Moyendepaiement;

public class man extends Application {
    @Override
    public void start(Stage primaryStage)  {
        // TODO Auto-generated method stub
        try{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("main.fxml"));
        
        primaryStage.setScene(new Scene(root)); 
        primaryStage.show();
        } catch (Exception e) { 
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");
        launch(args);
       
    Compte compte = new Compte(1,"samy",545,060);

       
    Moyendepaiement mp = new Moyendepaiement("nom", "prenom", "adresseDeFacturation", 1455436789781756L,"15/06/2025",135);
    //mp.payerParCarte();
    //System.out.println(mp.getDateExpiration());

    Enfant enfant = new Enfant(001, 10, "bgd", "zak", "M", false);
    Menu menu = new Menu("viande",5,"menub");

    int numR = compte.PrendreUneReservation("01/10/2000", menu, enfant, mp);
    //System.out.println("voici votre numero de reservation"+ " " +numR);
    //Reservation.setNumReservation(numR);
    

              
    }

   
}

