package Entities.Exo1;

public class Forage extends Captage implements IVolume
{
    private int diametre;


    public Forage(int idCaptage, String nom, int hauteur, int debitMax, int diametre) {
        super(idCaptage, nom, hauteur, debitMax);
        this.diametre = diametre;
    }

    public String getDescription(){
        return super.getDescription()+"- diamètre"+this.diametre;
    }
    public double getVolume(){
      return super.getHauteur()*super.getDebitMax()*this.diametre;
    }
}
