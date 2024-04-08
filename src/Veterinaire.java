public class Veterinaire {
    private String nom;
    private ClassificationAnimale specialiste;

    public Veterinaire(String nom, ClassificationAnimale specialiste){
        setNom(nom);
        setSpecialiste(specialiste);
    }

    public String getNom() {
        return "Dr. " + nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ClassificationAnimale getSpecialiste() {
        return specialiste;
    }

    public void setSpecialiste(ClassificationAnimale specialiste) {
        this.specialiste = specialiste;
    }

    public void soignerAnimal(Animal animal){
        if (animal.getClassificationAnimale() == getSpecialiste()){
            System.out.println("Le veterinaire " + getNom() + " soigne l'animal " + animal.getNom());
        } else {
            System.out.println("Le veterinaire " + getNom() + " ne peut pas soigner l'animal " + animal.getNom());
        }
    }

    @Override
    public String toString() {
        return "[" + getNom() + ", " + getSpecialiste() + "]";
    }
}
