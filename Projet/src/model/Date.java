package model;

import java.time.LocalDate;

public class Date {
    
    private int jours;
    private int mois;
    private int annee;
    private LocalDate date;
    private String dateString;
    
    public Date(int jours, int mois, int annee){
        this.jours = jours;
        this.mois = mois;
        this.annee = annee;
    }

    public Date(LocalDate value, String dateString) {
        this.date = value;
        this.dateString = dateString;

    }

    public String getDate(){
        return this.date.toString();
    }

    public LocalDate getDateL(){
        return this.date;
    }

    public void setDateString(String dateString){
        this.dateString = dateString;
    }

    public String toString(){
        //return date.toString();
        return dateString;
    }

}
