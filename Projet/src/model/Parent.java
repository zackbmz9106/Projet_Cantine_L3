package model;
public class Parent{
  private int id;
  private String nom;
  private String mail;
  private String mdp;
  private float revenus;

  public Parent(int id, String nom, String mail, String mdp, float revenus){
    this.id = id;
    this.nom = nom;
    this.mail = mail;
    this.mdp = mdp;
    this.revenus = revenus;
  }

  public int getId(){
    return this.id;
  }

  public String getNom(){
    return this.nom;
  }

  public String getMail(){
    return this.mail;
  }

  public String getMdp(){
    return this.mdp;
  }

  public float getRevenus(){
    return this.revenus;
  }
}