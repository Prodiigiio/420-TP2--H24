public class Enclos {
    private String nom;
    private int nombreAnimaux;
    private int capaciteMax;
    private Animal[] animaux;
    private Veterinaire veterinaire;
    private Gardien gardien;

    /**
     * le constructeur de classe
     * @param nom pour initialiser le nom
     * @param capaciteMax pour initialiser la capacité maximale
     * @param veterinaire pour initialiser le veterinaire
     * @param gardien pour initialiser le gardien
     */
    public Enclos(String nom, int capaciteMax, Veterinaire veterinaire, Gardien gardien){
        setNom(nom);
        setCapaciteMax(capaciteMax);
        setVeterinaire(veterinaire);
        setGardien(gardien);
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
     * Getter pour le capacitée maximale
     * @return la capacité maximale
     */
    public int getCapaciteMax() {
        return capaciteMax;
    }

/**
     * Setter pour la capacité maximale
     * @param capaciteMax dont on veut changer
     */
    public void setCapaciteMax(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    /**
     * Getter pour le gardien
     * @return le gardien ou null au cas où il n'y a pas de gardien
     */
    public Gardien getGardien() {
        if(gardien == null) return null;
        return gardien;
    }

    /**
     * Setter pour le gardien
     * @param gardien dont on veut changer
     */
    public void setGardien(Gardien gardien) {
        this.gardien = gardien;
    }

    /**
     * Getter pour le vétérinaire
     * @return le vétérinaire
     */
    public Veterinaire getVeterinaire() {
        return veterinaire;
    }

    /**
     * Setter pour le vétérinaire
     * @param veterinaire dont on veut changer
     */
    public void setVeterinaire(Veterinaire veterinaire) {
        this.veterinaire = veterinaire;
    }

    /**
     * Ajouter un animal dans l'enclos
     * @param lesAnimaux dont on veut ajouter (tableau d'animaux)
     */
    public void ajouterAnimaux(Animal[] lesAnimaux){
        if (lesAnimaux.length -1 > getCapaciteMax()) return;
        setAnimaux(lesAnimaux);
    }

    /**
     * Getter pour le nombre d'animaux
     * @return le nombre d'animaux
     */
    public int getNombreAnimaux() {
        return nombreAnimaux;
    }

    /**
     * Getter pour les animaux
     * @return les animaux
     */
    public Animal[] getAnimaux() {
        return animaux;
    }

    /**
     * Setter pour les animaux
     * @param animaux dont on veut changer
     */
    public void setAnimaux(Animal[] animaux) {
        this.animaux = animaux;
    }

    /**
     * Méthode pour afficher les informations de l'enclos
     * @return les informations de l'enclos
     */
    @Override
    public String toString() {
        String resultat = "Enclos " + getNom() + " est peuplé avec " + getNombreAnimaux() + " animaux. Sa capacité est de " + getCapaciteMax() + " animaux. "
                + "Le vétérinaire assigné est " + getVeterinaire().getNom() + ". Le gardien actuel est " + getGardien().getNom() + ".";
       resultat += ("Les animaux dans cet enclos: ");
        for (Animal animal : getAnimaux()){
            resultat += ("--- Le " + animal.getClassificationAnimale() + " nommé " + animal.getNom() + " pèse" + animal.getPoids() + " kg et son besoin alimentaire " + animal.getBesoinAlimentaire() + " de kg \n");
        }
        return resultat;
    }
}
