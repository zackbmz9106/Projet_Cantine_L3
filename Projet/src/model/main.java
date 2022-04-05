package model;
import java.util.Date;
import java.text.SimpleDateFormat;

public class main {
    public static void main(String[] args) {
       
        Compte compte = new Compte(1,"samy",545,060);

       int numR = compte.PrendreUneReservation("01/10/2000", "normal", "samy");
       System.out.println("voici votre numero de reservation"+ " " +numR);

       Moyendepaiement mp = new Moyendepaiement("nom", "prenom", "adresseDeFacturation", 1455436789781756L,new java.util.Date(),135);
       mp.payerParCarte(mp.getNumCarte(),mp.getDateExpiration(),mp.getCryptogramme());
        System.out.println(mp.getDateExpiration());

       Moyendepaiement.dateIsValid("21/09/2026");
              
    }
}