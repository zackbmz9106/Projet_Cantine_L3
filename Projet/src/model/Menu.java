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
  private String date;



  public Menu(){ 
  }

  public Menu(String typeMenu, String nomMenu, ArrayList<Ingredients> entree, ArrayList<Ingredients> plat, ArrayList<Ingredients> dessert){ //ArrayList<Integer> listdesReservation){
    this.typeMenu = typeMenu;
    //this.prix = prix;
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
  public ArrayList<String> afficheIngredientsList(ArrayList<Ingredients> maliste){
    ArrayList <String> list = new ArrayList<>();
    for(int i=0;i<maliste.size();i++){
      String ingre = maliste.get(i).getNomIngredient();
      list.add(ingre);
    }
    
    /*System.out.println("Plat : "+platList);
    System.out.println("Dessert : "+dessertList);
    System.out.println("Entree : "+entreeList.get(0).getNomIngredient());*/
    //System.out.println(list);
    return list;
  }

  // Initialise plusieurs Menu et retourne une liste de tous les menus instancier
  public ArrayList<Menu> menuInit(){
    ArrayList<Menu> ListedesMenu = new ArrayList<>();
    
    Ingredients salade = new Ingredients("salade", "legume");
    Ingredients tomate = new Ingredients("tomate", "legume");
    Ingredients celeri = new Ingredients("celeri", "legume");
    
    //Viande
    Ingredients steak = new Ingredients("steak", "viande");
    Ingredients poulet = new Ingredients("poulet", "viande");
    //Poisson
    Ingredients saumon = new Ingredients("saumon", "poisson");
    Ingredients pates = new Ingredients("pates", "poisson");
    //Vegetarien
    Ingredients printaniere = new Ingredients("printaniere", "vegetarien");
    Ingredients steakSoja = new Ingredients("steakSoja", "vegetarien");

    Ingredients mousseChocolat = new Ingredients("mousseChocolat","dessert");
    Ingredients tarte = new Ingredients("tarte","dessert");

    
    ArrayList<Ingredients> entreeList = new ArrayList<>();
    entreeList.add(salade);
    entreeList.add(tomate);
    entreeList.add(celeri);
   
    ArrayList<Ingredients> platListViande = new ArrayList<>();
    platListViande.add(steak);
    platListViande.add(poulet);
    
    ArrayList<Ingredients> dessertList = new ArrayList<>();
    dessertList.add(mousseChocolat);
    dessertList.add(tarte);
    
    ArrayList<Ingredients> platListPoisson = new ArrayList<>(); 
    platListPoisson.add(pates);
    platListPoisson.add(saumon);

    ArrayList<Ingredients> platListVegetarien = new ArrayList<>();
    platListVegetarien.add(printaniere);
    platListVegetarien.add(steakSoja);
   
      Menu  menu1 = new Menu("Viande", "Menu viande", entreeList, platListViande, dessertList);
      ListedesMenu.add(menu1);
      System.out.println(" "+menu1.getNomMenu()+" initialise");
      //System.out.println("   "+platListViande);
      System.out.println(menu1);
      Menu menu2 = new Menu("Poisson", "Menu poisson", entreeList, platListPoisson, dessertList);
      ListedesMenu.add(menu2);
      System.out.println(" "+menu2.getNomMenu()+" initialise");
      //System.out.println("   "+platListPoisson);
      System.out.println(menu2);
      Menu menu3 = new Menu("Végetarien", "Menu végetarien", entreeList, platListVegetarien, dessertList);
      ListedesMenu.add(menu3);
      System.out.println(" "+menu3.getNomMenu()+" initialise");
      //System.out.println("   "+platListVegetarien);
      System.out.println(menu3);
      System.out.println(menu3.afficheEntree());
    
    
    return ListedesMenu;
  }

  public String toString(){
    String n = System.getProperty("line.separator");
    return "Nom du menu: "+nomMenu+n+"  Type: "+typeMenu+n+"    Prix: "+prix+n+"      Composition de l'entree: "+afficheIngredientsList(entreeList)+n+"       Composition du plat: "+afficheIngredientsList(platList)+n+"         Composition du dessert: "+afficheIngredientsList(dessertList);
  } 
  //affiche la liste des ingédients de l'entrée dans une chaine de caractère 
  public String afficheEntree(){
    //String afficheListe ="";
    String finalstr="";  
    String str="";
    ArrayList<String> list = afficheIngredientsList(this.entreeList);
        for(int i =0;i<list.size();i++){
            System.out.println("gg");
            str = list.get(i);//+", ";
          for(int j=0;j<list.size()-1;j++){
            if(j==i-1){
              break;
            }
            System.out.println("to");
            String str1=", ";
            str+=str1;
            break;

          }
          finalstr+=str;
        }

    return finalstr;
  }

}