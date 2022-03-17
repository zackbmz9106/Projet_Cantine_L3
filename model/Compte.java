package model;
import java.util.Date;

public class Compte {
  private int id;
  private String nom;
  private int quotientF;
  private int numTel;

  public Compte(int id,String nom, int quotientF,int numTel){
    this.id = id;
    this.nom = nom;
    this.quotientF = quotientF;
    this.numTel = numTel;
  }


  public int getID(){
    return this.id;
  }

  public String getNom(){
    return this.nom;
  }

  public int getQuotientF(){
    return this.quotientF;
  }

  public int getNumTel(){
    return this.numTel;
  }

  public void setID(int id){
    this.id = id;
  }

  public void setNom(String nom){
    this.nom = nom;
  }

  public void setQuotientF(int quotientF){
    this.quotientF = quotientF;
  }

  public void setNumTel(int numTel){
    this.numTel = numTel;
  }


  void PrendreUneReservation(Date Date, String nomMenu, String prenom){
    boolean reservation = true;
    nomMenu = Menu.getNomMenu(); 
    
                                                                                                            

  

  }

public void seDeconnecter() { 
  System.exit(0);
}


  void reserver(String nom_menu,Date date){
    // TODO
  }

  
  void voirCalendrier(int idEnfant){
    // TODO
  }
}