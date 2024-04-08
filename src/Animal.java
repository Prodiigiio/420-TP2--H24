public class Animal {
    private String nom;
    private String regimeAlimentaire;
    private double poids;
    private ClassificationAnimale classificationAnimale;
    private String espece;

    private double besoinAlimentaire;

    public Animal(String nom, String  regimeAlimentaire, double poids,
                  ClassificationAnimale classificationAnimale, String espece){
        setNom(nom);
        setRegimeAlimentaire(regimeAlimentaire);
        setPoids(poids);
        setClassificationAnimale(classificationAnimale);
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

    public ClassificationAnimale getClassificationAnimale() {
        return classificationAnimale;
    }

    public void setClassificationAnimale(ClassificationAnimale classificationAnimale) {
        this.classificationAnimale = classificationAnimale;
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
            return ("--- Le " + getClassificationAnimale() + " nommé " + getNom() + " pèse" + getPoids() + " kg et son besoin alimentaire " + getBesoinAlimentaire() + " de kg \n");
    }
}
