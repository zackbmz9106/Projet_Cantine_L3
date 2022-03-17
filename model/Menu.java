package model;

public class Menu{
  private String typeMenu;
  private int prix;
  private String nomMenu;
  private int numR;

  public Menu(String typeMenu, int prix, String nomMenu, int numR){
    this.typeMenu = typeMenu;
    this.prix = prix;
    this.nomMenu = nomMenu;
    this.numR = numR;
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

  public int getNumR(){
    return this.numR;
  }
  
  public void setNumR(int numR){
    this.numR = numR;
  }

  void affecter(int idEnfant, String nomMenu, int numR){
    // TODO
  }
}