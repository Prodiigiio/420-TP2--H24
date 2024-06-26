public class Visiteur {
    private String nom;
    private int age;
    private int nombreAnimaux;
    private String[] especes;

    /**
     * le constructeur de la classe
     * @param nom pour initialiser le nom
     * @param age pour initialiser l'age
     * @param especes pour initialiser les especes
     */
    public Visiteur(String nom, int age, String[] especes){
        setNom(nom);
        setAge(age);
        setEspeces(especes);
    }

    /**
     * getter pour le nom
     * @return le nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * setter pour le nom
     * @param nom dont on veut changer
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * getter pour l'age
     * @return l'age
     */
    public int getAge() {
        return age;
    }

    /**
     * setter pour l'age
     * @param age dont on veut changer
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * getter pour l'espece
     * @return l'espece
     */
    public String[] getEspeces() {
        return especes;
    }

    /**
     * setter pour l'espece
     * @param especes dont on veut changer
     */
    public void setEspeces(String[] especes) {
        this.especes = especes;
    }

    /**
     * Affiche le visiteur qui entre dans le zoo
     * @param zoo en question
     */
    public void entrerDansZoo(Zoo zoo){
        System.out.println("Le visiteur " + getNom() + " est entré dans le zoo " + zoo.getNom());
    }

    /**
     * Affiche le visiteur qui entre dans l'enclo
     * @param enclo en question
     */
    public void entrerDansEnclo(Enclos enclo){
        System.out.println("Le visiteur " + getNom() + " est entré dans l'enclo " + enclo.getNom());
    }

    /**
     * Affiche le visiteur qui quitte le zoo
     */
    public void quitterZoo(){
        System.out.println("Le visiteur " + getNom() + " est sorti du zoo");
    }

    /**
     * Affiche le visiteur qui quitte l'enclo
     * @param enclo en question
     */
    public void quitterEnclo(Enclos enclo){
        System.out.println("Le visiteur " + getNom() + " est sorti de l'enclo " + enclo.getNom());
    }

    /**
     * Affiche les informations du visiteur
     * @return les informations du visiteur
     */
    @Override
    public String toString() {
        return "[" + getNom() + ", " + getAge() + "]";
    }
}
