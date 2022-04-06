package model;

import java.util.ArrayList;

public class Menu{
  //possibilite de faire heritage pour chaque menu
  private String typeMenu;
  private int prix;
  private String nomMenu;
  private ArrayList<Integer> listDesReservation = new ArrayList<Integer>();
  private ArrayList<Ingredients> entreeList = new ArrayList<>();// liste des ingrédient qui compose l'entree
  private ArrayList<Ingredients> platList = new ArrayList<>();// liste des ingrédients qui compose le plat
  private ArrayList<Ingredients> dessertList = new ArrayList<>();// liste des ingrédients qui compose le dessert


  public Menu(String typeMenu, int prix, String nomMenu, ArrayList<Ingredients> entreeList, ArrayList<Ingredients> platList, ArrayList<Ingredients> dessertList){ //ArrayList<Integer> listdesReservation){
    this.typeMenu = typeMenu;
    this.prix = prix;
    this.nomMenu = nomMenu;
    this.entreeList = entreeList;
    this.platList = entreeList;
    this.dessertList = entreeList;
    
  
  }

  public Menu(String typeMenu, int prix, String nomMenu){ 
    this.typeMenu = typeMenu;
    this.prix = prix;
    this.nomMenu = nomMenu;
  }

  public String getTypeMenu(){
    return this.typeMenu;
  }
  
  public void setTypeMenu(String typeMenu){
     this.typeMenu = typeMenu;
  }

  public int getPrix(){
    return this.prix;
  }
  
  public void setPrix(int prix){
     this.prix = prix;
  }

  public String getNomMenu(){
    return this.nomMenu;
  }
  
  public void setNomMenu(String nomMenu){
    this.nomMenu = nomMenu;
  }

  public ArrayList<Integer> getListDesReservation(){
    return this.listDesReservation;
  }
  
  public void setListDesreservation(int numR){
    this.listDesReservation.add(numR);
  }

  public void affecter(Enfant enfant, Menu menu, Reservation reservation){ 
    enfant.setListReservation(reservation);// ajout de la reservation dans la liste des reservation de l'enfant 
    //reservation.setNomMenu(nomMenu); // ajout du nom du menu a la reservation
    reservation.setEnfant(enfant); // ajout de l'enfant a la reservation 
    menu.setListDesreservation(reservation.getnumReservation()); //ajout du numero de reservation dans la liste des reservations pour le menu
  }

  /*public void addList(Ingredients ingredients){
    this.listDesIngredients.add(ingredients);
  }*/


  // faire methode pour afficher liste ingredients d'un menu 

}