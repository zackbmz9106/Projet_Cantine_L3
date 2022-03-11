package model;
import java.util.Date;

public class Facture{
  private int num;
  private int montant;
  private Date dateF;

  public Facture(int num, int montant, Date dateF){
    this.num = num;
    this.montant = montant;
    this.dateF = dateF;
  }

  public int getNum(){
    return this.num;
  }

  public int getMontant(){
    return this.montant;
  }

  public Date getDateF(){
    return this.dateF;
  }

  public void consulterFacture(int num, Date dateF){
    // TODO
  }
}