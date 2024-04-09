public class Entree {
    private int nombreEnclos;
    private Enclos[] lesEnclos;
    private double prix;
    private Visiteur visiteur;
    private Zoo zoo;

    /**
     * le constructeur de classe
     * @param visiteur pour initialiser le visiteur
     * @param zoo pour initialiser le zoo
     */
    public Entree(Visiteur visiteur, Zoo zoo) {
        setVisiteur(visiteur);
        setZoo(zoo);
        setNombreEnclos(nbEnclosAccessibles());
        setPrix(billeterie());
    }


    /**
     * getter pour le nombre d'enclos
     * @return le nombre d'enclos
     */
    public int getNombreEnclos() {
        return nombreEnclos;
    }

    /**
     * setter pour le nombre d'enclos
     * @param nombreEnclos dont on veut changer
     */
    public void setNombreEnclos(int nombreEnclos) {
        this.nombreEnclos = nombreEnclos;
    }

    /**
     * getter pour les enclos
     * @return les enclos
     */
    public Enclos[] getEnclos() {
        return lesEnclos;
    }

    /**
     * Getter pour le prix
     * @return le prix
     */
    public double getPrix() {
        return prix;
    }

    /**
     * Setter pour le prix
     * @param prix dont on veut changer
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }

    /**
     * Setter pour les enclos
     * @param visiteur
     */
    public void setVisiteur(Visiteur visiteur) {
        this.visiteur = visiteur;
    }



    /**
     * Setter pour le zoo
     * @param zoo dont on veut changer
     */
    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    /**
     * Getter pour les enclos contenant au moins un gardien
     * @return un enclos sécurisé, donc accessible
     */
    private Enclos[] getEnclosSecure(){

        int enclosAvecGardien = 0;
        for (Enclos enclos : zoo.getLesEnclos()){
            if (enclos.getGardien() != null){
                enclosAvecGardien++;
            }
        }
        Enclos[] enclosAccessibles = new Enclos[enclosAvecGardien];
        int i = 0;
        for(Enclos enclos : zoo.getLesEnclos()){
            if(enclos.getGardien() != null){
                enclosAccessibles[i] = enclos;
                i++;
            }
        }
        return enclosAccessibles;
    }

    /**
     * Méthode pour compter le nombre d'enclos accessibles
     * @return le nombre d'enclos accessibles
     */
    private int nbEnclosAccessibles(){
        return getEnclosSecure().length;
    }

    /**
     * Méthode pour calculer le prix du billet à la billeterie
     * @return le prix de la billeterie
     */
    private double billeterie(){
        int nombreAnimaux = zoo.getNombreTotalAnimaux();
        double prixInitial = getNombreEnclos() * 10;
        double surchargeAnimal = nombreAnimaux;

        if(visiteur.getAge() < 12){
            return 0.0;
        } else {
            return (prixInitial + surchargeAnimal) * 0.5;
        }
    }

    /**
     * Méthode pour afficher les enclos accessibles
     */
    public void afficherEnclos(){
        System.out.println("Les enclos accessibles pour " + visiteur.getNom() + " sont : ");
        Enclos[] enclos = getEnclos();
        for(Enclos enclo : enclos){
            System.out.println(enclo.getNom());
        }
    }
}
