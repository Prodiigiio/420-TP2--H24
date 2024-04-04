package ca.cal.tp2.GestionDonnees;
import ca.cal.tp2.Visiteur;

public class Noeud {
    private Visiteur valeur;
    private Noeud suivant;

    public Noeud(Visiteur valeur){
        setValeur(valeur);
        setSuivant(null);
    }

    public Visiteur getValeur() {
        return valeur;
    }

    public void setValeur(Visiteur valeur) {
        this.valeur = valeur;
    }

    public Noeud getSuivant() {
        return suivant;
    }

    public void setSuivant(Noeud suivant) {
        this.suivant = suivant;
    }

    @Override
    public String toString() {
        return "[" + valeur.getNom() + ", " + valeur.getAge() + "]";
    }
}
