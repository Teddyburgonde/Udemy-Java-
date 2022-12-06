public class VaisseauDeGuerre extends Vaisseau {
    boolean armesDesactivees;

    VaisseauDeGuerre(TypeVaisseau type) {
        this.type = type;
        if (type==TypeVaisseau.CHASSEUR) {
            tonnageMax = 0;
        } else if (type==TypeVaisseau.FREGATE) {
            tonnageMax = 50;
        } else if (type==TypeVaisseau.CROISEUR) {
            tonnageMax = 100;
        }
    }

    void attaque(Vaisseau vaisseauCible, String arme, int dureeAttaque) {
        if (armesDesactivees) {
            System.out.println("Attaque impossible, l'armement est désactivé.");
        } else {
            System.out.println("Un vaisseau de type " + type + " attaque un vaisse de " + vaisseauCible + " en utilisatant l'arme " + arme + " pendant " + dureeAttaque + " minutes.");
            vaisseauCible.resistanceDuBouclier = 0;
            vaisseauCible.blindage = vaisseauCible.blindage / 2;
        }
    }

    void activerBouclier() {
        System.out.println("Activation du bouclier d'un vaisseau de type " + type + ".");
        this.desactiverArmes();
    }

    void desactiverArmes() {
        System.out.println("Désactivation des armes d'un vaisseau de type " + type);
        armesDesactivees = true;
    }

    @Override
    int emporterCargaison(int cargaison) {
        if (type.equals("CHASSEUR")) {
            return cargaison;
        } else {
            if (nbPassagers < 12) {
                return cargaison;
            } else {
                int tonnagePassagers = 2 * nbPassagers;
                int tonnageRestant = tonnageMax - tonnageActuel;
                int tonnageAConsiderer = (tonnagePassagers < tonnageRestant ? tonnagePassagers : tonnageRestant);
                if (cargaison > tonnageAConsiderer) {
                    tonnageActuel = tonnageMax;
                    return cargaison - tonnageAConsiderer;
                } else {
                    tonnageActuel += cargaison;
                    return 0;
                }
            }
        }
    }
}