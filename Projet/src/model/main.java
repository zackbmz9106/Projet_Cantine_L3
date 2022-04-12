package model;

import java.util.ArrayList;

public class main {
    public static void main(String [] args){
              
        //Compte compte = new Compte(1,"samy",19000,060);
    
           
        Moyendepaiement mp = new Moyendepaiement("nom", "prenom", "adresseDeFacturation", 1455436789781756L,"15/06/2025",135);
        //mp.payerParCarte();
        //System.out.println(mp.getDateExpiration());
    
        Enfant enfant = new Enfant(001, 010, "bgd", "zak", "M", false);
        Enfant enfant1 = new Enfant(010, 011, "bmz", "zakari", "M", false);
        
        Ingredients salade = new Ingredients("salade", "legumes");
        Ingredients tomate = new Ingredients("tomate", "legumes");
       
        Ingredients steak = new Ingredients("steak", "viande");
        Ingredients mousseChocolat = new Ingredients("mousseChocolat", "dessert");


        Menu menu = new Menu("viande",compte.calculPrix(),"Menu Viande");
        //Menu menu2 = new Menu("Poisson",compte.calculPrix(),"Menu Poisson",salade,steak,mousseChocolat);
        int numR = compte.PrendreUneReservation("01/10/2000", menu, enfant, mp);
                    //compte.PrendreUneReservation("03/10/2020", menu2, enfant1, mp);
        //menu.afficheIngredientsMenu();
       // menu2.afficheIngredientsMenu();
        
    
                  
        }
    }

