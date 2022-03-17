package model;
import java.util.Date;
public class Ingredients{
  private String nom;
  private String type;
  private Date dlc;

  public Ingredients(String nom, String type, Date dlc){
    this.nom = nom;
    this.type = type;
    this.dlc = dlc;
  }

  public String getNom(){
    return this.nom;
  }
  public void setNom(String nom){
     this.nom = nom ;
  }

  public String getType(){
    return this.type;
  }

  public void settype(String type){
     this.type = type ;
  }

  public Date getDlc(){
    return this.dlc;
  }
 public void setDLC(Date dlc){
     this.dlc= dlc ;
  }


}