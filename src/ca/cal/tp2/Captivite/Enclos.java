package ca.cal.tp2.Captivite;

import ca.cal.tp2.Employes.Gardien;
import ca.cal.tp2.Employes.Veterinaire;

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


}
