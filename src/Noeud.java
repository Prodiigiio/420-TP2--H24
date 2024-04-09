public class Noeud {
    private Visiteur valeur;
    private Noeud suivant;

    /**
     * Constructeur de la classe
     * @param valeur pour initialiser la valeur
     */
    public Noeud(Visiteur valeur){
        setValeur(valeur);
        setSuivant(null);
    }

    /**
     * Getter pour la valeur
     * @return la valeur
     */
    public Visiteur getValeur() {
        return valeur;
    }

    /**
     * Setter pour la valeur
     * @param valeur dont on veut changer
     */
    public void setValeur(Visiteur valeur) {
        this.valeur = valeur;
    }

    /**
     * Getter pour le prochain noeud
     * @return le prochain noeud
     */
    public Noeud getSuivant() {
        return suivant;
    }

    /**
     * Setter pour le prochain noeud
     * @param suivant (prochain noeud) dont on veut changer
     */
    public void setSuivant(Noeud suivant) {
        this.suivant = suivant;
    }

    /**
     * Affiche le noeud
     * @return le noeud
     */
    @Override
    public String toString() {
        return "[" + valeur.getNom() + ", " + valeur.getAge() + "]";
    }
}
