public class Enclos {
    private String nom;
    private int nombreAnimaux;
    private int capaciteMax;
    private Animal[] animaux;
    private Veterinaire veterinaire;
    private Gardien gardien;

    public Enclos(String nom, int capaciteMax, Veterinaire veterinaire, Gardien gardien){
        setNom(nom);
        setCapaciteMax(capaciteMax);
        setVeterinaire(veterinaire);
        setGardien(gardien);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNombreAnimaux() {
        return nombreAnimaux;
    }

    public void setNombreAnimaux(int nombreAnimaux) {
        this.nombreAnimaux = nombreAnimaux;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public Animal[] getAnimaux() {
        return animaux;
    }

    public void setAnimaux(Animal[] animaux) {
        this.animaux = animaux;
    }

    public Veterinaire getVeterinaire() {
        return veterinaire;
    }

    public void setVeterinaire(Veterinaire veterinaire) {
        this.veterinaire = veterinaire;
    }

    public Gardien getGardien() {
        return gardien;
    }

    public void setGardien(Gardien gardien) {
        this.gardien = gardien;
    }

    public void ajouterAnimaux(Animal[] lesAnimaux){
        if (lesAnimaux.length -1 > getCapaciteMax()) return;
        setAnimaux(lesAnimaux);
    }

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
