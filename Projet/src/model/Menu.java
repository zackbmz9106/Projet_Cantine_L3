package model;

import java.util.ArrayList;

public class Menu{
  //possibilite de faire heritage pour chaque menu
  private String nomMenu;
  private int prix;
  private String typeMenu;
  private ArrayList<Integer> listDesReservation = new ArrayList<Integer>();
  private ArrayList<Ingredients> entreeList = new ArrayList<>();// liste des ingrédient qui compose l'entree
  private ArrayList<Ingredients> platList = new ArrayList<>();// liste des ingrédients qui compose le plat
  private ArrayList<Ingredients> dessertList = new ArrayList<>();// liste des ingrédients qui compose le dessert


  public Menu(String typeMenu, int prix, String nomMenu, ArrayList<Ingredients> entree, ArrayList<Ingredients> plat, ArrayList<Ingredients> dessert){ //ArrayList<Integer> listdesReservation){
    this.typeMenu = typeMenu;
    this.prix = prix;
    this.nomMenu = nomMenu;
    this.entreeList = entree; //add(entree);
    this.platList = plat; //add(plat);
    this.dessertList = dessert; //add(dessert);
    
  
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


  //afficher la liste des ingredients d'un menu pour debug sinon renvoie la liste des ingredients de l'entree
  public ArrayList<Ingredients> afficheIngredientsMenu(){
    /*for(int i=0;i<=entreeList.size();i++){
      System.out.println("Entree : "+entreeList.get(i).getNomIngredient());
    }
    System.out.println("Plat : "+platList);
    System.out.println("Dessert : "+dessertList);*/
    System.out.println("Entree : "+entreeList.get(0).getNomIngredient());
    return entreeList;
  }

  /*public Arraylist<Menu> menuInit(){
    Ingredients salade = new Ingredients("salade", "legumes");
    Ingredients tomate = new Ingredients("tomate", "legumes");
    Ingredients steak = new Ingredients("steak", "viande");
    Ingredients poulet = new Ingredients("poulet", "viande");
    Ingredients mousseChocolat = new Ingredients("mousseChocolat","dessert");
    Ingredients tarte = new Ingredients("tarte","dessert");

    ArrayList<Ingredients> entreeList = new ArrayList<>();
    ArrayList<Ingredients> platList = new ArrayList<>();
    ArrayList<Ingredients> dessertList = new ArrayList<>();

    for(int i=0;i<=3;i++){
      new Menu("Viande", Compte.calculPrix(), nomMenu, entreeList, platList, dessertList);
    }


    return
  }*/



}