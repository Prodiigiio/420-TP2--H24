
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

    public void push(Gardien nouveauGardien){
        adapterCapacite();
        embaucherGardien(nouveauGardien);
    }

    public Gardien pop(){
        if(getNbElements() == 0) return null;
        Gardien gardienRecent = gardiens[getNbElements() -1];
        gardiens[getNbElements() -1] = null;
        nbElements--;
        return gardienRecent;
    }

    private void adapterCapacite() {
        if(!(nbElements == capacite)) return;
        Gardien[] gardienAgrandi = new Gardien[getCapacite() * RATION_AGRANDISEMENT];
        for (int i = 0; i < gardiens.length; i++) {
            gardienAgrandi[i] = getGardiens()[i];
        }
        this.gardiens = gardienAgrandi;
    }

    private void embaucherGardien( Gardien leNouveau){
        for (int i = 0; i < getGardiens().length; i++) {
            if(getGardiens()[i] == null) {
                getGardiens()[i] = leNouveau;
                nbElements++;
                return;
            }
        }
    }

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
