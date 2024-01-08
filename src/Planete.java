public class Planete {
    String nom;
    String matiere;
    long diametre;
    int nbTotalHumains;
    Atmosphere atmosphere;
    Vaisseau vaisseauActuellementAcoste;

    static String forme="Spherique";
    static int nbPlanetesDecouvertes;

    Planete(String nom){
        this.nom=nom;
        nbPlanetesDecouvertes++;
    }

    static String expansion(double distance){
        if (distance<14){
            return ("Oh la la mais c'est super rapide");
        }
        else {
            return ("Je reve ou c'est plus rapide que la lumiere");
        }
    }
    public int revolution(int angle){
        return angle/360;


    }
    public int rotation(int angle){
        return angle/360;

    }

    Vaisseau accueillirVaisseau(Vaisseau vaisseau){
        nbTotalHumains=nbTotalHumains+ vaisseau.nbPassagers;
        if (vaisseauActuellementAcoste==null) {
            System.out.println("aucun vaisseau ne s'en va.");
        }
        else {
            System.out.println("Un vaisseau de type "+vaisseauActuellementAcoste.type+" doit s'en aller");
        }
        Vaisseau vaisseauPrecedent=vaisseauActuellementAcoste;
        vaisseauActuellementAcoste=vaisseau;
        return vaisseauPrecedent;
    }






}

