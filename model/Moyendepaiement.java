package model;
import java.util.Date;

public class Moyendepaiement{
  private String nom;
  private String prenom;
  private String addresseDeFacturatuion;
  private int numCarte;
  private Date dateExpiration;
  private int cryptogramme;
  private boolean isDiffere;
  private date dateDiffere;

  public MoyenDePaiement(String nom, String prenom, String addresseDeFacturatuion, int numCarte, Date dateExpiration, int cryptogramme, boolean isDiffere, Date dateExpiration){
    this.nom = nom;
    this.prenom = prenom;
    this.addresseDeFacturatuion = addresseDeFacturatuion;
    this.numCarte = numCarte;
    this.dateExpiration = dateExpiration;
    this.cryptogramme = cryptogramme;
    this.isDiffere = isDiffere;
    this.dateDiffere = dateDiffere;
  }

  public String getNom(){
    return this.nom;
  }

  public String getPrenom(){
    return this.prenom;
  }

  public String getAddresseDeFacturatuion(){
    return addresseDeFacturatuion;
  }

  public int getNumCarte(){
    return this.numCarte;
  }

  public date getDateExpiration(){
    return this.dateExpiration;
  } 

  public int getCryptogramme(){
    return this.cryptogramme;
  }

  public boolean isDiffere(){
    return this.isDiffere;
  }

  public date getDateDiffere(){
    return this.dateDiffere;
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