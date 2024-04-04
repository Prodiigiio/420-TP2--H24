package ca.cal.tp2.GestionDonnees;

import ca.cal.tp2.Employes.Gardien;

public class Pile {
    private final int TAILLE_INITIALE = 4;
    private final int RATION_AGRANDISEMENT = 2;

    private Gardien[] gardiens;
    private int nbElements;
    private int capacite;

    public Pile(){
        setNbElements(0);
        setCapacite(TAILLE_INITIALE);
        this.gardiens = new Gardien[TAILLE_INITIALE];
    }

    public Gardien[] getGardiens() {
        return gardiens;
    }

    public int getNbElements() {
        return nbElements;
    }

    public void setNbElements(int nbElements) {
        this.nbElements = nbElements;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}
