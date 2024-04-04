package Employes;

import Captivite.ClassificationAnimale;

public class Veterinaire {
    private String nom;
    private ClassificationAnimale specialiste;

    public Veterinaire(String nom, ClassificationAnimale specialiste){
        setNom(nom);
        setSpecialiste(specialiste);
    }

    public String getNom() {
        return nom;
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
}
