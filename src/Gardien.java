public class Gardien {
    private String nom;
    private int competence;
    private static int idGenerale = 1000;
    private int id;
    private String sexe;

    public Gardien(String nom, int competence){
        setNom(nom);
        setCompetence(competence);
        setId();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCompetence() {
        return competence;
    }

    public void setCompetence(int competence) {
        this.competence = competence;
    }

    public int getId() {
        return id;
    }

    /**
     * Chaque nouveau gardien obtien un ID unique
     */
    public void setId() {
        idGenerale++;
        this.id = idGenerale;
    }

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

    @Override
    public String toString() {
        return "[" + getNom() + " " + "(" + getId() + ")" + ", " + getCompetence() + "]";
    }
}
