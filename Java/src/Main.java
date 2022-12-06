import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        PlaneteTellurique mercure = new PlaneteTellurique("mercure", 1);
        PlaneteTellurique venus = new PlaneteTellurique("venus", 2);
        PlaneteTellurique terre = new PlaneteTellurique("terre", 10);
        PlaneteTellurique mars = new PlaneteTellurique("mars", 3);
        PlaneteGazeuse uranus = new PlaneteGazeuse("uranus");
        PlaneteGazeuse jupiter = new PlaneteGazeuse("saturne");
        PlaneteGazeuse saturne = new PlaneteGazeuse("jupiter");
        PlaneteGazeuse neptune = new PlaneteGazeuse("neptune");

        mercure.diametre = 4880;
        venus.diametre = 12100;
        terre.diametre = 12756;
        mars.diametre = 6792;
        uranus.diametre = 51118;
        saturne.diametre = 120536;
        jupiter.diametre = 142984;
        neptune.diametre = 49532;

        Vaisseau chasseur = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        chasseur.nbPassagers = 12;
        Vaisseau fregate = new VaisseauDeGuerre(TypeVaisseau.FREGATE);
        fregate.nbPassagers = 24;
        Vaisseau croiseur = new VaisseauDeGuerre(TypeVaisseau.CROISEUR);
        croiseur.nbPassagers = 5;
        Vaisseau cargo = new VaisseauDeGuerre(TypeVaisseau.CARGO);
        cargo.nbPassagers = 6;
        Vaisseau vaisseauMonde = new VaisseauCivil(TypeVaisseau.VAISSEAUMONDE);
        vaisseauMonde.nbPassagers = 25;

        Scanner sc = new Scanner(System.in);
        String recommencer;
        do {
            System.out.println("Quel Vaisseau souhaiter vous mapipulez ?");
            String vaisseauSelectionne = sc.nextLine();
            System.out.println("Sur quelle planete tellurique vous souhaitez atterir ? MERCURE ? VENUS ? TERRE ? MARS ?");
            String planeteTelluriqueSelectionne = sc.nextLine();
            System.out.println("Quel est le tonnage de cargaison que vous souhaitez embarquer ?");
            int tonnageSelectionne = sc.nextInt();
            sc.nextLine();
            TypeVaisseau typeVaisseau = TypeVaisseau.valueOf(vaisseauSelectionne);
            Vaisseau vaisseau = null;
            switch (typeVaisseau) {
                case CHASSEUR:
                    vaisseau = chasseur;
                    break;
                case FREGATE:
                    vaisseau = fregate;
                    break;
                case CROISEUR:
                    vaisseau = croiseur;
                    break;
                case CARGO:
                    vaisseau = cargo;
                    break;
                case VAISSEAUMONDE:
                    vaisseau = vaisseauMonde;
                    break;
            }
            PlaneteTellurique planete = null;
            switch (planeteTelluriqueSelectionne) {
                case "MERCURE":
                    planete = mercure;
                    break;
                case "VENUS":
                    planete = venus;
                    break;
                case "TERRE":
                    planete = terre;
                    break;
                case "MARS":
                    planete = mars;
                    break;
            }
            if (!planete.restePlaceDisponible()) {
                System.out.println("Le vaisseau ne peut pas se poser sur la planète par manque de place dans la baie.");
            } else {
                planete.accueillirVaisseau(vaisseau);
                int rejet = vaisseau.emporterCargaison(tonnageSelectionne);
                System.out.println("le tonnage est de " + rejet);
            }
            System.out.println("Voulez vous recommencer oui ou non ?");
            recommencer = sc.nextLine();
        } while (recommencer.equalsIgnoreCase("oui"));
    }
}
        /*
        Atmosphere atmosphereUranus=new Atmosphere();
        atmosphereUranus.tauxHydrogene= new Float(83f);
        atmosphereUranus.tauxHelium= new Float(15f);
        atmosphereUranus.tauxMethane= new Float(5f);
        atmosphereUranus.tauxAzote= new Float(0.0f);

        uranus.atmosphere=atmosphereUranus;

        System.out.println("L'atmosphère de Uranus est composée :");
        if (uranus.atmosphere.tauxHydrogene != null){
            System.out.println("A " + uranus.atmosphere.tauxHydrogene + " % d'hydrogène.");
        }
        if (uranus.atmosphere.tauxArgon != null){
            System.out.println("A " + uranus.atmosphere.tauxArgon + " % d'Argon.");
        }
        if (uranus.atmosphere.tauxDioxyde != null){
            System.out.println("A " + uranus.atmosphere.tauxDioxyde + " % d'ioxyde de carbonne.");
        }
        if (uranus.atmosphere.tauxAzote != null){
            System.out.println("A " + uranus.atmosphere.tauxAzote + " % d'Azote.");
        }
        if (uranus.atmosphere.tauxHelium != null){
            System.out.println("A " + uranus.atmosphere.tauxHelium + " % d'helium");
        }
        if (uranus.atmosphere.tauxMethane != null){
            System.out.println("A " + uranus.atmosphere.tauxMethane + " % Methane.");
        }
        if (uranus.atmosphere.tauxSodium != null){
            System.out.println("A " + uranus.atmosphere.tauxSodium + " % Sodium.");
        }
    */

