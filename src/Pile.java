
public class Pile {
    private final int TAILLE_INITIALE = 4;
    private final int RATION_AGRANDISEMENT = 2;

    private Gardien[] gardiens;
    private int nbElements;
    private int capacite;

    /**
     * le constructeur de classe
     */
    public Pile(){
        setNbElements(0);
        setCapacite(TAILLE_INITIALE);
        this.gardiens = new Gardien[TAILLE_INITIALE];
    }

    /**
     * Getter pour les gardiens
     * @return les gardiens
     */
    public Gardien[] getGardiens() {
        return gardiens;
    }

    /**
     * Getter pour le nombre d'éléments
     * @return le nombre d'éléments
     */
    public int getNbElements() {
        return nbElements;
    }

    /**
     * Setter pour le nombre d'éléments
     * @param nbElements dont on veut changer
     */
    public void setNbElements(int nbElements) {
        this.nbElements = nbElements;
    }

    /**
     * Getter pour la capacité
     * @return la capacité
     */
    public int getCapacite() {
        return capacite;
    }

    /**
     * Setter pour la capacité
     * @param capacite dont on veut changer
     */
    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    /**
     * Méthode pour enlever le gardien le plus récent
     * @return le gardien le plus récent
     */
    public Gardien pop(){
        if(getNbElements() == 0) return null;
        Gardien gardienRecent = gardiens[getNbElements() -1];
        gardiens[getNbElements() -1] = null;
        nbElements--;
        return gardienRecent;
    }

    /**
     * Méthode pour augmenter la capacité de la pile au cas où il n'y a plus de place
     */
    private void adapterCapacite() {
        if(!(nbElements == capacite)) return;
        Gardien[] gardienAgrandi = new Gardien[getCapacite() * RATION_AGRANDISEMENT];
        for (int i = 0; i < gardiens.length; i++) {
            gardienAgrandi[i] = getGardiens()[i];
        }
        this.gardiens = gardienAgrandi;
    }

    /**
     * Méthode pour embaucher un nouveau gardien
     * @param leNouveau gardien à embaucher
     */
    private void embaucherGardien( Gardien leNouveau){
        for (int i = 0; i < getGardiens().length; i++) {
            if(getGardiens()[i] == null) {
                getGardiens()[i] = leNouveau;
                nbElements++;
                return;
            }
        }
    }

    /**
     * Méthode pour afficher la pile
     * @return la pile affichée
     */
    @Override
    public String toString() {
        String pile = gardiens.length + " gardiens" + "(capacité" + getNbElements() + "): ";
        for (int i = 0; i < getNbElements(); i++) {
            if(gardiens[i] != null){
                pile += getGardiens()[i].toString();

            } else{
                pile += "[null] ";
            }
        }
        return pile;
    }
}
