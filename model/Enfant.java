package model;

public class Enfant{
  private int idEnfant;
  private int idParent;
  private String nom;
  private String prenom;
  // on devrait créer un type sexe qui aurait 3 valeurs a prendre
  // masculain, feminin, non-binaire
  private String sexe;
  private boolean handicap;

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
}