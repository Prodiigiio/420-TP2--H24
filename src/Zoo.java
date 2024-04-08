import java.util.Arrays;

public class Zoo {
    private String nom;
    private Pile pileGardiens;
    private File fileVisiteurs;
    private final int NOMBRE_ENCLOS = 5;
    private Enclos[] lesEnclos = new Enclos[NOMBRE_ENCLOS];
    int nombreTotalAnimaux;

    /**
     * le constructeur de classe
     *
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


    public boolean ajouterEnclos(Enclos[] lesEnclos) {
        if (lesEnclos.length > NOMBRE_ENCLOS) return false;
        setLesEnclos(lesEnclos);
        return true;
    }

    public Visiteur retirerVisiteur(){
        return getFileVisiteurs().pop().getValeur();
    }

    public void arriveeVisiteur(Visiteur visiteur) {
        if(getFileVisiteurs() == null) {
            return;
        }
        if(visiteur.getAge() < 65){
            fileVisiteurs.ajouter(visiteur);
        }
        else {
            fileVisiteurs.ajoutPriorite(visiteur);
        }
    }

    public void ajouterGardien(Gardien gardien){
        Enclos[] enclosVideDeGardien = new Enclos[NOMBRE_ENCLOS];
        int i = 0;
        for(Enclos enclos : lesEnclos) {
            if(enclos.getGardien() == null){
                enclosVideDeGardien[i] = enclos;
                i++;
            }
        }
        enclosSansGardienAvecMoinsAnimaux(enclosVideDeGardien).setGardien(gardien);
    }

    private Enclos enclosSansGardienAvecMoinsAnimaux(Enclos[] enclos){
        if(enclos[0] == null) return null;
        int nbAnimaux = enclos[0].getNombreAnimaux();
        Enclos enclosAvecLeMoinsAnimaux = enclos[0];
        for (Enclos e : enclos){
            if (e.getNombreAnimaux() < nbAnimaux){
                nbAnimaux = e.getNombreAnimaux();
                enclosAvecLeMoinsAnimaux = e;
            }
        }
        if(enclosAvecLeMoinsAnimaux == null) return null;
        return enclosAvecLeMoinsAnimaux;
    }

    public Gardien retirerGardien() {
        if(getPileGardiens() == null) return null;
        if (pileGardiens.getNbElements() == 0) return null;

        Gardien gardienCongedier = getPileGardiens().pop();

        for(int i = 0; i < getLesEnclos().length; i++) {
            if (getLesEnclos()[i].getGardien().equals(gardienCongedier) && gardienCongedier.getCompetence() >= 20) {
                return null;
            }
        }
        return gardienCongedier;
    }


}