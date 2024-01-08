public class HelloUniverse {
    public static void main(String...args) {
       Planete mercure=new Planete("Mercure");
       mercure.matiere="Tellurique";
       mercure.diametre=4880;
       Planete venus=new Planete("Venus");
       venus.matiere="Tellurique";
       venus.diametre=12100;
       Planete terre=new Planete("Terre");
       terre.matiere="Tellurique";
       terre.diametre=12756;
       Planete mars=new Planete("Mars");
       mars.matiere="Tellurique";
       mercure.diametre=6792;
       Planete jupiter=new Planete("Jupiter");
       jupiter.matiere="Gazeuse";
       jupiter.diametre=142984;
       Planete saturne=new Planete("Saturne");
       saturne.matiere="Gazeuse";
       saturne.diametre=120536;
       Planete uranus=new Planete("Uranus");
       uranus.matiere="Gazeuse";
       uranus.diametre=51118;

       Atmosphere atmosphereUranus=new Atmosphere();
       atmosphereUranus.tauxHydrogene=89f;
       atmosphereUranus.tauxHellium=15f;
       atmosphereUranus.tauxMethane=2.5f;

       uranus.atmosphere=atmosphereUranus;

       Planete neptune=new Planete("Neptune");
       neptune.matiere="Gazeuse";
       neptune.diametre=49532;

       System.out.println(jupiter.nom+"est une planete "+ jupiter.matiere+ " avec un diametre de "+ jupiter.diametre+ " kilometres.");

       Vaisseau nouveauVaisseau=new Vaisseau();
       nouveauVaisseau.type="FREGATE";
       nouveauVaisseau.nbPassagers=9;
       mars.accueillirVaisseau(nouveauVaisseau);
       Vaisseau autreVaisseau=new Vaisseau();
       autreVaisseau.type="CROISEUR";
       autreVaisseau.nbPassagers=42;
       mars.accueillirVaisseau(autreVaisseau);

      System.out.println("Le nombre d'Humains ayant deja sejourne sur mars est actuellemt de"+mars.nbTotalHumains);
      System.out.println("L'atmophere de Uranus est compose de :");
      System.out.println("A " + uranus.atmosphere.tauxHydrogene + " % d'hydrogene");
      System.out.println("A " + uranus.atmosphere.tauxMethane + " % de methane");
      System.out.println("A " + uranus.atmosphere.tauxHellium + " % d'hellium");
      System.out.println("A " + uranus.atmosphere.tauxArgon + " % d'argon");
      System.out.println("A " + uranus.atmosphere.tauxAzote+ " % d'azote");
      System.out.println("A " + uranus.atmosphere.tauxDioxydeDeCarbone + " % de dioxyde de carbone");
      System.out.println("A " + uranus.atmosphere.tauxSodium + " % de sodium");


      System.out.println("Le nombre de planetes decouverte est actuellement de "+Planete.nbPlanetesDecouvertes);
    }
}

