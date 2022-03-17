package model;
import java.util.Date;

public class Moyendepaiement{
  private String nom;
  private String prenom;
  private String adresseDeFacturation;
  private int numCarte;
  private Date dateExpiration;
  private int cryptogramme;



  public Moyendepaiement(String nom, String prenom, String adresseDeFacturation, int numCarte, Date dateExpiration, int cryptogramme){
    this.nom = nom;
    this.prenom = prenom;
    this.adresseDeFacturation = adresseDeFacturation;
    this.numCarte = numCarte;
    this.dateExpiration = dateExpiration;
    this.cryptogramme = cryptogramme;
    
  }

  public String getNom(){
    return this.nom;
  }
  public void setNom(String nom){
    this.nom = nom ;
  }

  public String getPrenom(){
    return this.prenom;
  }
  public void setPrenom(String prenom){
    this.prenom = prenom ;
  }

  public String getAdresseDeFacturation(){
    return adresseDeFacturation;
  }
  public void seDAdresseDeFacturation(String adresseDeFacturation){
    this.adresseDeFacturation = adresseDeFacturation ;
  }
 
  public int getNumCarte(){
    return this.numCarte;
  }
    public void setNumCarte(int numCarte){
    this.numCarte = numCarte ;
  }

  public Date getDateExpiration(){
    return this.dateExpiration;
  } 
  public void setDateExpiration(Date dateExpiration){
    this.dateExpiration = dateExpiration ;
  }

  public int getCryptogramme(){
    return this.cryptogramme ;
  }
 
  
  public void setCryptogramme(int cryptogramme){
     this.cryptogramme = cryptogramme;
  }


  // parametre constructeur
  String payerParCarte(){
    // TODO
    return "";
  }
  
  void payerParCheque(){
    // TODO
  }

  void payer(){
    // TODO
  }
}

