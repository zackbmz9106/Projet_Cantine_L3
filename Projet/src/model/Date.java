package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Locale;

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

    public Date(LocalDate value) {
        this.date = value;
        this.dateString = value.format(DateTimeFormatter.ofPattern("dd-MM-uuuu", Locale.FRANCE).withResolverStyle(ResolverStyle.STRICT));
    }

    public LocalDate getDateL(){
        return this.date;
    }

    public String getDateString(){
        return dateString;
    }
   
    public void setDateString(String dateString){
        this.dateString = dateString;
    }

    public String toString(){
        //return date.toString();
        return dateString;
    }

}
