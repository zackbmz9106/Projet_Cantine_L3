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

  void reserver(String nom_menu,Date date){
    // TODO
  }

  void seDeconnecter(){
    // TODO
  }

  void voirCalendrier(int idEnfant){
    // TODO
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
}