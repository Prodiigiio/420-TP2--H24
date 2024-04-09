public class Animal {
    private String nom;
    private String regimeAlimentaire;
    private double poids;
    private Classe classe;
    private String espece;

    private double besoinAlimentaire;

    public Animal(String nom, String  regimeAlimentaire, double poids,
                  Classe classe, String espece){
        setNom(nom);
        setRegimeAlimentaire(regimeAlimentaire);
        setPoids(poids);
        setClassificationAnimale(classe);
        setEspece(espece);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRegimeAlimentaire() {
        return regimeAlimentaire;
    }

    public void setRegimeAlimentaire(String regimeAlimentaire) {
        this.regimeAlimentaire = regimeAlimentaire;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public Classe getClassificationAnimale() {
        return classe;
    }

    public void setClassificationAnimale(Classe classe) {
        this.classe = classe;
    }

    public String getEspece() {
        return espece;
    }

    public void setEspece(String espece) {
        this.espece = espece;
    }

    public double getBesoinAlimentaire() {
        return besoinAlimentaire;
    }

    public void setBesoinAlimentaire(double besoinAlimentaire) {
        this.besoinAlimentaire = besoinAlimentaire;
    }

    @Override
    public String toString() {
            return ("--- Le " + getClassificationAnimale() + " nommé " + getNom() + " pèse " + getPoids() + "kg et son besoin alimentaire " + getBesoinAlimentaire() + " de kg \n");
    }
}
