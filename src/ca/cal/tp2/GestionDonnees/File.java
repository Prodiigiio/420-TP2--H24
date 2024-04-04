package ca.cal.tp2.GestionDonnees;

public class File {
    private Noeud premier;
    private int nbElements;

    public File(){
        this.nbElements = 0;
    }
    public boolean estVide(){
        return nbElements != 0;
    }

    public void ajouter(Noeud nouveauNoeud) {
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
}
