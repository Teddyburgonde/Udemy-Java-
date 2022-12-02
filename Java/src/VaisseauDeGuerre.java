public class VaisseauDeGuerre extends Vaisseau{
    boolean armesDesactivees;
    void attaque(Vaisseau vaisseauCible, String arme, int dureeAttaque) {
        if (armesDesactivees) {
            System.out.println("Attaque impossible, l'armement est désactivé.");
        } else {
            System.out.println("Un vaisseau de type " + type + " attaque un vaisse de " + vaisseauCible + " en utilisatant l'arme " + arme + " pendant " + dureeAttaque + " minutes.");
            vaisseauCible.resistanceDuBouclier = 0;
            vaisseauCible.blindage = vaisseauCible.blindage / 2;
        }
    }
    void desactiverArmes(){
        System.out.println("Désactivation des armes d'un vaisseau de type " +type);
        armesDesactivees = true;
    }
}

