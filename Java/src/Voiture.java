public class Voiture extends VehiculeAMoteur implements Vidangeable{
    int nbPortes=5;
    boolean automatique;
    String couleur;
    int rapportCourant;
    static int nbRoues=4;
    Voiture(){
        System.out.println("Une voiture est en cours de creation");
    }

    static void klaxonner(){
        System.out.println("BOOOOOOOOO");
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

    @Override
    public void vidanger() {

    }
}


