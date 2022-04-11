package model;

public class Date {
    
    private int jours;
    private int mois;
    private int annee;

    public Date(int jours, int mois, int annee){
        this.jours = jours;
        this.mois = mois;
        this.annee = annee;
    }

    public String toString(){
        return jours+"/"+mois+"/"+annee;
    }

}
