package model;
import java.util.ArrayList;
//import java.util.Date;
//import java.util.Random.*;

public class Compte {
  private int id;
  private String nom;
  private String prenom;
  private String adresse;
  private String mail;
  private String mdp;
  private int quotientF;
  private Long numTel;
  private ArrayList<Enfant> listEnfant = new ArrayList<>(); // Liste des enfants rattacher a un compte 

  public Compte(int id,String nom, int quotientF,Long numTel){
    this.id = id;
    this.nom = nom;
    this.quotientF = quotientF;
    this.numTel = numTel;
  }

  /*public Compte(String nom, String prenom ,Long numTel, String adresse, String Email, String mdp){ // constructeur appele lors de l'inscription
    this.nom = nom;
    this.prenom = prenom;
    this.numTel = numTel;
    this.adresse = adresse;
    this.mail = Email;
    this.mdp = mdp;
    
  }*/

  public Compte(String nom, String prenom ,Long numTel, String adresse, String Email, String mdp){ // constructeur appele lors de l'inscription
  this.nom = nom;
  this.prenom = prenom;
  this.numTel = numTel;
  this.adresse = adresse;
  this.mail = Email;
  this.mdp = mdp;
  //this.listEnfant;
  
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

  public Long getNumTel(){
    return this.numTel;
  }

  public void setID(int id){
    this.id = id;
  }

  public void setNom(String nom){
    this.nom = nom;
  }

  public void setQuotientF(int quotientF){
    this.quotientF = quotientF;
  }

  public void setNumTel(Long numTel){
    this.numTel = numTel;
  }

  public ArrayList<Enfant> getEnfantCompte(){
    return this.listEnfant;
  }

  public void setEnfantCompte(Enfant enfant){
    this.listEnfant.add(enfant);
  }

  public void suppEnfantCompte(Enfant enfant){
    this.listEnfant.remove(enfant);
  }


  public int PrendreUneReservation(String date, Menu menu, Enfant enfant, Moyendepaiement mp){
   
      if(mp.payerParCarte()){ // Si paiement valide
      
        Reservation reservation = new Reservation(menu,date);
      
        Facture facture = new Facture(reservation);// creation de la facture 
        facture.consulterFacture();

        reservation.changementStatut(reservation.getStatus(),reservation.getnumReservation());// mise a jour du statut de la reservation 
        //reservation.setStatus(statut);
      
        menu.affecter(enfant, menu, reservation);
      
        System.out.println("Rerservation "+reservation.getStatus()+" du "+reservation.getNomMenu()+" pour "+reservation.getEnfant().getPrenom()+": votre numéro de réservation est le "+reservation.getnumReservation());
        System.out.println("Le "+ menu.getNomMenu()+" a ete reserve par "+ menu.getListDesReservation());
        System.out.println(enfant.getListReservation());
      
        return reservation.getnumReservation();
      } 
    
    System.out.println("Reservation non valide");
    return 0;
  }
    

  public void seConnecter() { 
     //verifier dans la BDD si le compte existe 
  }   

  public void seDeconnecter() { 
    System.exit(0);
  }


  public int calculPrix(){ //determine le prix du repas en fonction du quotient familiale
    int prixCalculer = 5;
    
    if(quotientF<=20000){
      prixCalculer = 1;
      return prixCalculer;
    }
    if(quotientF<=30000){
      prixCalculer = 2;
      return prixCalculer;
    }
    if(quotientF<=40000){
      prixCalculer = 3;
      return prixCalculer;
    }
    System.out.println("Calcul du prix");
    return prixCalculer;
  }
 
  void voirCalendrier(int idEnfant){
    // TODO
  }

  /*public verifCompte(){

  }*/
  public ArrayList<Enfant> afficheList(ArrayList<Enfant> enfantList){
    String nom="";
    String prenom="";
    String sexe="";
    /*for(Enfant e :enfantList){
       //nom = e.getNom();
       //prenom = e.getPrenom();
       //sexe = e.getSexe();
    }*/
  return enfantList;//nom+" "+prenom+" "+sexe;
  }


  public ArrayList<String> enfantListString(){
        
        ArrayList<String> list = new ArrayList<>();
        for(Enfant enfant : getEnfantCompte()){
            list.add(enfant.toString());
              
        }
    return list;
    }

  public String toString(){
    String n = System.getProperty("line.separator");
    return "Nom: "+nom+n+"  Prénom: "+prenom+n+"    NumTel: "+numTel+n+"      Adresse: "+adresse+n+"        Mail: "+mail+n+"          Mdp: "+mdp+n+"            Enfants: "+listEnfant;
  }


}