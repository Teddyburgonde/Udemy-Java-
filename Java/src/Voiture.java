public class Voiture extends Vehicule implements Vidangeable{
    static int nbRoues=4;
    int nbPortes=5;
    TypeBoiteVitesse typeBoite;
    String couleur;
    Integer rapportCourant;

    Voiture(){

    }
    Voiture(String couleur){
        this.couleur=couleur;
        System.out.println("Une voiture est en cours de creation");
    }
    Voiture(int nbPortes){
        this.nbPortes=nbPortes;
        System.out.println("Une voiture est construire avec le nombre de portes");
    }
    Voiture(String carburation, int nbCylindres){
        Moteur moteur = new Moteur();
        moteur.carburation=carburation;
        moteur.nbCylindres=nbCylindres;
    }

    int passerRapport(boolean augmenter){
        if(augmenter) {
            rapportCourant++;
        } else {
            rapportCourant--;
        }
        return rapportCourant;
    }
    static void tourner(boolean droite, int angle){
        String droiteOuGauche=null;
        if (droite) {
            droiteOuGauche = "droite";
        } else {
            droiteOuGauche="gauche";
        }
        System.out.println("La voiture va touner à "+droiteOuGauche+" d'un angle de "+angle +" degrés");
    }

    Ville transporter (Passager passager, Ville villeDeDepart, Ville... villeEtapes){
        System.out.println("La voiture transporte u passager qui s'appelle "+passager.prenom+" "+passager.nom);
        System.out.println("Le passager est parti de la ville de "+villeDeDepart.nom);

        Ville villeDeDestination=new Ville();
        villeDeDestination.nom="Wellington";

        return villeDeDestination;
    }

    @Override
    public void vidanger() {

    }

}


