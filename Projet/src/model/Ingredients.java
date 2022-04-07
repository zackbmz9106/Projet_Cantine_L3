package model;
import java.util.ArrayList;
import java.util.Date;
public class Ingredients{
  private String nom;
  private String type;
  private String dlc;

  public Ingredients(String nom, String type, String dlc){
    this.nom = nom;
    this.type = type;
    this.dlc = dlc;
  }

  public Ingredients(String nom, String type){
    this.nom = nom;
    this.type = type;
  }

  public String getNomIngredient(){
    return this.nom;
  }
  // renvoie une liste d'ingredient sous forme de string
  /*public ArrayList<String> getNomIngredientList(){
    ArrayList<String> ingredientListStr;
    return ingredientListStr;
  }*/

  public void setNomIngredient(String nom){
     this.nom = nom ;
  }

  public String getTypeIngredient(){
    return this.type;
  }

  public void settypeIngredient(String type){
     this.type = type ;
  }

  public String getDlcIngredient(){
    return this.dlc;
  }
 public void setDLCIngredient(String dlc){
     this.dlc= dlc ;
  }


}