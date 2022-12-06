public class PlaneteTellurique extends Planete  {

    Vaisseau[] vaisseauxAccostes;

    public PlaneteTellurique(String nom, int tailleBaie) {
        super(nom);
        this.vaisseauxAccostes=new Vaisseau[tailleBaie];
    }

    boolean restePlaceDisponible(){
        for (int index =0; index< vaisseauxAccostes.length; index++){
            if (vaisseauxAccostes[index]== null) {
                return true;
            }
        }
        return false;
    }

    public void accueillirVaisseau(Vaisseau vaisseau) {

        if (vaisseau instanceof VaisseauDeGuerre) {
            ((VaisseauDeGuerre) vaisseau).desactiverArmes();
        }
        totalVisiteurs = totalVisiteurs + vaisseau.nbPassagers;
        for (int index = 0; index < vaisseauxAccostes.length; index++) {
            if (vaisseauxAccostes[index] == null) {
                vaisseauxAccostes[index] = vaisseau;
                break;
            }
        }
    }
}