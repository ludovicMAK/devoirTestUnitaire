package Entities.Exo1;

public class Cuve extends Captage
{

private int largeur;
private int longueur;

    public Cuve(int idCaptage, String nom, int hauteur, int debitMax,int largeur,int longueur) {
        super(idCaptage, nom, hauteur, debitMax);
        this.largeur = largeur;
        this.longueur = longueur;
    }


    public String getDescription() {
        return super.getDescription()+"- longueur "+this.longueur+"- largeur"+this.largeur;
    }

    public double getVolume(){
        return super.getHauteur()*super.getDebitMax()*this.longueur*this.largeur;
    }

}
