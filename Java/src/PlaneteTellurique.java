public class PlaneteTellurique extends Planete implements Habitable {

    int totalVisiteurs = 0;
    Vaisseau vaisseauAccoste;
    public PlaneteTellurique(String nom) {
        super(nom);
    }

    public Vaisseau accueillirVaisseau(Vaisseau vaisseau){
        totalVisiteurs+=vaisseau.nbPassagers;

        if (vaisseau instanceof  VaisseauDeGuerre){
            ((VaisseauDeGuerre)vaisseau).desactiverArmes();
        }

        if (vaisseauAccoste == null) {
            System.out.println("Aucun vaisseau ne s'en va.");
        } else
            System.out.println("Un vaisseau de type " + vaisseauAccoste.type + " doit s'en aller.");
        Vaisseau vaisseauPrecedent= vaisseauAccoste;
        vaisseauAccoste= vaisseau;
        return vaisseauPrecedent;
    }
}