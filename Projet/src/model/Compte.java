package model;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random.*;

import model.Reservation.Statuts;

public class Compte {
  private int id;
  private String nom;
  private int quotientF;
  private int numTel;
  private ArrayList<Enfant> listEnfant []; // Liste des enfants rattacher a un compte 

  public Compte(int id,String nom, int quotientF,int numTel){
    this.id = id;
    this.nom = nom;
    this.quotientF = quotientF;
    this.numTel = numTel;
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
   int Min = 1;
   int Max = 1000;
   int numReservation;
   Statuts statut = null;
      //nomMenu = Menu.getNomMenu();
      if(mp.payerParCarte()){ // Si paiement valide
      numReservation = Min + (int)(Math.random() * ((Max - Min) + 1));
      //Reservation.setNumReservation(numReservation);
      
      Reservation reservation = new Reservation(menu.getNomMenu(),date,numReservation);
      statut = reservation.changementStatut(statut,numReservation);
      reservation.setStatus(statut);// mise a jour du statut de la reservation 
      menu.affecter(enfant, menu, reservation);
      System.out.println("Rerservation "+reservation.getStatus()+" du menu "+reservation.getNomMenu()+" pour "+reservation.getEnfant().getPrenom()+": votre numéro de réservation est le "+reservation.getnumReservation());
      System.out.println("Le menu "+ menu.getNomMenu()+" a ete reserve par "+ menu.getListDesReservation());
      System.out.println(enfant.getListReservation());
      return numReservation;
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



  public void seDeconnecter() { 
    System.exit(0);
  }


  void reserver(String nom_menu,Date date){
    // TODO
  }
 
  void voirCalendrier(int idEnfant){
    // TODO
  }


  /*public void PrendreUneReservation(String string, String nomMenu, String prenom) {
  }*/
}