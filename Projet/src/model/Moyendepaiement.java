package model;
import java.util.*;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.ResolverStyle;

public class Moyendepaiement{
  private String nom;
  private String prenom;
  private String adresseDeFacturation;
  private long numCarte;
  private String dateExpiration;
  //private Date dateExpiration;
  private int cryptogramme;



  public Moyendepaiement(String nom, String prenom, String adresseDeFacturation, long numCarte, String dateExpiration, int cryptogramme){
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
 
  public long getNumCarte(){
    return this.numCarte;
  }
    public void setNumCarte(int numCarte){
    this.numCarte = numCarte ;
  }

  public String getDateExpiration(){
    return this.dateExpiration;
  } 
  public void setDateExpiration(String dateExpiration){
    this.dateExpiration = dateExpiration ;
  }

  public int getCryptogramme(){
    return this.cryptogramme ;
  }
 
  
  public void setCryptogramme(int cryptogramme){
     this.cryptogramme = cryptogramme;
  }


  // parametre constructeur
  public boolean payerParCarte(){
    /*numCarte = this.numCarte;
    dateExpiration = this.dateExpiration;
    cryptogramme = this.cryptogramme;*/
    
    if(Math.floor(Math.log10(numCarte) + 1) < 16){
      System.out.println("numéro de carte incorrecte");
      return false;
    }
    
    if(Math.floor(Math.log10(numCarte + 1)) > 16){
      System.out.println("numéro de carte incorrecte");
      return false;
    }
    
    if(Math.floor(Math.log10(numCarte) + 1) == 16){
      System.out.println("numéro de carte correcte");
    }
    
    if(dateIsValid(dateExpiration)){
    }
    else{
      return false;
    }
     /*if(){
        verifier si ma date est expire
     }*/
     
    if(Math.floor(Math.log10(cryptogramme) + 1) < 3){
      System.out.println("cryptogramme incorrecte");
      return false;
    }
    if(Math.floor(Math.log10(cryptogramme) + 1) > 3){
      System.out.println("cryptogramme incorrecte");
      return false;
    }
   
    return true;
  }  
  
  void payerParCheque(){
    // TODO
  }

  void payer(){
    // TODO
  }
  
  
  public static boolean dateIsValid(String date){
   // Définir le format date préféré
   //SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
   //format.setLenient(false);
   DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/uuuu", Locale.FRANCE).withResolverStyle(ResolverStyle.STRICT);
   try
   {
       format.parse(date); 
       System.out.println(date+" est une date valide");
   }
   // Date invalide
   catch (Exception e)
   {
       System.out.println(date+" est une date invalide");
       return false;
   }
   // Renvoie true si la date est valide
   return true;
  }
  
  /*public static boolean dateIsValid(String datestr, String format){
    SimpleDateFormat df = new SimpleDateFormat(format);
    if(Date date = df.parse(datestr)){
        return true;
    }
  }*/
}