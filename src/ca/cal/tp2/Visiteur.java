package ca.cal.tp2;

import ca.cal.tp2.Captivite.Enclos;
import ca.cal.tp2.Captivite.Zoo;

public class Visiteur {
    private String nom;
    private int age;
    private int nombreAnimaux;
    private String[] especes;

    public Visiteur(String nom, int age, String[] especes){
        setNom(nom);
        setAge(age);
        setEspeces(especes);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //public int getNombreAnimaux() {
      //  return nombreAnimaux;
    //}

    public void setNombreAnimaux(int nombreAnimaux) {
        this.nombreAnimaux = nombreAnimaux;
    }

    public String[] getEspeces() {
        return especes;
    }

    public void setEspeces(String[] especes) {
        this.especes = especes;
    }

    public void entrerDansZoo(Zoo zoo){

    }

    public void entrerDansEnclo(Enclos enclo){

    }
    public void quitterZoo(){

    }

    public void quitterEnclo(Enclos enclo){

    }
}
