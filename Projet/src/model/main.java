package model;
//import java.util.Date;
//import java.text.SimpleDateFormat;

public class main {
    public static void main(String[] args) {
       
    Compte compte = new Compte(1,"samy",545,060);

       
    Moyendepaiement mp = new Moyendepaiement("nom", "prenom", "adresseDeFacturation", 1455436789781756L,"15/06/2025",135);
    //mp.payerParCarte();
    //System.out.println(mp.getDateExpiration());

    Enfant enfant = new Enfant(001, 10, "bgd", "zak", "M", false);
    Menu menu = new Menu("viande",5,"menub");

    int numR = compte.PrendreUneReservation("01/10/2000", menu, enfant, mp);
    compte.PrendreUneReservation("03/10/2000", menu, enfant, mp);
    //System.out.println("voici votre numero de reservation"+ " " +numR);
    //Reservation.setNumReservation(numR);
    //enfant.getListReservation();
    

              
    }
}