public class File {
    private Noeud premier;
    private int nbElements;
    public File(){
        this.nbElements = 0;
    }

    /**
     * Setter pour le premier
     * @param premier pour le premier noeud
     */
    public void setPremier(Noeud premier) {
        this.premier = premier;
    }


    /**
     * vérifie si la file est vide
     * @return vrai (0) si il n'y a pas d'éléments dans la file
     *        faux (1 ou plus) si il y a des éléments dans la file
     */
    public boolean estVide(){
        return nbElements == 0;
    }

    /**
     * Ajoute un visiteur à la file
     * @param visiteur
     */
    public void ajouter(Visiteur visiteur) {
        Noeud nouveauNoeud = new Noeud(visiteur);
        if (estVide()) {
            setPremier(nouveauNoeud);
        } else {
            getDernierNoeud().setSuivant(nouveauNoeud);
        }
    }

    /**
     * Retire un visiteur de la file
     * @return le visiteur retiré
     */
    public Noeud pop(){
        if (estVide()) return null;
        Noeud courant = premier;
        premier = premier.getSuivant();
        return courant;
    }

    /**
     * Retourne le dernier noeud de la file
     * @return le dernier noeud
     */
    private Noeud getDernierNoeud() {
        Noeud courant = premier;
        while (courant.getSuivant() != null) {
            courant = courant.getSuivant();
        }
        return courant;
    }

    /**
     * Ajoute un visiteur prioritaire à la file (avant les autres visiteurs)
     * @param visiteur en question
     */
    public void ajoutPriorite(Visiteur visiteur){
        Noeud visiteurPrioritaire = new Noeud(visiteur);
        visiteurPrioritaire.setSuivant(premier);
        setPremier(visiteurPrioritaire);
    }

    /**
     * Affiche la file
     * @return la file
     */
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
