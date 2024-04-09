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

    /**
     * getter pour l'espèce
     * @return l'espèce
     */
    public String getEspece() {
        return espece;
    }

    /**
     * getter pour le poids de l'animal
     * @return le poids de l'animal
     */
    public double getPoids() {
        return poids;
    }

    /**
     * getter pour le besoin alimentaire
     * @return le besoin alimentaire
     */
    public double getBesoinAlimentaire() {
        return besoinAlimentaire;
    }

    public void besoinAlimentaire() {
        switch (getClassificationAnimale()) {
            case Poisson:
                this.besoinAlimentaire = getPoids() * 0.01; // Piscivore
                break;
            case Cetace:
            case Mammifere:
                this.besoinAlimentaire = getPoids() * 0.05; // Carnivore
                break;
            case Reptile:
                this.besoinAlimentaire = getPoids() * 0.03; // Herbivore
                break;
            case Oiseau:
                this.besoinAlimentaire = getPoids() * 0.02; // Omnivore
                break;
            default:
                this.besoinAlimentaire = 0;
        }
    }

    /**
     * getter pour le nom
     * @return le nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * setter pour le nom
     * @param nom dont on veut changer
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * setter pour le régime alimentaire
     * @param regimeAlimentaire dont on souhaite changer
     */
    public void setRegimeAlimentaire(String regimeAlimentaire) {
        this.regimeAlimentaire = regimeAlimentaire;
    }

    /**
     * setter pour le poids de l'animal
     * @param poids dont on souhaite changer
     */
    public void setPoids(double poids) {
        this.poids = poids;
    }

    /**
     * getter pour la classification animale
     * @return la classification animale
     */
    public Classe getClassificationAnimale() {
        return classe;
    }

    /**
     * setter pour la classification animale
     * @param classe dont on souhaite changer
     */
    public void setClassificationAnimale(Classe classe) {
        this.classe = classe;
    }



    /**
     * setter pour l'espèce
     * @param espece dont on souhaite changer
     */
    public void setEspece(String espece) {
        this.espece = espece;
    }



    /**
     * Affichage des informations de l'animal
     * @return les informations de l'animal
     */
    @Override
    public String toString() {
            return ("--- Le " + getClassificationAnimale() + " nommé " + getNom() + " pèse " + getPoids() + "kg et son besoin alimentaire " + getBesoinAlimentaire() + " de kg \n");
    }
}
