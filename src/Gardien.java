public class Gardien {
    private String nom;
    private int competence;
    private static int idGenerale = 1000;
    private int id;

    /**
     * le constructeur de classe
     * @param nom pour initialiser le nom
     * @param competence pour initialiser la compétence
     */
    public Gardien(String nom, int competence){
        setNom(nom);
        setCompetence(competence);
        setId();
    }

    /**
     * Getter pour le nom
     * @return le nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour le nom
     * @param nom dont on veut changer
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour la compétence
     * @return la compétence
     */
    public int getCompetence() {
        return competence;
    }

    /**
     * Setter pour la compétence
     * @param competence dont on veut changer
     */
    public void setCompetence(int competence) {
        this.competence = competence;
    }

    /**
     * Getter pour l'Identificateur
     * @return l'Identificateur
     */
    public int getId() {
        return id;
    }

    /**
     * Setter pour l'Identificateur
     * Chaque nouveau gardien obtien un identificateur unique
     */
    public void setId() {
        idGenerale++;
        this.id = idGenerale;
    }

    /**
     * Méthode qui déduit le poid de l'animal selon le temps d'entrainement
     * @param animal est question
     * @param temps écoulé entre chaque entrainement
     */
    public void entrainerAnimal(Animal animal, double temps) {
        double poids = animal.getPoids();
        if (temps < 10) {
            animal.setPoids(poids + (poids * 0.01));
        } else if (temps >= 10 && temps <= 30) {
            animal.setPoids(poids - (poids * 0.02));
        } else {
            animal.setPoids(poids - (poids * 0.05));
        }
    }

    /**
     * Méthode pour afficher les informations du gardien
     * @return les informations du gardien
     */
    @Override
    public String toString() {
        return "[" + getNom() + " " + "(" + getId() + ")" + ", " + getCompetence() + "]";
    }
}
