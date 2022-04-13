package ui.controller;

import model.Menu;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent; 
import javafx.scene.Scene;
//import javafx.scene.control.Menu;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;

public class accueilController {

    private Stage stage; 
    private Scene reserve ; 
    private Parent reservation;
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    public void handleButtonAction(MouseEvent event) {
        System.out.println("You clicked me!");
    }
    @FXML

    public Menu menuInit = new Menu();

    @FXML
    private static ArrayList<Menu> menuList;
   


    @FXML
    public void reserver(MouseEvent event) throws IOException {
        
        System.out.println("Reservation");
        Parent reservation = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/page_Reservation.fxml"));
        
        Scene reserve = new Scene(reservation);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(reserve);
        window.setResizable(false);
        window.show();
    
    } 

    @FXML
    void voirFacture(MouseEvent event) throws IOException {


        Parent Facture = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/Page_Facture.fxml"));

        Scene FactureScene = new Scene(Facture);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(FactureScene);
        window.setResizable(false);
        window.show();
    }

    @FXML
    void goMenu(MouseEvent event) throws IOException {

        

        Parent goMenu = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/Page_menus.fxml"));

        Scene Menu = new Scene(goMenu);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(Menu);
        window.setResizable(false);
        window.show();
    }

    @FXML
    void GoParametre(MouseEvent event) throws IOException {
        Parent parametre = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/Page_parametre.fxml"));

        Scene Para = new Scene(parametre);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(Para);
        window.setResizable(false);
        window.show();

    }

    @FXML
    void GoSynthese(MouseEvent event) throws IOException {
        Parent synth = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/Page_SyntheseReservation.fxml"));

        Scene synthScene = new Scene(synth);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(synthScene);
        window.setResizable(false);
        window.show();
    }

    
    @FXML
    void GoPageInfoEnfant(MouseEvent event) throws IOException {

        //tfQuotient.setEditable(false);

        Parent synth = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/Page_ModifEnfantInfo.fxml"));

        Scene synthScene = new Scene(synth);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(synthScene);
        window.setResizable(false);
        window.show();

    }

    @FXML
    void deconnexion(MouseEvent event) throws IOException {

        alertbox.afficher("Deconnexion", " Vous etes maintenant déconnecté !");
        Parent deco = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/main.fxml"));

        Scene MainScene = new Scene(deco);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(MainScene);
        window.setResizable(false);
        window.show();
    }

    @FXML
    public void initialize() {
        //Menu menuinit = new Menu();
        accueilController.setMenuList(menuInit.menuInit());
        //menuInit.menuInit();
    }

    public static ArrayList<Menu> getMenuList(){
        return menuList;
    }

    public static void setMenuList(ArrayList<Menu> menuL){
         menuList = menuL;
    }

}

