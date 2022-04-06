package model;

import java.util.ArrayList;

public class Enfant{
  private int idEnfant;
  private int idParent;
  private String nom;
  private String prenom;
  // on devrait créer un type sexe qui aurait 3 valeurs a prendre
  // masculain, feminin, non-binaire
  private String sexe;
  private boolean handicap;
  private ArrayList<Reservation> listReservation = new ArrayList<Reservation>();// liste des reservations de l'enfants

  public Enfant(int idEnfant, int idParent, String nom, String prenom, String sexe, boolean handicap){
    this.idEnfant = idEnfant;
    this.idParent = idParent;
    this.nom = nom;
    this.prenom = prenom;
    this.sexe = sexe;
    this.handicap = handicap;
  }

  public int getIdEnfant(){
    return this.idEnfant;
  }

  public int getIdParent(){
    return this.idParent;
  }

  public String getNom(){
    return this.nom;
  }

  public String getPrenom(){
    return this.prenom;
  }

  public String getSexe(){
    return this.sexe;
  }

  public boolean getHandicap(){
    return this.handicap;
  }

  public ArrayList<Reservation> getListReservation(){
    ArrayList<Reservation> listR = this.listReservation;
    for(int i=0; i< this.listReservation.size();i++){
        System.out.println("Reservation de "+listR.get(i).getEnfant().getPrenom()+" numéro: "+listR.get(i).getnumReservation()+" Menu: "+listR.get(i).getNomMenu()+" Date: "+ listR.get(i).getDateReservation());
    }
    return this.listReservation; // faire liste de numR pur afficher 
  }

  public void setListReservation(Reservation reservation){
     this.listReservation.add(reservation);
  }

/////////////////////////////////////////// Setter /////////////////////////////////////////////////////////////////////////////
 
 
public void setIdEnfant(int idEnfant){
     this.idEnfant = idEnfant;
  }

  public void setIdParent(int idParent){
     this.idParent = idParent;
  }

  public void setNom(String nom){
     this.nom = nom;
  }

  public void setPrenom(String prenom){
     this.prenom = prenom;
  }

  public void setSexe(String sexe){
    this.sexe = sexe;
  }

  public void setHandicap(boolean handicap){
     this.handicap = handicap;
  }
}