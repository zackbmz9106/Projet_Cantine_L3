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

  public int getPrix(){
    return this.prix;
  }

  public String getNomMenu(){
    return this.nomMenu;
  }

  public int getNumR(){
    return this.numR;
  }

  void affecter(int idEnfant, String nomMenu, int numR){
    // TODO
  }
}