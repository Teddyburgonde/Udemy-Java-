public class Main {
    public static void main(String... args) {
        PlaneteTellurique mercure=new PlaneteTellurique("mercure");
        PlaneteTellurique venus=new PlaneteTellurique("venus");
        PlaneteTellurique terre=new PlaneteTellurique("terre");
        PlaneteTellurique mars=new PlaneteTellurique("mars");

        PlaneteGazeuse uranus =new PlaneteGazeuse("uranus");
        PlaneteGazeuse jupiter=new PlaneteGazeuse("saturne");
        PlaneteGazeuse saturne=new PlaneteGazeuse("jupiter");
        PlaneteGazeuse neptune=new PlaneteGazeuse("neptune");

        mercure.diametre=4880;
        venus.diametre=12100;
        terre.diametre=12756;
        mars.diametre=6792;
        // planètes Gazeuse
        uranus.diametre= 51118;
        saturne.diametre=120536;
        jupiter.diametre=142984;
        neptune.diametre= 49532;

        VaisseauDeGuerre chasseur = new VaisseauDeGuerre();
        chasseur.type= "CHASSEUR";
        chasseur.blindage=156;
        chasseur.resistanceDuBouclier=2;

        VaisseauCivil vaisseauMonde = new VaisseauCivil();
        vaisseauMonde.type = "VAISSEAU MONDE";
        vaisseauMonde.blindage=4784;
        vaisseauMonde.resistanceDuBouclier=30;

        vaisseauMonde.activerBouclier();
        chasseur.activerBouclier();
        chasseur.attaque(vaisseauMonde, "Laser photoniques",3);
        vaisseauMonde.desactiverBouclier();
        System.out.println("La résistance du bouclier du VAISSEAU MONDE est "+vaisseauMonde.resistanceDuBouclier);
        System.out.println("Le blindage du Vaisseau-Monde est de "+vaisseauMonde.blindage);
        mars.accueillirVaisseau(vaisseauMonde);
        mars.accueillirVaisseau(chasseur);
    }
}
