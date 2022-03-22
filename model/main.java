package model; 

public class main {
    public static void main(String[] args) {
        System.out.println("Hello World ca v");

       
        Compte compte = new Compte(1,"samy",545,060);

       int numR = compte.PrendreUneReservation("01/10/2000", "normal", "samy");
       System.out.println("voici cotre numero de reservation"+ " " +numR);

    }
}