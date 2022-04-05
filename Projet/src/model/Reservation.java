package model;

import java.util.Date;

public class Reservation{
  private String nomMenu;
  private Date date;
  private int numReservation;
  // TODO mettre statut en enum
  enum Statuts { Confirmee, Annulee }
  private Statuts statut;
  private int penalites;
  boolean reservation = false;
  

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

  public Date getDate(){
    return this.date;
  }

  public int getNumReservation(){
    return this.numReservation;
  }

  public Statuts getStatus(){
    return this.statut;
  }

  public int getPenalites(){
    return this.penalites;
  }


  void annulerReservation(int numR){
    boolean reservation = false;

    
  }

  void modifierReservation(int numR){
    
  }

  void changementStatut( Statuts statut, int numR){

    if(numR != 0 ){
    Statuts etat = Statuts.Confirmee ;
    };
    
    if ( reservation = false ){ 
      Statuts etat = Statuts.Annulee; 
    }
      

}

}