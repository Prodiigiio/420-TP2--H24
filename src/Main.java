import Employes.Gardien;
import Employes.Veterinaire;
import Captivite.*;

// Classe principale représentant la gestion du zoo
public class Main {
    public static void main(String[] args) {
        // Création de vétérinaires
        Veterinaire drSmith = new Veterinaire("Dr. Smith", ClassificationAnimale.Poisson);
        Veterinaire drPatel = new Veterinaire("Dr. Patel", ClassificationAnimale.Cetace);
        Veterinaire drGrandbois = new Veterinaire("Dr. Grandbois", ClassificationAnimale.Oiseau);
        Veterinaire drSkelgaard = new Veterinaire("Dr. Skelgaard", ClassificationAnimale.Mammifere);
        Veterinaire drLyding = new Veterinaire("Dr. Lyding", ClassificationAnimale.Reptile);
        // Création de gardiens
        Gardien mSmith = new Gardien("M. Smith", 10);
        Gardien mPatel = new Gardien("M. Patel", 5);
        Gardien mmeGrandbois = new Gardien("Mme. Grandbois", 15);
        Gardien mmeSkelgaard = new Gardien("Mme. Skelgaard", 10);
        Gardien mmeLyding = new Gardien("Mmm. Lyding", 20);
        // Création des animaux
        Animal simba = new Animal("Simba", "carnivore", 150, ClassificationAnimale.Mammifere, "lion");
        Animal zara = new Animal("Zara", "herbivore", 150, ClassificationAnimale.Mammifere, "zèbre");
        Animal neptune = new Animal("Neptune", "carnivore", 150, ClassificationAnimale.Cetace, "dauphin");
        Animal flipper = new Animal("Flipper", "carnivore", 150, ClassificationAnimale.Cetace, "marsouin");
        Animal polly = new Animal("Polly", "omnivore", 150, ClassificationAnimale.Oiseau, "perroquet");
        Animal apollo = new Animal("Apollo", "omnivore", 150, ClassificationAnimale.Oiseau, "corneille");
        Animal spike = new Animal("Spike", "carnivore", 150, ClassificationAnimale.Poisson, "thon");
        Animal finn = new Animal("Finn", "piscivore", 150, ClassificationAnimale.Poisson, "saumon");
        Animal monty = new Animal("Monty", "carnivore", 150, ClassificationAnimale.Reptile, "python");
        Animal jaws = new Animal("Jaws", "carnivore", 150, ClassificationAnimale.Reptile, "alligator");
        // Création d'enclos
        Enclos[] lesEnclos = new Enclos[ClassificationAnimale.values().length];
        lesEnclos[ClassificationAnimale.Poisson.ordinal()] = new Enclos("Les Poissons", 3, drSmith, mSmith);
        lesEnclos[ClassificationAnimale.Cetace.ordinal()] = new Enclos("Les Cétacés", 3, drPatel, mPatel);
        lesEnclos[ClassificationAnimale.Reptile.ordinal()] = new Enclos("Les Reptiles", 3, drLyding, mmeLyding);
        lesEnclos[ClassificationAnimale.Oiseau.ordinal()] = new Enclos("Les Oiseaux", 3, drGrandbois, mmeGrandbois);
        lesEnclos[ClassificationAnimale.Mammifere.ordinal()] = new Enclos("Les Mammifères", 3, drSkelgaard, mmeSkelgaard);

        // Ajout d'animaux aux enclos
        lesEnclos[ClassificationAnimale.Poisson.ordinal()].ajouterAnimaux(new Animal[] {spike, finn});
        lesEnclos[ClassificationAnimale.Cetace.ordinal()].ajouterAnimaux(new Animal[] {neptune, flipper});
        lesEnclos[ClassificationAnimale.Reptile.ordinal()].ajouterAnimaux(new Animal[] {monty, jaws});
        lesEnclos[ClassificationAnimale.Mammifere.ordinal()].ajouterAnimaux(new Animal[] {simba, zara});
        lesEnclos[ClassificationAnimale.Oiseau.ordinal()].ajouterAnimaux(new Animal[] {polly, apollo});

        // Création du zoo avec des enclos
        Zoo granby = new Zoo("Granby");
        granby.ajouterEnclos(lesEnclos);

        // Quatre visiteurs à l'ouverture
        Visiteur alice = new Visiteur("Alice",13,new String[]{"saumon", "lion", "zèbre"} );
        Visiteur edith = new Visiteur("Édith" , 56,new String[]{"perroquet", "lion"});
        Visiteur robert = new Visiteur("Robert", 65,new String[]{"python"});
        Visiteur edgar = new Visiteur("Edgar", 70,new String[]{"marsouin", "dauphin"});
        // Ajout des visiteurs dans la file du zoo
        granby.arriveeVisiteur(alice);
        granby.arriveeVisiteur(robert);
        granby.arriveeVisiteur(edith);
        granby.arriveeVisiteur(edgar);

        // Visites du zoo
        System.out.println("=======================LE ZOO AVANT LES VISITES=======================");
        // On congédie un gardien
        granby.retirerGardien();
        // Qu'on remplace tout de suite
        granby.ajouterGardien(new Gardien("M. Bourassa", 10));
        System.out.println(granby);
        System.out.println("=======================ON DÉBUTE LES VISITES=======================");
        visiterZoo(granby);
        System.out.println("=======================ON TERMINE LES VISITES=======================");
        granby.retirerGardien();
        granby.retirerGardien();
        granby.retirerGardien();
        System.out.println("=======================LE ZOO APRÈS LES VISITES=======================");
        System.out.println(granby);
    }
    public static void visiterZoo(Zoo zoo) {
        // Simuler des actions dans le zoo
        while (!zoo.getFileVisiteurs().estVide()) {
            Visiteur visiteur = zoo.retirerVisiteur();
            Entree entree = new Entree(visiteur, zoo);
            System.out.println("L'entrée de " + visiteur + " coûte " + entree.getPrix() + "$");
            entree.afficherEnclos();
            visiteur.entrerDansZoo(zoo);
            for (int i = 0; i < entree.getNombreEnclos(); i++) {
                visiteur.entrerDansEnclo(entree.getEnclos()[i]);
                System.out.println("Nombre total d'animaux dans l'enclos : " + entree.getEnclos()[i].getNombreAnimaux());
                for (int j = 0; j < entree.getEnclos()[i].getNombreAnimaux(); j++) {
                    Animal animal = entree.getEnclos()[i].getAnimaux()[j];
                    boolean onVisiteCetAnimal = false;
                    for (String s : visiteur.getEspeces())
                        if (s.equals(animal.getEspece()))
                            onVisiteCetAnimal = true;
                    if (onVisiteCetAnimal) {
                        System.out.println("\t" + animal);
                        Gardien g = entree.getEnclos()[i].getGardien();
                        Veterinaire v = entree.getEnclos()[i].getVeterinaire();
                        g.entrainerAnimal(animal, Math.random() * 60);
                        System.out.println("\tNouveau poids: " + String.format("%.1f", animal.getPoids()));
                        v.soignerAnimal(animal);
                        System.out.println("\tNouveau besoin alimentaire: " + String.format("%.1f", animal.getBesoinAlimentaire()));
                    }
                }
                visiteur.quitterEnclo(entree.getEnclos()[i]);
            }
            visiteur.quitterZoo();
        }
    }
}




