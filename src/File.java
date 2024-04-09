public class File {
    private Noeud premier;
    private int nbElements;
    public File(){
        this.nbElements = 0;
    }

    public void setPremier(Noeud premier) {
        this.premier = premier;
    }


    public boolean estVide(){
        return nbElements == 0;
    }

    public void ajouter(Visiteur visiteur) {
        Noeud nouveauNoeud = new Noeud(visiteur);
        if (estVide()) {
            setPremier(nouveauNoeud);
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

    @Override
    public String toString() {
        String file = "";
        Noeud courrant = premier;
        while (courrant != null){
            file += (courrant.getSuivant() + " -> ");
            courrant = courrant.getSuivant();
        }
        return file;
    }
}
