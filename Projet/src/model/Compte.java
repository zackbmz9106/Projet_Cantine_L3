package model;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random.*;

public class Compte {
  private int id;
  private String nom;
  private String prenom;
  private String adresse;
  private String mail;
  private String mdp;
  private int quotientF;
  private int numTel;
  private ArrayList<Enfant> listEnfant; // Liste des enfants rattacher a un compte 

  public Compte(int id,String nom, int quotientF,int numTel){
    this.id = id;
    this.nom = nom;
    this.quotientF = quotientF;
    this.numTel = numTel;
  }

  public Compte(String nom, String prenom ,int numTel, String adresse, String Email, String mdp){ // constructeur appele lors de l'inscription
    this.nom = nom;
    this.nom = prenom;
    this.numTel = numTel;
    this.adresse = adresse;
    this.mail = Email;
    this.mdp = mdp;
    
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

  public int getNumTel(){
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

  public void setNumTel(int numTel){
    this.numTel = numTel;
  }


  public int PrendreUneReservation(String date, Menu menu, Enfant enfant, Moyendepaiement mp){
   
      if(mp.payerParCarte()){ // Si paiement valide
      
        Reservation reservation = new Reservation(menu,date);
      
        Facture facture = new Facture(reservation);// creation de la facture 
        //numFacture = facture.genNumFacture();// génére un numero de facture
        //facture.setNum(numFacture);
        //facture.setMontant(menu.getPrix());
        //facture.setDateF(reservation.getDateReservation());
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
    System.out.println("la cantine sera cher pour toi petit riche");
    return prixCalculer;
  }
 
  void voirCalendrier(int idEnfant){
    // TODO
  }


}