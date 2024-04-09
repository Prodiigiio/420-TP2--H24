public class Veterinaire {
    private String nom;
    private Classe specialiste;

    /**
     * le constructeur de la classe
     * @param nom pour initialiser le nom
     * @param specialiste pour initialiser le specialiste
     */
    public Veterinaire(String nom, Classe specialiste){
        setNom(nom);
        setSpecialiste(specialiste);
    }

    /**
     * getter pour le nom
     * @return le nom
     */
    public String getNom() {
        return "Dr. " + nom;
    }

    /**
     * setter pour le nom
     * @param nom dont on veut changer
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * getter pour le specialiste
     * @return le specialiste
     */
    public Classe getSpecialiste() {
        return specialiste;
    }

    /**
     * setter pour le specialiste
     * @param specialiste dont on veut changer
     */
    public void setSpecialiste(Classe specialiste) {
        this.specialiste = specialiste;
    }

    /**
     * soigner l'animal
     * @param animal dont on veut soigner
     */
    public void soignerAnimal(Animal animal){
        if (animal.getClassificationAnimale() == getSpecialiste()){
            System.out.println("Le veterinaire " + getNom() + " soigne l'animal " + animal.getNom());
        } else {
            System.out.println("Le veterinaire " + getNom() + " ne peut pas soigner l'animal " + animal.getNom());
        }
    }

    /**
     * Affiche le veterinaire
     * @return le veterinaire
     */
    @Override
    public String toString() {
        return "[" + getNom() + ", " + getSpecialiste() + "]";
    }
}
