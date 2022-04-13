package ui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.Menu;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Ingredients;


public class menuReservController implements Initializable {

    @FXML
    private TableView<Menu> tableMenus;

    @FXML
    private TableColumn<Menu, String> joursColonne;

    @FXML
    private TableColumn<Menu, String> entreeColonne;

    @FXML
    private TableColumn<Menu, String> platViandeColonne;

    @FXML
    private TableColumn<Menu, String> platPoissonColonne;

    @FXML
    private TableColumn<Menu, String> platVegetarienColonne;

    @FXML
    private TableColumn<Menu, String> dessertColonne;
  /*  
    @FXML
    private ArrayList<Ingredients> entree;

      ObservableList<Menu> list = FXCollections.observableArrayList(
      new Menu("Lundi", entree, ArrayList<Ingredients> plat, ArrayList<Ingredients> dessert)
      //new Menu("plat", "test1", "test2", "test3", "test4"),
      //new Menu("dessert", "test1", "test2", "test3", "test4")
  );
*/
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        joursColonne.setCellValueFactory(new PropertyValueFactory <Menu, String>("jours"));
        entreeColonne.setCellValueFactory(new PropertyValueFactory <Menu, String>("entree"));
        platViandeColonne.setCellValueFactory(new PropertyValueFactory <Menu, String>("plat viande"));
        platPoissonColonne.setCellValueFactory(new PropertyValueFactory <Menu, String>("plat poisson"));
        platVegetarienColonne.setCellValueFactory(new PropertyValueFactory <Menu, String>("plat vegetarien"));
        dessertColonne.setCellValueFactory(new PropertyValueFactory <Menu, String>("dessert"));

       // tableMenus.setItems(list);
    } 



    @FXML
    void backRerv(MouseEvent event)throws IOException {
        
        System.out.println("Retour Accueil");
        Parent menu = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/Page_reservation_repas.fxml"));
        
        Scene retour = new Scene(menu);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(retour);
        window.setResizable(false);
        window.show();
    
    }

}