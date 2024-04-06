package ca.cal.tp2.GestionDonnees;

import ca.cal.tp2.Visiteur;

public class File {
    private Noeud premier;
    private int nbElements;

    public void setPremier(Noeud premier) {
        this.premier = premier;
    }

    public File(){
        this.nbElements = 0;
    }
    public boolean estVide(){
        return nbElements != 0;
    }

    public void ajouter(Visiteur visiteur) {
        Noeud nouveauNoeud = new Noeud(visiteur);
        if (estVide()) {
            premier = nouveauNoeud;
        } else {
            getDernierNoeud().setSuivant(nouveauNoeud);
        }
    }

    public Noeud pop(){
        if (estVide()) return null;
        Noeud courant = premier;
        premier = premier.getSuivant();
        return courant;
    }

    private Noeud getDernierNoeud() {
        Noeud courant = premier;
        while (courant.getSuivant() != null) {
            courant = courant.getSuivant();
        }
        return courant;
    }

    public void ajoutPriorite(Visiteur visiteur){
        Noeud visiteurPrioritaire = new Noeud(visiteur);
        visiteurPrioritaire.setSuivant(premier);
        setPremier(visiteurPrioritaire);
    }
}
