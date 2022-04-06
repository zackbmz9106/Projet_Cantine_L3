package model;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random.*;

import model.Reservation.Statuts;

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
   int numFacture;
   Statuts statut = null;
      //nomMenu = Menu.getNomMenu();
      if(mp.payerParCarte()){ // Si paiement valide
      
      Reservation reservation = new Reservation(menu,date);
      
      Facture facture = new Facture(reservation);// creation de la facture 
      //numFacture = facture.genNumFacture();// génére un numero de facture
      //facture.setNum(numFacture);
      //facture.setMontant(menu.getPrix());
      //facture.setDateF(reservation.getDateReservation());
      facture.consulterFacture();

      statut = reservation.changementStatut(statut,reservation.getnumReservation());
      reservation.setStatus(statut);// mise a jour du statut de la reservation 
      
      menu.affecter(enfant, menu, reservation);
      
      System.out.println("Rerservation "+reservation.getStatus()+" du menu "+reservation.getNomMenu()+" pour "+reservation.getEnfant().getPrenom()+": votre numéro de réservation est le "+reservation.getnumReservation());
      System.out.println("Le menu "+ menu.getNomMenu()+" a ete reserve par "+ menu.getListDesReservation());
      System.out.println(enfant.getListReservation());
      
      return reservation.getnumReservation();
      } 
    
      System.out.println("Reservation non valide");
    return 0;
  }
    /*
    vérifier que le paiement à été effectué pour générer le numéro de resevation
     --> appel d'une méthode pour confirmer le paiement
     if(paiementValide = true){
       génerer un numReservation
     }
    */

  public void seConnecter() { 
    // verifier dans la BDD si le compte existe 
  }   

  public void seDeconnecter() { 
    System.exit(0);
  }


  void reserver(String nom_menu,Date date){
    // TODO
  }
 
  void voirCalendrier(int idEnfant){
    // TODO
  }


}