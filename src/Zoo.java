public class Zoo {
    private String nom;
    private Pile pileGardiens;
    private File fileVisiteurs;
    private final int NOMBRE_ENCLOS = 5;
    private Enclos[] lesEnclos;
    int nombreTotalAnimaux;

    /**
     * le constructeur de classe
     *
     * @param nom pour le nom
     */
    public Zoo(String nom) {
        setNom(nom);
        setPileGardiens(new Pile());
        setFileVisiteurs(new File());
        setLesEnclos(new Enclos[NOMBRE_ENCLOS]);
    }

    public String getNom() {
        return nom;
    }

    /**
     * Setter pour le nom
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour la pile des gardiens
     * @return la pile de gardiens
     */
    public Pile getPileGardiens() {
        return pileGardiens;
    }

    /**
     * Setter pour la pile des gardiens
     * @param pileGardiens
     */
    public void setPileGardiens(Pile pileGardiens) {
        this.pileGardiens = pileGardiens;
    }

    /**
     * Getter pour la file des visiteurs
     * @return la file des visiteurs
     */
    public File getFileVisiteurs() {
        return fileVisiteurs;
    }

    /**
     * Setter pour la file des visiteurs
     * @param fileVisiteurs pour la file des visiteurs
     */
    public void setFileVisiteurs(File fileVisiteurs) {
        this.fileVisiteurs = fileVisiteurs;
    }

    /**
     * Getter pour les enclos
     * @return un tableau d'enclos
     */
    public Enclos[] getLesEnclos() {
        return lesEnclos;
    }

    /**
     * Setter pour les enclos
     * @param lesEnclos pour un tableau d'enclos comme paramètre
     */
    public void setLesEnclos(Enclos[] lesEnclos) {
        this.lesEnclos = lesEnclos;
    }

    /**
     * Getter pour le nombre total d'animaux
     * @return le nombre total d'animaux
     */
    public int getNombreTotalAnimaux() {
        return nombreTotalAnimaux;
    }

    /**
     * Setter pour le nombre total d'animaux
     * @param nombreTotalAnimaux pour pouvoir changer la valeur du nombre total d'animaux
     */
    public void setNombreTotalAnimaux(int nombreTotalAnimaux) {
        this.nombreTotalAnimaux = nombreTotalAnimaux;
    }


    /**
     * Méthode pour ajouter des enclos
     * @param lesEnclos les enclos en question
     * @return vrai si le nombre d'enclos est inférieur au nombre d'enclos
     *        faux si le nombre d'enclos est supérieur au nombre d'enclos
     */
    public boolean ajouterEnclos(Enclos[] lesEnclos) {
        if (lesEnclos.length > NOMBRE_ENCLOS) return false;
        setLesEnclos(lesEnclos);
        return true;
    }


    /**
     * Méthode pour retirer un visiteur
     * @return le visiteur retiré
     */
    public Visiteur retirerVisiteur(){
        return getFileVisiteurs().pop().getValeur();
    }

    /**
     * Méthode pour ajouter un visiteur
     * @param visiteur dont on doit on doit vérifier l'âge
     */
    public void arriveeVisiteur(Visiteur visiteur) {
        if(visiteur.getAge() < 65){
            fileVisiteurs.ajouter(visiteur);
        }
        else {
            fileVisiteurs.ajoutPriorite(visiteur);
        }
    }

    /**
     * Méthode pour ajouter un gardien
     * @param gardien ajouté
     */
    public void ajouterGardien(Gardien gardien){
        Enclos[] enclosVideDeGardien = new Enclos[NOMBRE_ENCLOS];
        int i = 0;
        for(Enclos enclos : lesEnclos) {
            if(enclos.getGardien() == null){
                enclosVideDeGardien[i] = enclos;
                i++;
            }
        }
         if(enclosSansGardienAvecMoinsAnimaux(enclosVideDeGardien) == null){
             return;
         }
         enclosSansGardienAvecMoinsAnimaux(enclosVideDeGardien).setGardien(gardien);
    }

    /**
     * Méthode qui trouve l'enclos sans gardien avec le moins d'animaux
     * @param enclos tableau d'enclos
     * @return l'enclos avec le moins d'animaux
     */
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

    /**
     * Méthode pour retirer un gardien
     * @return le gardien retiré
     */
    public Gardien retirerGardien() {
        if(getPileGardiens() == null) return null;
        if (pileGardiens.getNbElements() == 0) return null;

        Gardien gardienCongedier = getPileGardiens().pop();

        for(int i = 0; i < getLesEnclos().length; i++) {
            if (getLesEnclos()[i].getGardien().equals(gardienCongedier) && gardienCongedier.getCompetence() >= 20) {
                System.out.println("On ne peut pas retirer ce gardien " + gardienCongedier.getNom() + " car il a une compétence de " + gardienCongedier.getCompetence());
                return null;
            }
        }
        System.out.println("On retire le dernier gardien arrivé au zoo: " + gardienCongedier.getNom());
        return gardienCongedier;
    }

    /**
     * Méthode pour afficher le zoo
     * @return le zoo
     */
    @Override
    public String toString() {
        String zoo = "Voici la pile des gardiens: \n";
        zoo += pileGardiens.toString() + ".\n";
        zoo += "Et la file des visiteurs: \n ";
        zoo += getFileVisiteurs().toString();
        return zoo;
    }
}