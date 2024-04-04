package ca.cal.tp2.Captivite;

import ca.cal.tp2.GestionDonnees.File;
import ca.cal.tp2.GestionDonnees.Noeud;
import ca.cal.tp2.GestionDonnees.Pile;
import ca.cal.tp2.Visiteur;

public class Zoo{
    private String nom;
    private Pile pileGardiens;
    private File fileVisiteurs;
    private final int NOMBRE_ENCLOS = 5;
    private Enclos[] lesEnclos = new Enclos[NOMBRE_ENCLOS];
    int nombreTotalAnimaux;

    /**
     * le constructeur de classe
     * @param nom pour le nom
     */
    public Zoo(String nom) {
        setNom(nom);
        setPileGardiens(getPileGardiens());
        setFileVisiteurs(getFileVisiteurs());
        setLesEnclos(getLesEnclos());
        setNombreTotalAnimaux(getNombreTotalAnimaux());
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Pile getPileGardiens() {
        return pileGardiens;
    }

    public void setPileGardiens(Pile pileGardiens) {
        this.pileGardiens = pileGardiens;
    }

    public File getFileVisiteurs() {
        return fileVisiteurs;
    }

    public void setFileVisiteurs(File fileVisiteurs) {
        this.fileVisiteurs = fileVisiteurs;
    }

    public int getNOMBRE_ENCLOS() {
        return NOMBRE_ENCLOS;
    }

    public Enclos[] getLesEnclos() {
        return lesEnclos;
    }

    public void setLesEnclos(Enclos[] lesEnclos) {
        this.lesEnclos = lesEnclos;
    }

    public int getNombreTotalAnimaux() {
        return nombreTotalAnimaux;
    }

    public void setNombreTotalAnimaux(int nombreTotalAnimaux) {
        this.nombreTotalAnimaux = nombreTotalAnimaux;
    }

    public boolean ajouterEnclos(Enclos[] lesEnclos){
        if(lesEnclos.length > NOMBRE_ENCLOS)  return false;
        setLesEnclos(lesEnclos);
        return true;
    }

    public void arriveeVisiteur(Visiteur visiteur){
        fileVisiteurs.ajouter(new Noeud(visiteur));
    }

}