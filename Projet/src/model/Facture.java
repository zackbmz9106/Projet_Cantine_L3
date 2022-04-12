package model;
//import java.util.Date;

public class Facture{
  private int num;
  private int montant;
  private Date dateF;
  private Reservation reservation;

  
  public Facture(){
  this.num = genNumFacture();
  }
  
  public Facture(Reservation reservation){
    this.num = genNumFacture();
    this.montant = reservation.getPrixReservation();
    this.dateF = reservation.getDateReservation();
  }

/////////////////////////////////////////// Getter /////////////////////////////////////////////////////////////////////////////

  public int getNum(){
    return this.num;
  }

  public int getMontant(){
    return this.montant;
  }

  public Date getDateF(){
    return this.dateF;
  }

/////////////////////////////////////////// Setter /////////////////////////////////////////////////////////////////////////////

   public void setNum(int num){
    this.num = num;
  }

  public void setMontant(int montant){
     this.montant = montant;
  }

  public void setDateF(Date dateF){
     this.dateF = dateF;
  }

  public int genNumFacture(){ // génére un numero de facture 
  int Min = 1;
  int Max = 1000;
  int numF;
  numF = Min + (int)(Math.random() * ((Max - Min) + 1));
  return numF;
  
  }


  public void consulterFacture(){
    System.out.println("Numéro de facture: "+getNum());
    System.out.println("Montant: "+getMontant()+" euros");
    System.out.println("Date de la facture: "+getDateF());
  }

}