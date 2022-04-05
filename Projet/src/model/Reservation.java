package model;

import java.util.Date;

public class Reservation{
  private String nomMenu;
  private String date;
  //private Date date;
  private int numReservation;
  // TODO mettre statut en enum
  enum Statuts { Confirmee, Annulee }
  private Statuts statut = null;
  private int penalites;
  boolean reservation;
  

  /*public Reservation(String nomMenu, String date){
    this.nomMenu = nomMenu;
    this.date = date;
  }*/

  public Reservation(String nomMenu, String date, int numR){
    this.nomMenu = nomMenu;
    this.date = date;
    this.numReservation = numR;
  }
  
  public Reservation(String nomMenu, String date, int numR, Statuts statut, int penalites){
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

  public String getDateReservation(){
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


  void annulerReservation(int numR){
     reservation = false;

  }

  void modifierReservation(int numR){
    
  }

  public Statuts changementStatut(Statuts statut, int numR){

    if(numR != 0 ){
      statut = Statuts.Confirmee ;
      reservation = true;
      return statut;
    }
    
    if (reservation == false ){ 
      statut = Statuts.Annulee; 
      return statut;
    }
    
    System.out.println("Statut inchangee");
    return statut;// retourne le statut si pas de changement
}

}