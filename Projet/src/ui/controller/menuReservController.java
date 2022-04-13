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
import model.Date;
import model.Ingredients;


public class menuReservController implements Initializable {

    @FXML
    private TableView<Menu> tableMenus;

    @FXML
    private TableColumn<Menu, Date> joursColonne;

    @FXML
    private TableColumn<Menu, ArrayList<Ingredients>> entreeColonne;

    @FXML
    private TableColumn<Menu, ArrayList<Ingredients>> platViandeColonne;

    @FXML
    private TableColumn<Menu, ArrayList<Ingredients>> platPoissonColonne;

    @FXML
    private TableColumn<Menu, ArrayList<Ingredients>> platVegetarienColonne;

    @FXML
    private TableColumn<Menu, ArrayList<Ingredients>> dessertColonne;
    private  ArrayList<Menu> menuSemaine = accueilController.getMenuList(); // recuperation des menus initialiser
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
        joursColonne.setCellValueFactory(new PropertyValueFactory <Menu, Date>("dateMenu"));
        entreeColonne.setCellValueFactory(new PropertyValueFactory <Menu, ArrayList<Ingredients>>("entreeList"));
        //platViandeColonne.setCellValueFactory(new PropertyValueFactory <Menu, ArrayList<Ingredients>>("platList"));
        //platPoissonColonne.setCellValueFactory(new PropertyValueFactory <Menu, ArrayList<Ingredients>>("platList"));
        //platVegetarienColonne.setCellValueFactory(new PropertyValueFactory <Menu, ArrayList<Ingredients>>("platList"));
        //dessertColonne.setCellValueFactory(new PropertyValueFactory <Menu, ArrayList<Ingredients>>("dessertList"));

        System.out.println(menuSemaine);
       /*ObservableList<Menu> menus = tableMenus.getItems();
       for(Menu menu : menuSemaine){
        menus.add(menu);
        tableMenus.setItems(menus);
      }*/
      for(int i =0; i<menuSemaine.size();i++){
      ObservableList<Menu> menus = tableMenus.getItems();
        for(Menu menu : menuSemaine){
          menus.add(menu);
          System.out.println(menu);
          tableMenus.setItems(menus);
        }
      }
      //ObservableList<Menu> menus = tableMenus.getItems();
      /*
      for(Menu menu : menuSemaine){
        ObservableList<Menu> menus = tableMenus.getItems();
            menus.add(menu);
            System.out.println(menu);
            tableMenus.setItems(menus);
        } 
        */
    
      } 



    @FXML
    void goMenus(MouseEvent event)throws IOException {
        
        System.out.println("Retour Accueil");
        Parent menu = FXMLLoader.load(getClass().getClassLoader().getResource("ui/fxml/Page_reservation_repas.fxml"));
        
        Scene retour = new Scene(menu);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(retour);
        window.setResizable(false);
        window.show();
    
    }

}