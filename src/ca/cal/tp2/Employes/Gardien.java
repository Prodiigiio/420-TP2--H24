package ca.cal.tp2.Employes;

public class Gardien {
    private String nom;
    private int competence;
    private static int idGenerale = 1000;
    private int id;

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
}
