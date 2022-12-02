
public class Vaisseau {
    String type;
    int nbPassagers;
    int resistanceDuBouclier;
    int blindage;

    void activerBouclier(){
        System.out.println("Activation du bouclier d'un vaisseau de type "+type+".");
    }

    void desactiverBouclier(){
        System.out.println("Désactivation du bouclier d'un vaisseau de type "+type+".");
    }

}
