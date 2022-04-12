package model;

//import java.util.Date;

public class Reservation{
  private String nomMenu;
  private String datea;
  private Date date;
  private int numReservation;
  enum Statuts { Confirmee, Annulee }
  private Statuts statut = null;
  private int penalites;
  boolean reservation;
  private int prix;
  private Enfant enfant;// rajouter enfant comme attribut ----un enfant est rattache a une reservation ?

  /*public Reservation(String nomMenu, String date){
    this.nomMenu = nomMenu;
    this.date = date;
  }*/

  public Reservation(Menu menu, Date date){
    this.nomMenu = menu.getNomMenu();
    this.date = date;
    this.numReservation = genNumR();
    this.prix = menu.getPrix();
  }
  
  public Reservation(String nomMenu, Date date, int numR, Statuts statut, int penalites){
    this.nomMenu = nomMenu;
    this.date = date;
    this.numReservation = numR;
    this.statut = statut;
    this.penalites = penalites;
  }

  public boolean getReservation(){
    return this.reservation;
  }

  public String getNomMenu(){
    return this.nomMenu;
  }

  public void setNomMenu(String nomMenu){
     this.nomMenu = nomMenu;
  }

  public Date getDateReservation(){
    return this.date;
  }

  public int getnumReservation(){
    return this.numReservation;
  }

  public void setnumReservation(int numReservation){
    this.numReservation = numReservation;
 }

  public Statuts getStatus(){
    return this.statut;
  }

  public void setStatus(Statuts statut){
     this.statut = statut;
  }

  public int getPenalites(){
    return this.penalites;
  }

  public Enfant getEnfant(){
    return this.enfant;
  }

  public void setEnfant(Enfant enfant){
     this.enfant = enfant;
  }

  public int getPrixReservation(){
    return this.prix;
  }

  
  
  void annulerReservation(int numR){
     reservation = false;

  }

  void modifierReservation(int numR){
    
  }

  public int genNumR(){ // génére un numero de réservation
    int Min = 1;
    int Max = 1000;
    int numR;
    numR = Min + (int)(Math.random() * ((Max - Min) + 1));
    return numR;
  }
  
  
  public Statuts changementStatut(Statuts statut, int numR){

    if(numR != 0 ){
      statut = Statuts.Confirmee ;
      reservation = true;
      this.statut = statut;
      return statut;
    }
    
    if (reservation == false ){ 
      statut = Statuts.Annulee; 
      this.statut = statut;
      return statut;
    }
    
    System.out.println("Statut inchangee");
    return statut;// retourne le statut si pas de changement
}

}