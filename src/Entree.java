public class Entree {
    private int nombreEnclos;
    private Enclos[] lesEnclos;
    private double prix;
    private Visiteur visiteur;
    private Zoo zoo;

    public Entree(Visiteur visiteur, Zoo zoo) {
        setVisiteur(visiteur);
        setZoo(zoo);
        setNombreEnclos(nbEnclosAccessibles());
        setPrix(billeterie());
    }


    public int getNombreEnclos() {
        return nombreEnclos;
    }
    public void setNombreEnclos(int nombreEnclos) {
        this.nombreEnclos = nombreEnclos;
    }

    public Enclos[] getEnclos() {
        return lesEnclos;
    }

    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Visiteur getVisiteur() {
        return visiteur;
    }
    public void setVisiteur(Visiteur visiteur) {
        this.visiteur = visiteur;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

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

    private int nbEnclosAccessibles(){
        return getEnclosSecure().length;
    }

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

    public void afficherEnclos(){
        System.out.println("Les enclos accessibles pour " + visiteur.getNom() + " sont : ");
        Enclos[] enclos = getEnclos();
        for(Enclos enclo : enclos){
            System.out.println(enclo.getNom());
        }
    }
}
