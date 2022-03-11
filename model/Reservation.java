package model;

import java.util.Date;

public class Reservation{
  private String nomMenu;
  private Date date;
  private int numReservation;
  // TODO mettre status en enum
  private String status;
  private int penalites;

  public Reservation(String nomMenu, Date date, int numR, String status, int penalites){
    this.nomMenu = nomMenu;
    this.date = date;
    this.numReservation = numR;
    this.status = status;
    this.penalites = penalites;
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

  public String getStatus(){
    return this.status;
  }

  public int getPenalites(){
    return this.penalites;
  }

  void annulerReservation(int nummRes){
    // TODO
  }

  void modifierReservation(int nummRes){
    // TODO
  }

  void changementStatut(String status, int numRes){
    // TODO
  }

}