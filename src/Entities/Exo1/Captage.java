package Entities.Exo1;

public class Captage implements Comparable<Captage> {

    private int idCaptage;
    private String nom;
    private int hauteur;
    private int debitMax;


    public Captage(int idCaptage, String nom, int hauteur, int debitMax) {
        this.idCaptage = idCaptage;
        this.nom = nom;
       this.hauteur =hauteur;
        this.debitMax = debitMax;

    }

    @Override
    public int compareTo(Captage unCaptage) {
        int debitMaximum = unCaptage.debitMax;

        if(this.debitMax > unCaptage.debitMax){
            debitMaximum = this.debitMax;
        }
        return debitMaximum;
    }
    public String getDescription(){
        return this.nom+"-"+this.hauteur+" mètres -"+this.debitMax+" litres";
    }
    public int getIdCaptage(){
        return this.idCaptage;
    }

    public String getNom() {
        return nom;
    }

    public int getHauteur() {
        return hauteur;
    }

    public int getDebitMax() {
        return debitMax;
    }
}
