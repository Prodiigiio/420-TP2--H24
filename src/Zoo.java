public class Zoo{
    private String nom;
    private Pile pileGardiens;
    private File fileVisiteurs;
    private int nombreEnclos;
    private int[] lesEnclos = new int[nombreEnclos];
    int nombreTotalAnimaux;

    public Zoo(String nom) {
        setNom(nom);
        setPileGardiens(getPileGardiens());
        setFileVisiteurs(getFileVisiteurs());
        setNombreEnclos(getNombreEnclos());
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

    public int getNombreEnclos() {
        return nombreEnclos;
    }

    public void setNombreEnclos(int nombreEnclos) {
        this.nombreEnclos = nombreEnclos;
    }

    public int[] getLesEnclos() {
        return lesEnclos;
    }

    public void setLesEnclos(int[] lesEnclos) {
        this.lesEnclos = lesEnclos;
    }

    public int getNombreTotalAnimaux() {
        return nombreTotalAnimaux;
    }

    public void setNombreTotalAnimaux(int nombreTotalAnimaux) {
        this.nombreTotalAnimaux = nombreTotalAnimaux;
    }
}